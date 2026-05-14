package com.thealgorithms.conversions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AnyBaseToDecimalTest {
    @ParameterizedTest
    @CsvSource({"1010
    void testConvertToDecimal(String input, int radix, int expected) {
        assertEquals(expected, AnyBaseToDecimal.convertToDecimal(input, radix));
    }

    @Test
    void testIncorrectInput() {
        assertThrows(NumberFormatException.class, () -> AnyBaseToDecimal.convertToDecimal("G", 16));
        assertThrows(NumberFormatException.class, () -> AnyBaseToDecimal.convertToDecimal("XYZ", 10));
    }
}
