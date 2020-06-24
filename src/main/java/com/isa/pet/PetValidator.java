package com.isa.pet;

import java.util.EnumSet;
import java.util.Set;

public class PetValidator {

    private static final Set<PetType> SUPPORTED_PETS = EnumSet.of(PetType.DOG, PetType.CAT);

    public boolean canLeavePet(Pet pet) {
        return pet.getAge() > 1 && SUPPORTED_PETS.contains(pet.getType());
    }
}
