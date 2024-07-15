package io.zipcoder.polymorphism;

import java.util.Scanner;

//Part 1:
//Create a program that asks the user how many pets they have.
//Once you know how many pets they have, ask them what kind of pet each one is,
//along with each pet's name. For now your program should just hold onto the user input
//and print out the list at the end; we'll modify this in part 3.
public class MainApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How Many Pets Do You Have??");
        int  numberOfPets = scanner.nextInt();
        scanner.nextLine();


    }



}
