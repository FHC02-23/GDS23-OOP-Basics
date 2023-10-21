package org.campus02.konto;

public class Bank {

    public static void main(String[] args) {

        Gehaltskonto susi = new Gehaltskonto("Susi Sorglos", "AT77 12340", "XYZ12");
        Gehaltskonto max = new Gehaltskonto("Max Mustermann", "AT12 4567", "ABC123");
        Gehaltskonto john = new Gehaltskonto("John Doe", "AT81 6543", "PW87123");

        susi.aufbuchen(700);
        susi.abbuchen(1000);
        susi.abbuchen(200);
        max.aufbuchen(300);
        max.aufbuchen(250);

        Gehaltskonto[] arr = new Gehaltskonto[] {susi, max, john};

        for (int i = 0; i < arr.length; i++) {
            Gehaltskonto g = arr[i];
            System.out.println(g.getKontostand());
        }

    }
}
