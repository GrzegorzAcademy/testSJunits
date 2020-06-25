package com.isa.pet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class PetNameValidatorTest {

    private final PetNameValidator petNameValidator = new PetNameValidator();

    @Test
    @DisplayName("Should return true when name is valid")
    void returnTrueWhenNameIsValid() {
        // given
        String givenName = "Azor#";

        // when
        boolean result = petNameValidator.hasValidName(givenName);

        // then
        assertThat(result).isFalse();
    }

    @ParameterizedTest
    @DisplayName("Should return false for incorrect names")
    @ValueSource(strings = { "", "#zor", "A!or", "Azor", "$#@!" })
    void returnFalseWhenNameIsInvalid(String givenName) {
        // when
        boolean result = petNameValidator.hasValidName(givenName);

        // then
        assertThat(result).isFalse();
    }
}