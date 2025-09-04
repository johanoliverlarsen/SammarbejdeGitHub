package Tivoliride;

import java.util.Scanner;

public class TivolirideTest {
    public static void main (String[] args){

        //Opretter scanner og tildeler værdi til highEnough
        Scanner scanner = new Scanner(System.in);
        boolean highEnough = true;

        //Udskriver velkomst + spørgsmål + input
        System.out.println("Velkommen til Rutsjebanen Fantomet! Hvor høj er du i centimeter?");
        int input = scanner.nextInt();

        //If statement opdaterer highEnough værdi til false, hvis input <= 150
        if(input <= 150) {
            highEnough = false;
        }

        //If statement udskriver "Nyd turen!" hvis true og "Kom igen når du er højere." hvis false
        if(highEnough) {
            System.out.println("Nyd turen!");
        } else {
            System.out.println("Kom igen når du er højere.");
        }

    }
}

