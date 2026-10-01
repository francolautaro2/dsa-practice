#!/usr/bin/env bash
# Uso: ./new.sh <paquete> <Clase>
# Ej:  ./new.sh slidingwindow LongestSubstring
set -euo pipefail
if [ $# -ne 2 ]; then echo "Uso: ./new.sh <paquete> <Clase>"; exit 1; fi
pkg=$1; cls=$2
main=src/main/java/dsa/patterns/$pkg
test=src/test/java/dsa/patterns/$pkg
mkdir -p "$main" "$test"
if [ -e "$main/$cls.java" ]; then echo "Ya existe $main/$cls.java"; exit 1; fi

cat > "$main/$cls.java" <<JAVA
package dsa.patterns.$pkg;

public class $cls {

    public static Object solve() {
        throw new UnsupportedOperationException("TODO");
    }
}
JAVA

cat > "$test/${cls}Test.java" <<JAVA
package dsa.patterns.$pkg;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ${cls}Test {

    @ParameterizedTest
    @MethodSource("cases")
    void solve(/* parámetros del caso */) {
        // assertEquals(want, $cls.solve(...));
    }

    static Stream<Arguments> cases() {
        return Stream.of(
            // Arguments.of(input, want),
        );
    }
}
JAVA

sed "s/NOMBRE DEL PROBLEMA/$cls/" templates/NOTES.md > "$main/$cls.md"
echo "Creado: $main/$cls.java, $test/${cls}Test.java, $main/$cls.md"
