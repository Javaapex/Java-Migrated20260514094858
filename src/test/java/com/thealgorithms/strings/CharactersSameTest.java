package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CharactersSameTest {

    @ParameterizedTest
    @CsvSource({"aaa, true", "abc, false", "'1  1  1  1', false", "111
    void testIsAllCharactersSame(String input, boolean expected) {
        assertEquals(CharactersSame.isAllCharactersSame(input), expected);
    }
}
