package org.campus02.person;

public class DemoPersonApp {

    public static void main(String[] args) {

        Person susi = new Person();

        susi.firstname = "Susi";
        susi.lastname = "Sorglos";
        susi.age = 39;
        susi.height = 175;

        Person max = new Person();
        max.firstname = "Max";
        max.lastname = "Mustermann";
        max.age = 40;
        max.height = 173;

        printPerson(max);
        printPerson(susi);
    }

    public static void printPerson(Person p) {
        System.out.println(p.firstname + " " + p.lastname + ", "
                + p.age + " Jahre: " + p.height + " cm");
    }
}
