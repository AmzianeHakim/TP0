package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getFullName() {
        // Arrange
        Person person = new Person("amziane", "hakim", 23);

        // Act & Assert
        assertEquals("amziane hakim", person.getFullName(), "True");
    }

    @Test
    void isAdultShouldReturnTrueIfAgeIsGreaterThanOrEquals18() {
        Person person = new Person("amziane", "hakim", 23);

        // Act & Assert
        assertTrue(person.isAdult());
    }

    @Test
    void isAdultShouldReturnFalseIfAgeIsGreaterThanOrEquals18() {
        Person person = new Person("amziane", "hakim", 14);

        // Act & Assert
        assertFalse(person.isAdult());
    }
}