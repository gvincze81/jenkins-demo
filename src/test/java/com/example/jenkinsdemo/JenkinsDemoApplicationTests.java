package com.example.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JenkinsDemoApplicationTests {

    @Test
    void trueTest() {
        assertTrue(true);
    }

    @Test
    void falseTest()
    {
        assertFalse(false);
    }

    @Test
    void mathTest()
    {
        assertTrue(2 > 1);
    }
    
}
