package com.zenika;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeUtilsTest {

    @Test
    void isAdulte_should_return_true_when_age_is_over_18() {
        // Given
        int age = 20;

        // When
        boolean result = AgeUtils.isAdulte(age);

        // Then
        assertTrue(result);
    }

    @Test
    void isAdulte_should_return_false_when_age_is_under_18() {
        // Given
        int age = 17;

        // When
        boolean result = AgeUtils.isAdulte(age);

        // Then
        assertFalse(result);
    }

    @Test
    void AgeUtils_constructor_coverage() {
        assertNotNull(new AgeUtils());
    }
}