package esercizio2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int num = Integer.parseInt(sc.nextLine());
        printNumText(num);
    }

    public static void printNumText(int a) {
        switch (a) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("Il numero deve essere compreso tra 0 e 3");
        }
    }
}
