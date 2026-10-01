package dsa.ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void addAndGet() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addFirst(0);
        assertEquals(3, list.size());
        assertArrayEquals(new int[]{0, 1, 2}, list.toArray());
        assertEquals(1, list.get(1));
    }

    @Test
    void removeFirst() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(5);
        list.addLast(6);
        assertEquals(5, list.removeFirst());
        assertEquals(6, list.removeFirst());
        assertEquals(0, list.size());
        assertThrows(IllegalStateException.class, list::removeFirst);
    }

    @Test
    void addLastAfterEmptying() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.removeFirst();
        list.addLast(2);
        assertArrayEquals(new int[]{2}, list.toArray());
    }

    @Test
    void getOutOfBounds() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    @Test
    void reverse() {
        MyLinkedList list = new MyLinkedList();
        for (int i = 1; i <= 4; i++) list.addLast(i);
        list.reverse();
        assertArrayEquals(new int[]{4, 3, 2, 1}, list.toArray());
        list.addLast(0); // la cola tiene que seguir siendo correcta después de invertir
        assertArrayEquals(new int[]{4, 3, 2, 1, 0}, list.toArray());
    }

    @Test
    void reverseEmptyAndSingle() {
        MyLinkedList list = new MyLinkedList();
        list.reverse();
        assertArrayEquals(new int[]{}, list.toArray());
        list.addLast(7);
        list.reverse();
        assertArrayEquals(new int[]{7}, list.toArray());
    }
}
