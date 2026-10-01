package dsa.ds;

/**
 * Union-Find (Disjoint Set Union) sobre los elementos 0..n-1.
 * Usá path compression en find y union by rank (o by size) en union.
 *
 * Complejidad esperada: casi O(1) amortizado por operación.
 */
public class DSU {

    // TODO: definí parent[], rank[] y el contador de componentes

    public DSU(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Devuelve el representante del conjunto de x. */
    public int find(int x) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Une los conjuntos de a y b. Devuelve false si ya estaban unidos. */
    public boolean union(int a, int b) {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean connected(int a, int b) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Cantidad de componentes (conjuntos disjuntos) actuales. */
    public int components() {
        throw new UnsupportedOperationException("TODO");
    }
}
