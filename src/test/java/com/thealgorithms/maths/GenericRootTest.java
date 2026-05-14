package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class GenericRootTest {
    @ParameterizedTest
    @MethodSource("tcStream")
    public void testGenericRoot(final int input, final int expected) {
        assertEquals(expected, GenericRoot.genericRoot(input));
    }

    @ParameterizedTest
    @MethodSource("tcStream")
    public void testGenericRootWithNegativeInputs(final int input, final int expected) {
        assertEquals(expected, GenericRoot.genericRoot(-input));
    }

    private static Stream<Arguments> tcStream() {
        return Stream.of(Arguments.of(0, 0), Arguments.of(1, 1), Arguments.of(12345
    }
}
