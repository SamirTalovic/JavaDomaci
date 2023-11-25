package paket;

public class Main {
    public static void main(String[] args) {
        Polinom polinom = new Polinom(5);
        polinom.kreirajMonom(2, 3, 0);
        polinom.kreirajMonom(1, 2, 1);
        polinom.kreirajMonom(3, 3, 0); 

        polinom.prikaziPolinom();
    }
}
