package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void greetingsFromCsaba() {
        String name = "Vasile";
        String expected = "Hello Vasile!";

        assertEquals(expected, Main.greetingsFromCsaba(name));
    }
}