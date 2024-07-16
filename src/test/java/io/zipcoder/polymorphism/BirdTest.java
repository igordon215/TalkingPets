package io.zipcoder.polymorphism;

import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

    @Test
    public void testBirdGetName(){

        String expectedName = "Bob";

        Bird bird = new Bird(expectedName);

        String actualName = bird.getName();

        assertEquals(expectedName, actualName);
    }

    @Test
    public void testBirdSetName(){

        Bird bird = new Bird("Bob");
        String newName = "Bob";

        bird.setName(newName);

        assertEquals(newName, bird.getName());
    }

    @Test
    public void testBirdSpeak(){

        Bird bird   = new Bird("Bob");

        String talkingPets = bird.speak();

        assertEquals("Chrip Chirp", talkingPets);
    }


}