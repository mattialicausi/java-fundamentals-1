package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        //variabili
        int userNumber;
        int min = 0;
        int max = 1000;

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


    }
}
