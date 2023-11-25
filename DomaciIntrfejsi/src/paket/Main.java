package paket;

public class Main {
    public static void main(String[] args) {
        // Primer korišćenja:
        double[] koeficijenti = {1, -3, 2}; // Polinom: x^2 - 3x + 2
        Polinom kPolinom = new KPolinom(2, koeficijenti);

        double[] nule = {1, 2}; // Polinom: (x - 1)(x - 2)
        Polinom nPolinom = new NPolinom(2, nule);

        System.out.println("Vrednost KPolinoma u tački x=2: " + kPolinom.izracunajVrednost(2));
        System.out.println("Nula KPolinoma u intervalu [1, 3]: " + kPolinom.nadjiNulu(1, 3));

        System.out.println("Vrednost NPolinoma u tački x=2: " + nPolinom.izracunajVrednost(2));
        System.out.println("Nula NPolinoma u intervalu [1, 3]: " + nPolinom.nadjiNulu(1, 3));
    }
}
