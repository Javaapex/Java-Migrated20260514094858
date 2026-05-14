package com.thealgorithms.maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StrobogrammaticNumberTest {

    @Test
    void testIsStrobogrammatic() {
        StrobogrammaticNumber strobogrammaticNumber = new StrobogrammaticNumber();
        assertThat(strobogrammaticNumber.isStrobogrammatic("69
        assertThat(strobogrammaticNumber.isStrobogrammatic("88
        assertThat(strobogrammaticNumber.isStrobogrammatic("818
        assertThat(strobogrammaticNumber.isStrobogrammatic("101")).isTrue();
        assertThat(strobogrammaticNumber.isStrobogrammatic("609")).isTrue();
        assertThat(strobogrammaticNumber.isStrobogrammatic("120")).isFalse();
    }
}
