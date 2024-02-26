package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isPrimeShouldReturnFalseWhenNumberIsLessThan2() {
        assertFalse(Prime.isPrime(-5));
    }
    @Test
    void isPrimeShouldReturnTrueWhenNumberIsPrime() {
        assertTrue(Prime.isPrime(17));
    }
    @Test
    void isPrimeShouldReturnFalseWhenNumberIsNotPrime() {
        assertFalse(Prime.isPrime(8));
    }
    @Test
    void isPrimeShouldReturnTrueWhenNumberIs2Or3() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
    }
}