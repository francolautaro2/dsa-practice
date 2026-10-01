package dsa.ds;

/**
 * Cache LRU con capacidad fija: al superarla, se descarta la clave
 * usada hace más tiempo. get y put cuentan como "uso".
 *
 * Implementalo con un HashMap (este sí podés usarlo) más tu propia
 * lista doblemente enlazada, para tener get y put en O(1).
 * Después, como ejercicio aparte, resolvelo extendiendo LinkedHashMap.
 */
public class LRUCache {

    private static class Node {
        int key, val;
        Node prev, next;
        Node(int key, int val) { this.key = key; this.val = val; }
    }

    // TODO: capacidad, mapa clave -> nodo, nodos centinela head y tail

    public LRUCache(int capacity) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Devuelve el valor o -1 si la clave no está. */
    public int get(int key) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Inserta o actualiza. Si se supera la capacidad, descarta el LRU. */
    public void put(int key, int value) {
        throw new UnsupportedOperationException("TODO");
    }
}
