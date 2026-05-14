package com.thealgorithms.sorts;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CountingSortTest {

    record TestCase(int[] inputArray, int[] expectedArray) {
    }

    static Stream<TestCase> provideTestCases() {
        return Stream.of(new TestCase(new int[] {}, new int[] {}), new TestCase(new int[] {4}, new int[] {4}), new TestCase(new int[] {6, 1, 99
            new TestCase(new int[] {5, 5, 5, 5, 5}, new int[] {5, 5, 5, 5, 5}), new TestCase(new int[] {1, 2, 3, 4, 5}, new int[] {1, 2, 3, 4, 5}), new TestCase(new int[] {5, 4, 3, 2, 1}, new int[] {1, 2, 3, 4, 5}), new TestCase(new int[] {3, -1, 4, 1, 5, -9}, new int[] {-9, -1, 1, 3, 4, 5}),
            new TestCase(new int[] {0, 0, 0, 0}, new int[] {0, 0, 0, 0}), new TestCase(new int[] {3, 3, -1, -1, 2, 2, 0, 0}, new int[] {-1, -1, 0, 0, 2, 2, 3, 3}), new TestCase(new int[] {-3, -2, -1, -5, -4}, new int[] {-5, -4, -3, -2, -1}),
            new TestCase(new int[] {1000, 500, 100, 50, 10, 5, 1}, new int[] {1, 5, 10, 50, 100, 500, 1000}), new TestCase(new int[] {4, -5, 10, 0}, new int[] {-5, 0, 4, 10}));
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testCountingSortException(TestCase testCase) {
        Objects.requireNonNull(testCase, "testCase cannot be null");
        int[] outputArray = CountingSort.sort(testCase.inputArray);
        assertArrayEquals(testCase.expectedArray, outputArray);
    }
}
