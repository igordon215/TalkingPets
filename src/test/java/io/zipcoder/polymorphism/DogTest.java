package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void testDogGetName(){

        String expectedName = "Duke";

        Dog dog = new Dog(expectedName);

        String actualName = dog.getName();

        assertEquals(expectedName, actualName);
    }

    @Test
    public void testDogSetName(){

        Dog dog = new Dog("Duke");
        String newName = "Duke";

        dog.setName(newName);

        assertEquals(newName, dog.getName());
    }

    @Test
    public void testDogSpeak(){

        Dog dog   = new Dog("Duke");

        String talkingPets = dog.speak();

        assertEquals("Woof Woof", talkingPets);
    }

}