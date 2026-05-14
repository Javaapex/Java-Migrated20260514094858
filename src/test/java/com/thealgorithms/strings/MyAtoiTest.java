package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MyAtoiTest {

    @ParameterizedTest
    @CsvSource({"'42
        "'9223372036854775808', 2147483647", "'-9223372036854775809', -2147483648", "'3.14159', 3", "'  -0012', -12", "'  0000000000012345678', 12345678", "'  -0000000000012345678', -12345678", "'  +0000000000012345678', 12345678", "'0', 0", "'+0', 0", "'-0', 0"})
    void
    testMyAtoi(String input, int expected) {
        assertEquals(expected, MyAtoi.myAtoi(input));
    }

    @Test
    void testNullInput() {
        assertEquals(0, MyAtoi.myAtoi(null));
    }

    @Test
    void testSinglePlus() {
        assertEquals(0, MyAtoi.myAtoi("+"));
    }

    @Test
    void testSingleMinus() {
        assertEquals(0, MyAtoi.myAtoi("-"));
    }

    @Test
    void testIntegerMinBoundary() {
        assertEquals(Integer.MIN_VALUE, MyAtoi.myAtoi("-2147483648"));
    }

    @Test
    void testIntegerMaxBoundary() {
        assertEquals(Integer.MAX_VALUE, MyAtoi.myAtoi("2147483647"));
    }
}
