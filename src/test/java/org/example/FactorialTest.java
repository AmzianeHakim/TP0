package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    public void FactorialNormal(){
        Assertions.assertEquals(5040,Factorial.factorial(7));
    }
    @Test
    public void FactorialShouldReturnExceptionForNegative(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-4));
    }
}