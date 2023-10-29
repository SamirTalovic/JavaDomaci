package dom;

import java.util.Scanner;

public class Domaci3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj n: ");
        int n = scanner.nextInt();

        double suma = izracunajSumu(n);

        System.out.println("S = " + suma);

        scanner.close();
    }

    public static long faktorijel(int n) {
        long rezultat = 1;
        for (int i = 1; i <= n; i++) {
            rezultat *= i;
        }
        return rezultat;
    }

    public static double izracunajSumu(int n) {
        double suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += 1.0 / faktorijel(i);
        }
        return suma;
    }
}
