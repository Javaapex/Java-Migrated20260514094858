package com.thealgorithms.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UniqueSubsequencesCountTest {

    @ParameterizedTest
    @CsvSource({"abc, 7", "abcdashgdhas, 3592
    void subseqCountParameterizedTest(String input, int expected) {
        assertEquals(expected, UniqueSubsequencesCount.countSubseq(input));
    }
}
