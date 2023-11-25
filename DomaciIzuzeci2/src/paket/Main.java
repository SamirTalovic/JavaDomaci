package paket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Unesite broj elemenata vektora: ");
            int brojElemenata = scanner.nextInt();

            Vektor vektor = new Vektor(brojElemenata);

            System.out.println("Unesite vrednosti elemenata vektora:");
            for (int i = 0; i < brojElemenata; i++) {
                System.out.print("Element " + i + ": ");
                int vrednost = scanner.nextInt();
                vektor.postaviElement(i, vrednost);
            }

            double srednjiElement = vektor.srednjiElement();
            System.out.println("Srednji element vektora: " + srednjiElement);

            scanner.close();
        } catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Izuzetak: " + e.getMessage());
        }
    }
}
