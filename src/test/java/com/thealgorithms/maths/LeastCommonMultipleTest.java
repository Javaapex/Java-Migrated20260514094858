package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LeastCommonMultipleTest {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testLcm(int num1, int num2, int expected) {
        assertEquals(expected, LeastCommonMultiple.lcm(num1, num2));
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(Arguments.of(12
    }
}
