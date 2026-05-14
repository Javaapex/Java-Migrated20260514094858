package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PythagoreanTripleTest {

    @ParameterizedTest
    @CsvSource({"3, 4, 5, true", "6, 8, 10, true", "9, 12
    void testIsPythagoreanTriple(int a, int b, int c, boolean expected) {
        assertEquals(expected, PythagoreanTriple.isPythagTriple(a, b, c));
    }

    @Test
    void testUnorderedInputStillValid() {
        // Should still detect Pythagorean triples regardless of argument order
        assertTrue(PythagoreanTriple.isPythagTriple(5, 3, 4));
        assertTrue(PythagoreanTriple.isPythagTriple(13, 12, 5));
    }
}
