public class DemoStudentApp {

    public static void main(String[] args) {
        int number = 4;
        Student susiSorglos = new Student(); // Instanz einer Klasse erzeugen
        susiSorglos.number = 4711;
        susiSorglos.department = "iwi";
        susiSorglos.firstName = "Susi";
        susiSorglos.lastName = "Sorglos";
        susiSorglos.yearOfBirth = 1999; // wie java

        Student maxMuster = new Student(); // Instanzierung macht Objekt aus Klasse
        maxMuster.number = 4712;
        maxMuster.department = "iwi";
        maxMuster.firstName = "Max";
        maxMuster.lastName = "Muster";
        maxMuster.yearOfBirth = 2001;

        System.out.println("maxMuster.lastName = " + maxMuster.lastName);
        System.out.println("susiSorglos.lastName = " + susiSorglos.lastName);

        System.out.println("maxMuster = " + maxMuster);
        System.out.println("susiSorglos = " + susiSorglos);

    }
}
