package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void testPetGetName(){

        String expectedPetName = "Smith";
        Pet pet = new Pet(expectedPetName);

        String actualName = pet.getName();

        Assert.assertEquals(expectedPetName, actualName);
    }

    @Test
    public void testPetSetName(){

        Pet pet = new Pet("Ollie");
        String newName = "Ollie";

        pet.setName(newName);

        Assert.assertEquals(newName, pet.getName());
    }

    @Test
    public void testPetSpeak(){

        Pet pet  = new Pet("Bruce McBarker");

        String talkingPets = pet.speak();

        Assert.assertEquals("Feed Me Human!", talkingPets);
    }

}