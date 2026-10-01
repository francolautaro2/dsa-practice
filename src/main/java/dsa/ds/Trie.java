package dsa.ds;

/**
 * Trie (árbol de prefijos) para palabras en minúsculas a-z.
 * Implementalo sin usar java.util: cada nodo puede tener un array de 26 hijos.
 *
 * Complejidad esperada: O(L) por operación, con L = largo de la palabra.
 */
public class Trie {

    private static class Node {
        // TODO: hijos y marca de fin de palabra
    }

    public void insert(String word) {
        throw new UnsupportedOperationException("TODO");
    }

    /** true si la palabra exacta fue insertada. */
    public boolean search(String word) {
        throw new UnsupportedOperationException("TODO");
    }

    /** true si alguna palabra insertada empieza con el prefijo. */
    public boolean startsWith(String prefix) {
        throw new UnsupportedOperationException("TODO");
    }
}
