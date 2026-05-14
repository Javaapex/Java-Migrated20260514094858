package com.thealgorithms.greedyalgorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class OptimalFileMergingTest {

    @ParameterizedTest
    @MethodSource("fileMergingProvider")
    public void testMinMergeCost(int[] files, int expected) {
        Objects.requireNonNull(files, "files cannot be null");
        assertEquals(expected, OptimalFileMerging.minMergeCost(files));
    }

    private static Stream<Arguments> fileMergingProvider() {
        return Stream.of(Arguments.of(new int[] {4, 3, 2, 6}, 29
            Arguments.of(new int[] {1, 2, 3, 4, 5, 6}, 51), Arguments.of(new int[] {1, 2, 3, 4, 5, 6, 7}, 74), Arguments.of(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 102), Arguments.of(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 135));
    }
}
