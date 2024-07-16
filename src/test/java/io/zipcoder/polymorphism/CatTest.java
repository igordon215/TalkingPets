package io.zipcoder.polymorphism;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void testCatGetName(){

        String expectedName = "Carl";

        Cat cat = new Cat(expectedName);

        String actualName = cat.getName();

        assertEquals(expectedName, actualName);
    }

    @Test
    public void testCatSetName(){

        Cat cat = new Cat("Carl");
        String newName = "Carl";

        cat.setName(newName);

        assertEquals(newName, cat.getName());
    }

    @Test
    public void testCatSpeak(){

        Cat cat   = new Cat("Carl");

        String talkingPets = cat.speak();

        assertEquals("meow", talkingPets);
    }


}