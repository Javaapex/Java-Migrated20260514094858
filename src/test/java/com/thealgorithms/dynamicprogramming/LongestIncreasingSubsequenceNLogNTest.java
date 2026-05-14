package com.thealgorithms.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LongestIncreasingSubsequenceNLogNTest {

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(Arguments.of(new int[] {10, 9, 2, 5, 3, 7, 101
            Arguments.of(new int[] {3, 10, 2, 1, 20}, 3), Arguments.of(new int[] {50, 3, 10, 7, 40, 80}, 4));
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testLengthOfLIS(int[] input, int expected) {
        Objects.requireNonNull(input, "input cannot be null");
        assertEquals(expected, LongestIncreasingSubsequenceNLogN.lengthOfLIS(input));
    }
}
