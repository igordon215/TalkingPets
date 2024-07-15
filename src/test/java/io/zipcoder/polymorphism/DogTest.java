package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void testDogGetName(){

        String expectedPetName = "Smith";
        Dog dog = new Dog(expectedName);

        String actualName = dog.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testDogSetName(){

        Dog dog = new Dog("Ollie");
        String newName = "Ollie";

        dog.setName(newName);

        Assert.assertEquals(newName, dog.getName());
    }

    @Test
    public void testDogSpeak(){

        Dog dog   = new Dog("Bruce McBarker");

        String talkingPets = dog.speak();

        Assert.assertEquals("Feed Me Human!", talkingPets);
    }

}