package dsa.ds;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MinHeapTest {

    @Test
    void popsInOrder() {
        MinHeap h = new MinHeap();
        for (int v : new int[]{5, 3, 8, 1, 9, 2}) h.push(v);
        assertEquals(6, h.size());
        assertEquals(1, h.peek());
        int[] got = new int[6];
        for (int i = 0; i < 6; i++) got[i] = h.pop();
        assertArrayEquals(new int[]{1, 2, 3, 5, 8, 9}, got);
        assertTrue(h.isEmpty());
    }

    @Test
    void handlesDuplicatesAndNegatives() {
        MinHeap h = new MinHeap();
        for (int v : new int[]{0, -3, 4, -3, 4}) h.push(v);
        int[] got = new int[5];
        for (int i = 0; i < 5; i++) got[i] = h.pop();
        assertArrayEquals(new int[]{-3, -3, 0, 4, 4}, got);
    }

    @Test
    void emptyThrows() {
        MinHeap h = new MinHeap();
        assertThrows(IllegalStateException.class, h::pop);
        assertThrows(IllegalStateException.class, h::peek);
    }

    @Test
    void matchesPriorityQueueOnRandomOps() {
        MinHeap h = new MinHeap();
        PriorityQueue<Integer> ref = new PriorityQueue<>();
        Random rnd = new Random(42);
        for (int i = 0; i < 10_000; i++) {
            if (ref.isEmpty() || rnd.nextInt(3) > 0) {
                int v = rnd.nextInt(1000) - 500;
                h.push(v);
                ref.add(v);
            } else {
                assertEquals((int) ref.poll(), h.pop());
            }
            assertEquals(ref.size(), h.size());
        }
    }
}
