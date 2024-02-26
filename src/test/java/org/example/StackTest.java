package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack s;
    @BeforeEach
    void setUp() {
        s = new Stack();
    }

    @Test
    void pushShouldAddElementToTheTopOfTheStack() {
        s.push(10);
        assertEquals(s.peek(),10);
        assertEquals(s.pop(),10);
        assertEquals(s.size(),1);
    }
    @Test
    void pushShouldExpandArrayIfStackIsFull() {
        for (int i=0;i<10;i++){
            s.push(2);
        }
        assertEquals(10,s.size());
        s.push(45);
        assertEquals(s.size(),11);
        assertEquals(s.peek(),45);
    }

    @Test
    void pop() {
        s.push(10);
        assertNotEquals(s.isEmpty(),true);
        assertEquals(s.pop(),10);
    }
    @Test
    void popShouldThrowExceptionIfStackIsEmpty() {
        assertThrows(IllegalStateException.class, () -> s.pop());
    }
    @Test
    void peekShouldThrowExceptionIfStackIsEmpty() {
        assertThrows(IllegalStateException.class, () -> s.peek());
    }
    @Test
    void isEmpty() {
        assertEquals(s.isEmpty(),true);
        s.push(10);
        assertNotEquals(s.isEmpty(),true);
    }

}