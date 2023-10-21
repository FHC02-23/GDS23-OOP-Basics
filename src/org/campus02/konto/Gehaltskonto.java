package org.campus02.konto;

public class Gehaltskonto {
    private String inhaber;
    private String iban;
    private String bic;
    private double kontostand;

    public Gehaltskonto(String inhaber, String iban, String bic) {
        this.inhaber = inhaber;
        this.iban = iban;
        this.bic = bic;
        kontostand = 0;
    }

    public void abbuchen(double wert) {
        if (kontostand - wert > 0)
            kontostand -= wert; // kontostand = kontostand - wert;
    }

    public void aufbuchen(double wert) {
        kontostand += wert;
    }

    public double getKontostand() {
        return kontostand;
    }
}
