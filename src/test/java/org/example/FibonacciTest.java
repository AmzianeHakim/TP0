package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacciWhenNormal() {
        Assertions.assertEquals(13,Fibonacci.fibonacci(7));
    }
    @Test
    void fibonacciShouldThrowExceptionWhenNIsNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }
    @Test
    void fibonacciShouldReturn0WhenNIs0() {
        Assertions.assertEquals(0,Fibonacci.fibonacci(0));
    }
    @Test
    void fibonacciShouldReturn1WhenNIs1() {
        Assertions.assertEquals(1,Fibonacci.fibonacci(1));
    }


}