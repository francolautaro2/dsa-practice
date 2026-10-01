package dsa.ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

    @Test
    void evictsLeastRecentlyUsed() {
        LRUCache c = new LRUCache(2);
        c.put(1, 1);
        c.put(2, 2);
        assertEquals(1, c.get(1));   // ahora 2 es el LRU
        c.put(3, 3);                 // descarta 2
        assertEquals(-1, c.get(2));
        c.put(4, 4);                 // descarta 1
        assertEquals(-1, c.get(1));
        assertEquals(3, c.get(3));
        assertEquals(4, c.get(4));
    }

    @Test
    void updateDoesNotGrowAndRefreshes() {
        LRUCache c = new LRUCache(2);
        c.put(1, 1);
        c.put(2, 2);
        c.put(1, 10);                // actualiza y refresca 1
        c.put(3, 3);                 // descarta 2, no 1
        assertEquals(10, c.get(1));
        assertEquals(-1, c.get(2));
        assertEquals(3, c.get(3));
    }

    @Test
    void capacityOne() {
        LRUCache c = new LRUCache(1);
        c.put(1, 1);
        c.put(2, 2);
        assertEquals(-1, c.get(1));
        assertEquals(2, c.get(2));
    }
}
