package paket;

class Polinom {
    private Monom[] monomi;
    private int dimenzija;

    // Konstruktor koji postavlja dimenziju polinoma
    public Polinom(int dimenzija) {
        if (dimenzija < 1 || dimenzija > 100) {
            // Ako je dimenzija van opsega, postavljamo je na 50
            this.dimenzija = 50;
        } else {
            this.dimenzija = dimenzija;
        }
        this.monomi = new Monom[this.dimenzija];
    }

    // Funkcija koja kreira monom i postavlja ga na određenu poziciju u nizu
    public void kreirajMonom(double koeficijent, int stepen, int pozicija) {
        Monom noviMonom = new Monom(koeficijent, stepen);

        if (monomi[pozicija] == null) {
            // Ako nema monoma na datoj poziciji, postavljamo novi monom
            monomi[pozicija] = noviMonom;
        } else {
            // Ako već postoji monom na datoj poziciji, dodajemo koeficijent
            monomi[pozicija].uporediMonome(noviMonom);
            monomi[pozicija] = new Monom(monomi[pozicija].izracunajVrednost(1) + noviMonom.izracunajVrednost(1), stepen);
        }
    }

    // Funkcija za prikaz polinoma na standardni izlaz
    public void prikaziPolinom() {
        for (Monom monom : monomi) {
            if (monom != null) {
                monom.prikaziMonom();
            }
        }
    }
}
