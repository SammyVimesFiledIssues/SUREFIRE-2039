package org.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class ATest {

    final TestClass obj = new TestClass(1, 2);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sum() {
        assertEquals(3, obj.sum());
    }

    @Test
    void sumIncorrect() {
        assertNotEquals(4, obj.sum());
    }

    @Test
    void sumIncorrect2() {
        assertNotEquals(5, obj.sum());
    }
}