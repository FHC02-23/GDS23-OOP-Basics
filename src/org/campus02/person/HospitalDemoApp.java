package org.campus02.person;

import org.campus02.person.Person;

public class HospitalDemoApp {
    public static void main(String[] args) {

        Person patient = new Person();
        patient.firstname = "John";
        patient.lastname = "Doe";
        patient.age = 89;
        patient.height = 165;

        patient.print();

    }
}
