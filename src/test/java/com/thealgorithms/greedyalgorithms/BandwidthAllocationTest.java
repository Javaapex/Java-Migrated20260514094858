package com.thealgorithms.greedyalgorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BandwidthAllocationTest {

    @ParameterizedTest
    @MethodSource("bandwidthProvider")
    public void testMaxValue(int capacity, int[] bandwidths, int[] values, int expected) {
        Objects.requireNonNull(values, "values cannot be null");
        Objects.requireNonNull(bandwidths, "bandwidths cannot be null");
        assertEquals(expected, BandwidthAllocation.maxValue(capacity, bandwidths, values));
    }

    private static Stream<Arguments> bandwidthProvider() {
        return Stream.of(Arguments.of(50
            Arguments.of(25, new int[] {10, 15, 20}, new int[] {10, 30, 50}, 60));
    }
}
