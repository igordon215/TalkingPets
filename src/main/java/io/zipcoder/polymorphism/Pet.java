package io.zipcoder.polymorphism;


//The Pet class must have a speak method that each subclass overrides.
//The Pet class must have a name field with setters and getters.


public class Pet {

    private String name;

    public Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String newName) {
        this.name = name;
    }

    public String speak() {
        return "Feed Me Human!";
    }
}
