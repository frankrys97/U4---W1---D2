package esercizio4;

import java.util.Scanner;

public class esercizio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci un numero per il countdown");


        countdownInputNumber(sc);

        sc.close();

    }

    public static void countdownInputNumber(Scanner sc) {
        int num = Integer.parseInt(sc.nextLine());
        for (int i = num; i >= 0; i--) {
            System.out.println(i);


        }

        System.out.println("Buon Anno!");
    }

}
