package org.example;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int a;
        int randomNumber = rand.nextInt(101);
        boolean run = true;

        while (run) {
            System.out.print("Guess a number between 1-100 ");

            try {
                a = input.nextInt();
                if (a == randomNumber) {
                    System.out.println("You win!");
                    run = false;
                } else if (a > randomNumber) {
                    System.out.println("The number is smaller than " + a + "!");
                } else if (a < randomNumber) {
                    System.out.println("The number is bigger than " + a + "!");
                }
            } catch (InputMismatchException e) {
                System.out.println("That is not a number!");
            }

        }
    }
}