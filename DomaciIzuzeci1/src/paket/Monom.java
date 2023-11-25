package paket;

class Monom {
    private double koeficijent;
    private int stepen;

    // Konstruktor koji postavlja koeficijent i stepen monoma
    public Monom(double koeficijent, int stepen) {
        if (stepen > 100) {
            // Ako je stepen veći od 100, zaokružujemo na 100
            this.stepen = 100;
        } else {
            this.stepen = stepen;
        }
        this.koeficijent = koeficijent;
    }

    // Funkcija koja izračunava vrednost monoma za zadatu vrednost x
    public double izracunajVrednost(double x) {
        return koeficijent * Math.pow(x, stepen);
    }

    // Funkcija koja poredi dva monoma istog stepena
    public void uporediMonome(Monom drugi) {
        if (this.stepen != drugi.stepen) {
            throw new IllegalArgumentException("Monomi nisu istog stepena");
        }
    }

    // Funkcija za prikaz monoma na standardni izlaz
    public void prikaziMonom() {
        System.out.print(koeficijent);
        if (stepen > 0) {
            System.out.print("x");
            if (stepen > 1) {
                System.out.print("^" + stepen);
            }
        }
        System.out.println();
    }
}

