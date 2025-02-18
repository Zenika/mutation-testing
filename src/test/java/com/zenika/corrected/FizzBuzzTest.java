package com.zenika.corrected;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zenika.FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzCorrectedTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_return_Fizz_when_number_is_divisible_by_3() {
        // Given
        int number = 3;

        // When
        var result = fizzBuzz.getResult(number);

        // Then
        assertEquals("Fizz", result);
    }

    @Test
    void should_return_Buzz_when_number_is_divisible_by_5() {
        assertEquals("Buzz", fizzBuzz.getResult(5));
    }

    @Test
    void should_return_FizzBuzz_when_number_is_divisible_by_15() {
        assertEquals("FizzBuzz", fizzBuzz.getResult(15));
    }

    @Test
    void should_return_number_when_number_is_not_divisible_by_3_or_5() {
        assertEquals("1", fizzBuzz.getResult(1));
    }
}
