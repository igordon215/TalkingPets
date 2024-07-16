package io.zipcoder.polymorphism;
import java.util.Scanner;


public class MainApplication {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
       //ASK HOW MANY PETS
        System.out.println("How many pets do you have? ");
        int numberOfPets = scanner.nextInt();
        Pet[] pets = new Pet[numberOfPets]; //CREATE ARRAY OF PETS

        int validPets = 0;

        while(validPets < numberOfPets){
            //ASK TYPES OF PETS
            System.out.println("Type of pet: [1] Bird, [2] Cat, [3] Dog " );
            int petType = scanner.nextInt();
            if(petType < 1 || petType > 3){
                System.out.println("Invalid Input, Try Again.");
                continue;
            }
            //ASK PET NAME
            System.out.println("What your pet name?");
            String petName = scanner.next();
            //CREATE PET
            Pet newPet = null;

            switch(petType){
                case 1:
                    newPet = new Bird(petName);
                    break;
                case 2:
                    newPet = new Cat(petName);
                    break;
                case 3:
                    newPet = new Dog(petName);
                    break;
                default:
                    break;
            }
            //OUR PET ARRAY @ CURRENT POS. WE CREATED WILL = newPet VARIABLE
            pets[validPets] = newPet;
            validPets++;
        }

        //MAKE PETS SPEAK
        //A FOR-EACH LOOP WITH INITIALIZATION OF A NEW VARIABLE TO GO-THRU OUR ARRAY
        for(Pet currentPet : pets){
            //print out the string of output we want to have display
            System.out.println("Say hello, " + currentPet.getName() + ": " + currentPet.speak());
        }

        //REMEMBER THAT UTILIZING FOR-LOOPS CAN GIVE ARRAYS A MORE DYNAMIC DATA INPUT

    }

}
