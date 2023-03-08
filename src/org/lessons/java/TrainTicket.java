package org.lessons.java;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {

        //variabili per l'utente
        int userAge;
        int kmUser;
        double finalPrice;

        //variabili fisse
        double kmPrice = 0.21;
        int underageDiscount = 20;
        int adultDiscount = 40;

        //uso lo scanner per chiedere l'età all'utente e lo inserisco in userAge
        Scanner scanAge = new Scanner(System.in);
        System.out.println("Inserisci la tua età");
        userAge = Integer.parseInt(scanAge.nextLine());

        //uso lo scanner per chiedere quanti km vuole percorrere l'utente e li inserisco in kmUser
        Scanner scanKm = new Scanner(System.in);
        System.out.println("Quanti km vuoi percorrere? ");
        kmUser = Integer.parseInt(scanKm.nextLine());

        //stampo in terminale età e km da percorrere
        System.out.println("La tua età è: " + userAge + " anni");
        System.out.println("Vuoi percorrere: " + kmUser + " km");

        //calcolo il prezzo finale in base all'età dell'utente



    }
}
