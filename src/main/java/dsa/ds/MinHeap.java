package dsa.ds;

/**
 * Min-heap de enteros sobre un array que crece dinámicamente.
 * Implementalo sin usar java.util (ni PriorityQueue, ni ArrayList).
 *
 * Recordatorio de índices para el nodo i:
 *   padre = (i - 1) / 2, hijo izq = 2i + 1, hijo der = 2i + 2
 *
 * Complejidades esperadas:
 *   push, pop -> O(log n)   peek, size, isEmpty -> O(1)
 */
public class MinHeap {

    // TODO: definí el array interno y el tamaño

    public void push(int val) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Saca y devuelve el mínimo. @throws IllegalStateException si está vacío */
    public int pop() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Devuelve el mínimo sin sacarlo. @throws IllegalStateException si está vacío */
    public int peek() {
        throw new UnsupportedOperationException("TODO");
    }

    public int size() {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("TODO");
    }

    // Sugerencia: helpers privados siftUp(int i) y siftDown(int i)
}
