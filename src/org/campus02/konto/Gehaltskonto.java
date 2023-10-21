package org.campus02.konto;

public class Gehaltskonto {
    private String inhaber;
    private String iban;
    private String bic;
    private double kontostand;
    private int number;
    public static int id;

    public int getId() {
        return number;
    }

    public Gehaltskonto(String inhaber, String iban, String bic) {
        this.inhaber = inhaber;
        this.iban = iban;
        this.bic = bic;
        kontostand = 0;
        id++;
        number = id;
    }

    public void abbuchen(double wert) {
        if (kontostand - wert >= 0)
            kontostand -= wert; // kontostand = kontostand - wert;
        else
            System.out.println("too less money on account: " + wert);
    }

    public void aufbuchen(double wert) {
        kontostand += wert;
    }

    public double kontoueberfall() {
        double value = kontostand;
        kontostand = 0;
        return value;
    }

    public String toString() {
        return "Gehaltskonto{" +
                "inhaber='" + inhaber + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }

    public double getKontostand() {
        return kontostand;
    }

    public String getInhaber() {
        return inhaber;
    }

    public String getIban() {
        return iban;
    }

    public String getBic() {
        return bic;
    }
}
