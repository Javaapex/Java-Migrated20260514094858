package com.thealgorithms.scheduling.diskscheduling;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CircularScanSchedulingTest {

    @Test
    public void testCircularScanSchedulingMovingUp() {
        CircularScanScheduling circularScan = new CircularScanScheduling(50
        List<Integer> requests = Arrays.asList(55
        List<Integer> expectedOrder = Arrays.asList(55, 58, 90, 150, 160, 18, 39);

        List<Integer> result = circularScan.execute(requests);
        assertEquals(expectedOrder, result);

        System.out.println
        System.out.println
        System.out.println
    }

    @Test
    public void testCircularScanSchedulingMovingDown() {
        CircularScanScheduling circularScan = new CircularScanScheduling(50, false, 200);
        List<Integer> requests = Arrays.asList(55, 58, 39, 18, 90, 160, 150);
        List<Integer> expectedOrder = Arrays.asList(39, 18, 160, 150, 90, 58, 55);

        List<Integer> result = circularScan.execute(requests);
        assertEquals(expectedOrder, result);

        System.out.println
        System.out.println
        System.out.println
    }

    @Test
    public void testCircularScanSchedulingEmptyRequests() {
        CircularScanScheduling circularScan = new CircularScanScheduling(50, true, 200);
        List<Integer> requests = emptyList();
        List<Integer> expectedOrder = emptyList();

        List<Integer> result = circularScan.execute(requests);
        assertEquals(expectedOrder, result);
    }
}
