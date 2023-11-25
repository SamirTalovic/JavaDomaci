package paket;


class Vektor {
    private int brojElemenata;
    private int[] elementi;

    // Konstruktor koji postavlja broj elemenata i kreira niz elemenata
    public Vektor(int brojElemenata) {
        if (brojElemenata <= 0) {
            throw new IllegalArgumentException("Broj elemenata mora biti veći od 0");
        }
        this.brojElemenata = brojElemenata;
        this.elementi = new int[brojElemenata];
    }

    // Metoda koja postavlja vrednost k-tog elementa u vektoru
    public void postaviElement(int k, int vrednost) {
        if (k < 0 || k >= brojElemenata) {
            throw new IndexOutOfBoundsException("Indeks van opsega elemenata vektora");
        }
        elementi[k] = vrednost;
    }

    // Metoda koja određuje srednji element (po vrednosti) u vektoru
    public double srednjiElement() {
        if (brojElemenata % 2 == 0) {
            throw new ArithmeticException("Vektor mora imati neparan broj elemenata za određivanje srednjeg elementa");
        }
        int srednjiIndeks = brojElemenata / 2;
        return elementi[srednjiIndeks];
    }
}

