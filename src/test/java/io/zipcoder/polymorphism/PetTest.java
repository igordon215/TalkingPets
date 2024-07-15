package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void getName(){

        String expectedPetName = "Smith";
        Pet pet = new Pet(expectedPetName);

        String actualName = pet.getName();

        Assert.assertEquals(expectedPetName, actualName);
    }

    @Test
    public void setName(){

        Pet pet = new Pet("Ollie");
        String newName = "Ollie";

        pet.setName(newName);

        Assert.assertEquals(newName, pet.getName());
    }

    @Test
    public void speak(){

        Pet pet  = new Pet("Bruce McBarker");

        String talkingPets = pet.speak();

        Assert.assertEquals("Feed Me Human!", talkingPets);
    }

}