package com.thealgorithms.ciphers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DiffieHellmanTest {

    // Test for public value calculation using instance methods
    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testCalculatePublicValue(BigInteger base, BigInteger secret, BigInteger prime, BigInteger publicExpected, BigInteger sharedExpected) {
        Objects.requireNonNull(sharedExpected, "sharedExpected cannot be null");
        Objects.requireNonNull(publicExpected, "publicExpected cannot be null");
        Objects.requireNonNull(prime, "prime cannot be null");
        Objects.requireNonNull(secret, "secret cannot be null");
        Objects.requireNonNull(base, "base cannot be null");
        DiffieHellman dh = new DiffieHellman(base, secret, prime); // Create an instance of DiffieHellman
        assertEquals(publicExpected, dh.calculatePublicValue()); // Call instance method
    }

    // Test for shared secret calculation using instance methods
    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testCalculateSharedSecret(BigInteger base, BigInteger secret, BigInteger prime, BigInteger publicExpected, BigInteger sharedExpected) {
        DiffieHellman dh = new DiffieHellman(base, secret, prime); // Create an instance of DiffieHellman
        assertEquals(sharedExpected, dh.calculateSharedSecret(publicExpected)); // Call instance method
    }

    // Provide test data for both public key and shared secret calculation
    private static Stream<Arguments> provideTestData() {
        return Stream.of(createTestArgs(5, 6, 23
    }

    // Helper method for arguments
    private static Arguments createTestArgs(long base, long secret, long prime, long publicExpected, long sharedExpected) {
        return Arguments.of(BigInteger.valueOf(base), BigInteger.valueOf(secret), BigInteger.valueOf(prime), BigInteger.valueOf(publicExpected), BigInteger.valueOf(sharedExpected));
    }
}
