package dsa.ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DSUTest {

    @Test
    void startsDisconnected() {
        DSU d = new DSU(4);
        assertEquals(4, d.components());
        assertFalse(d.connected(0, 1));
        assertTrue(d.connected(2, 2));
    }

    @Test
    void unionAndConnected() {
        DSU d = new DSU(5);
        assertTrue(d.union(0, 1));
        assertTrue(d.union(1, 2));
        assertTrue(d.connected(0, 2));
        assertFalse(d.connected(0, 3));
        assertEquals(3, d.components());
    }

    @Test
    void unionOfSameSetReturnsFalse() {
        DSU d = new DSU(3);
        d.union(0, 1);
        d.union(1, 2);
        assertFalse(d.union(0, 2)); // esto es "detectar un ciclo"
        assertEquals(1, d.components());
    }

    @Test
    void findReturnsSameRepresentative() {
        DSU d = new DSU(6);
        d.union(0, 1);
        d.union(2, 3);
        d.union(1, 3);
        int root = d.find(0);
        for (int x : new int[]{1, 2, 3}) assertEquals(root, d.find(x));
        assertNotEquals(root, d.find(4));
    }
}
