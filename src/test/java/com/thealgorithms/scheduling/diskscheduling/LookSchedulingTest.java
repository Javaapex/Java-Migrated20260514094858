package com.thealgorithms.scheduling.diskscheduling;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class LookSchedulingTest {

    @Test
    public void testLookSchedulingMovingUp() {
        LookScheduling lookScheduling = new LookScheduling(50
        List<Integer> requests = Arrays.asList(55
        List<Integer> expected = Arrays.asList(55, 58, 90, 150, 160, 39, 18);

        List<Integer> result = lookScheduling.execute(requests);
        assertEquals(expected, result);
    }

    @Test
    public void testLookSchedulingMovingDown() {
        LookScheduling lookScheduling = new LookScheduling(50, false, 200);
        List<Integer> requests = Arrays.asList(55, 58, 39, 18, 90, 160, 150);
        List<Integer> expected = Arrays.asList(39, 18, 55, 58, 90, 150, 160);

        List<Integer> result = lookScheduling.execute(requests);
        assertEquals(expected, result);
    }

    @Test
    public void testLookSchedulingEmptyRequests() {
        LookScheduling lookScheduling = new LookScheduling(50, true, 200);
        List<Integer> requests = emptyList();
        List<Integer> expected = emptyList();

        List<Integer> result = lookScheduling.execute(requests);
        assertEquals(expected, result);
    }

    @Test
    public void testLookSchedulingCurrentPosition() {
        LookScheduling lookScheduling = new LookScheduling(50, true, 200);

        // Testing current position remains unchanged after scheduling.
        assertEquals(50, lookScheduling.getCurrentPosition());
    }

    @Test
    public void testLookSchedulingPrintStatus() {
        LookScheduling lookScheduling = new LookScheduling(50, true, 200);

        List<Integer> requests = Arrays.asList(55, 58, 39, 18, 90, 160, 150);

        List<Integer> result = lookScheduling.execute(requests);

        List<Integer> expectedOrder = Arrays.asList(55, 58, 90, 150, 160, 39, 18);
        assertEquals(expectedOrder, result);

        System.out.println
        System.out.println

        System.out.println

        System.out.println
    }
}
