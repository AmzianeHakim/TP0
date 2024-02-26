package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testFibonacciWithValidInput() {
        assertEquals(0, Fibonacci.fibonacci(0), "Fibonacci of 0 should be 0");
        assertEquals(1, Fibonacci.fibonacci(1), "Fibonacci of 1 should be 1");
        assertEquals(1, Fibonacci.fibonacci(2), "Fibonacci of 2 should be 1");
        assertEquals(2, Fibonacci.fibonacci(3), "Fibonacci of 3 should be 2");
        assertEquals(3, Fibonacci.fibonacci(4), "Fibonacci of 4 should be 3");
        assertEquals(5, Fibonacci.fibonacci(5), "Fibonacci of 5 should be 5");
        assertEquals(8, Fibonacci.fibonacci(6), "Fibonacci of 6 should be 8");
        assertEquals(13, Fibonacci.fibonacci(7), "Fibonacci of 7 should be 13");
        assertEquals(21, Fibonacci.fibonacci(8), "Fibonacci of 8 should be 21");
        // Add more test cases as needed for different input values
    }

    @Test
    void testFibonacciWithInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1), "Fibonacci with negative input should throw IllegalArgumentException");
    }
}