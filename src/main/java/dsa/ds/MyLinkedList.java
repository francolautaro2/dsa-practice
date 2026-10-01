package dsa.ds;

/**
 * Lista simplemente enlazada de enteros. Implementala sin usar java.util.
 *
 * Complejidades esperadas:
 *   addFirst, removeFirst, size  -> O(1)
 *   addLast                      -> O(1) si mantenés un puntero a la cola
 *   get, reverse, toArray        -> O(n)
 */
public class MyLinkedList {

    private static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    // TODO: definí los campos que necesites (head, tail, size...)

    public void addFirst(int val) {
        throw new UnsupportedOperationException("TODO");
    }

    public void addLast(int val) {
        throw new UnsupportedOperationException("TODO");
    }

    /** @throws IllegalStateException si la lista está vacía */
    public int removeFirst() {
        throw new UnsupportedOperationException("TODO");
    }

    /** @throws IndexOutOfBoundsException si el índice es inválido */
    public int get(int index) {
        throw new UnsupportedOperationException("TODO");
    }

    public int size() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Invierte la lista in-place, sin crear nodos nuevos. */
    public void reverse() {
        throw new UnsupportedOperationException("TODO");
    }

    public int[] toArray() {
        throw new UnsupportedOperationException("TODO");
    }
}
