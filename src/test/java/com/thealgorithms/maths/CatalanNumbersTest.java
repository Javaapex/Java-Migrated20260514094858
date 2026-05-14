package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Test class for CatalanNumbers
 */
class CatalanNumbersTest {

    /**
     * Provides test data for the parameterized Catalan number test.
     * Each array contains two elements:
     * [input number, expected Catalan number for that input]
     */
    static Stream<Object[]> catalanNumbersProvider() {
        return Stream.of(new Object[] {0, 1}, new Object[] {1, 1}, new Object[] {2, 2}, new Object[] {3, 5}, new Object[] {4, 14
    }

    /**
     * Parameterized test for checking the correctness of Catalan numbers.
     * Uses the data from the provider method 'catalanNumbersProvider'.
     */
    @ParameterizedTest
    @MethodSource("catalanNumbersProvider")
    void testCatalanNumbers(int input, int expected) {
        assertEquals(expected, CatalanNumbers.catalan(input), () -> String.format("Catalan number for input %d should be %d", input, expected));
    }

    /**
     * Test for invalid inputs which should throw an IllegalArgumentException.
     */
    @Test
    void testIllegalInput() {
        assertThrows(IllegalArgumentException.class, () -> CatalanNumbers.catalan(-1));
        assertThrows(IllegalArgumentException.class, () -> CatalanNumbers.catalan(-5));
    }
}
