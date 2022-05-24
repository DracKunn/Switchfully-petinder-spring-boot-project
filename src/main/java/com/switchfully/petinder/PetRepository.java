package com.switchfully.petinder;

import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PetRepository {
    public static List<Pet> getAllPets(){
        return List.of(new Pet(1,"dog",Kind.DOG,"Dog likes to do dog things"),
                new Pet(2,"cat",Kind.CAT,"Cat likes to do cat things"),
                new Pet(3,"chicken", Kind.CHICKEN, "Chicken loves doing chicken stuff"));
    }
}
