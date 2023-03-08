package org.lessons.java;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TrainTicket {
    public static void main(String[] args) {

        //variabili per l'utente
        int userAge;
        int kmUser;
        double ticketPrice;
        double totalDiscount;
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
        ticketPrice = kmPrice * kmUser;
        System.out.println("Prezzo senza sconto: " + ticketPrice + "€");

        if(userAge > 65){

            totalDiscount = (ticketPrice * adultDiscount) / 100;
            System.out.println("Lo sconto è del 40%: " + totalDiscount + "€");
            finalPrice = ticketPrice - totalDiscount;


        } else if (userAge < 18) {

            totalDiscount = (ticketPrice * underageDiscount) / 100;
            System.out.println("Lo sconto è del 20%: " + totalDiscount + "€");
            finalPrice = ticketPrice - totalDiscount;

        } else {

            finalPrice = ticketPrice;

        }

        //aggiunto decimal format per formattare il final price e stamparlo nel terminale
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedPrice = df.format(finalPrice);
        System.out.println("Il prezzo del tuo biglietto è di: " + formattedPrice + "€");

        scanKm.close(); //chiudo lo scanner
        scanAge.close(); //chiudo lo scanner

    }
}
