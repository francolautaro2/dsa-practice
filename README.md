# DSA Practice (Java)

Práctica de estructuras de datos y algoritmos para entrevistas técnicas.

## Requisitos

- Java 21
- Maven 3.9+

## Cómo se usa

```bash
mvn test                                            # corre todo
mvn test -Dtest='dsa/ds/**/*Test'                   # solo las estructuras propias
mvn test -Dtest='dsa/patterns/slidingwindow/**/*Test'  # un patrón
./new.sh slidingwindow LongestSubstring             # crea un problema nuevo
```

Al principio `mvn test` falla: las clases de `ds/` y el ejemplo `TwoSum` están
vacías a propósito. Los tests ya están escritos; la idea es implementar hasta
que pasen. Lo mismo con cada problema nuevo de `new.sh`: su test falla hasta
que le agregues casos.

## Estructura

- `common/` — `ListNode` y `TreeNode` con helpers para armar casos de test.
- `ds/` — estructuras implementadas desde cero, **sin java.util**
  (excepto el `HashMap` del LRU cache).
- `patterns/` — problemas agrupados por patrón. Acá se usa la librería estándar
  libremente (`ArrayDeque`, `PriorityQueue`, `TreeMap`...).
  Cada problema tiene su clase, su test y un `.md` con notas.

## Reglas de práctica

1. Sin autocompletado de IA en este proyecto.
2. Escribir los casos de test (incluidos los bordes) antes de la solución.
3. Decir la complejidad en tiempo y espacio antes de codear.
4. Lo que no sale solo se repite desde cero a los 3 días y a la semana.
5. Un commit por problema.

## Orden de estudio

| # | Bloque | Estado |
|---|--------|--------|
| 1 | `ds/MyLinkedList` | ⬜ |
| 2 | `patterns/arrayshashing` | ⬜ |
| 3 | `patterns/twopointers` | ⬜ |
| 4 | `patterns/slidingwindow` | ⬜ |
| 5 | `patterns/stack` | ⬜ |
| 6 | `patterns/binarysearch` | ⬜ |
| 7 | `patterns/linkedlist` | ⬜ |
| 8 | `patterns/trees` | ⬜ |
| 9 | `ds/MinHeap` + `patterns/heap` | ⬜ |
| 10 | `ds/Trie` | ⬜ |
| 11 | `ds/DSU` + `patterns/graphs` | ⬜ |
| 12 | `ds/LRUCache` | ⬜ |
| 13 | `patterns/dp` | ⬜ |

## Tracker

Resultado: ✅ solo · 🟡 con pista · ❌ miré la solución

| Problema | Patrón | Fecha | Resultado | Próximo repaso |
|----------|--------|-------|-----------|----------------|
| TwoSum | arrayshashing | | | |
