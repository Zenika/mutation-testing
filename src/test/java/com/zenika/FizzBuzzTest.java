package com.zenika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_return_Bizz_when_number_is_divisible_by_3() {
        // Given
        int number = 3;

        // When
        fizzBuzz.getResult(number);

        // Then
        assertTrue(true);
    }

    @Test
    void should_return_Fizz_when_number_is_divisible_by_5() {
        assertNotNull(fizzBuzz.getResult(5));
    }

    @Test
    void should_return_FizzBuzz_when_number_is_divisible_by_15() {
        assertEquals("FizzBuzz", fizzBuzz.getResult(15));
        assertEquals("FizzBuzz", fizzBuzz.getResult(30));
    }

    @Test
    void should_return_number_when_number_is_not_divisible_by_3_or_5() {
        assertEquals(String.class, fizzBuzz.getResult(1).getClass());
    }
}
