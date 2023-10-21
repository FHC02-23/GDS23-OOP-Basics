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

        System.out.println("susi.getId() = " + susi.getId());
        System.out.println("max.getId() = " + max.getId());
        System.out.println("john.getId() = " + john.getId());
        System.out.println("Gehaltskonto.id = " + Gehaltskonto.id);

        /*Gehaltskonto[] arr1 = new Gehaltskonto[3];
        arr1[0] = susi;
        arr1[1] = max;
        arr1[2] = john;*/

       //Gehaltskonto[] arr = new Gehaltskonto[] {susi, max, john};
        Gehaltskonto[] arr = {susi, max, john};

        for (int i = 0; i < arr.length; i++) {
            Gehaltskonto g = arr[i];
            System.out.println(g.getKontostand());
            System.out.println(g.toString());
        }

        // Es kommt ein neuer Kunde
        Gehaltskonto[] arrnew = new Gehaltskonto[4];
        for (int i = 0; i < arr.length; i++) {
            arrnew[i] = arr[i];
        }
        arrnew[3] = new Gehaltskonto("Jonny", "AT8971", "OOP126");

        arr = arrnew;
        System.out.println(arr.length);

    }
}
