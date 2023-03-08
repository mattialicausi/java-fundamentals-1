package org.lessons.java;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {

        //variabili per l'utente
        int userAge;

        //variabili fisse
        double kmPrice = 0.21;
        int underageDiscount = 20;
        int adultDiscount = 40;

        //uso lo scanner per chiedere l'età all'utente e lo inserisco in userAge
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la tua età");
        userAge = Integer.parseInt(scan.nextLine());

        System.out.println("La tua età è: " + userAge + " anni");


    }
}
