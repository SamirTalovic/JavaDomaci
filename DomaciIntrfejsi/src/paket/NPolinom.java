package paket;

class NPolinom implements Polinom {
    private int stepen;
    private double[] nule;

    public NPolinom(int stepen, double[] nule) {
        this.stepen = stepen;
        this.nule = nule;
    }

    @Override
    public double izracunajVrednost(double x) {
        double rezultat = 1.0;
        for (int i = 0; i < stepen; i++) {
            rezultat *= x - nule[i];
        }
        return rezultat;
    }

    @Override
    public double nadjiNulu(double a, double b) {
        // Nule su unapred poznate, pa nema potrebe za traženjem nule u intervalu
        // Možemo jednostavno vratiti prvu nulu
        return nule[0];
    }
}
