package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        //variabili
        int userNumber;
        int min = 0;
        int max = 1000;
        int n = 1;


        //prendo lo userNumber con lo scanner
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Inserisci un numero tra 1 e 999");

        //ciclo while che richiede il numero finché non viene fornito un valore valido
        while (true) {
            userNumber = Integer.parseInt(scanNumber.nextLine());
            if (userNumber > min && userNumber < max) {
                break;
            }
            System.out.println("Numero non valido, inserisci un numero tra 1 e 999");
        }

        scanNumber.close(); //chiudo lo scanner

        //stampo i numeri nel terminale
        for (int i = 0; i < userNumber; i++){

            if (((n % 3) == 0 && (n % 5) == 0)) {

                System.out.println("FizzBuzz");

            } else if ((n % 5) == 0) {

                System.out.println("Buzz");

            } else if ((n % 3) == 0) {

                System.out.println("Fizz");

            } else {

                System.out.println(n);

            }
            n++;
        }

    }
}
