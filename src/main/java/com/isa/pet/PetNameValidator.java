package com.isa.pet;

public class PetNameValidator {

    private static final String ILLEGAL_CHARACTERS_REGEX = "^(?=.*[!@#]).*$";

    public boolean hasValidName(String petName) {
        if (petName.isEmpty()) {
            return false;
        }
        return !petName.matches(ILLEGAL_CHARACTERS_REGEX);
    }
}
