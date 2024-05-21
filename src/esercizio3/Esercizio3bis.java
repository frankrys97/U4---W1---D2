package esercizio3;

import java.util.Scanner;

public class Esercizio3bis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        processInput(sc);

        sc.close();

    }

    public static void processInput(Scanner sc) {
        while (true) {
            // Messaggio di avviso all'utente per indicare quale input serve per uscire dal loop
            System.out.println("Inserisci la stringa :q per uscire");


            // Dichiarazione di variabile derivante dall'input dell'utente
            String input = sc.nextLine();
            // Se l'input è :q allora esce dal loop (in Java le stringhe si confrontano con .equals)
            if (input.equals(":q")) {
                System.out.println("Arrivederci");
                break;


                // Altrimenti esegui questo codice

            } else {
                for (int i = 0; i < input.length(); i++) {
                    // Stampa ogni carattere dell'input che l'utente ha messo
                    System.out.print(input.charAt(i));
                    // seguito da una virgola tranne che per l'ultimo carattere
                    if (i != input.length() - 1) {
                        System.out.print(",");
                    }
                }
                // Stampa una linea vuota per mandare a capo il primo messaggio ( System.out.println("Inserisci la stringa :q per uscire");)
                // quando il for loop ha finito di scrivere
                System.out.println();
            }
        }


    }

}

