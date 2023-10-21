package org.campus02.student;

public class DemoStudentApp {

    public static void main(String[] args) {
        int number = 4;
        Student susiSorglos = new Student("Susi", "Sorglos", 1_000_001, "iwi", 1998); // Instanz einer Klasse erzeugen
        //susiSorglos.init("Susi", "Sorglos", 1_000_001, "iwi", 1998);

        Student maxMuster = new Student("Max", "Muster", 1000002, "iwi", 2000); // Instanzierung macht Objekt aus Klasse
        //maxMuster.init("Max", "Muster", 1_000_002, "iwi", 2000);

        Student john = new Student("John", "Doe", 1_000_003, "iwi", 2001);
        //john.init("John", "Doe", 1_000_003, "iwi", 2001);

        System.out.println("maxMuster.lastName = " + maxMuster.getLastName());
        System.out.println("susiSorglos.lastName = " + susiSorglos.getLastName());
        System.out.println("john.lastName = " + john.getLastName());

        System.out.println("maxMuster = " + maxMuster);
        System.out.println("susiSorglos = " + susiSorglos);

    }
}
