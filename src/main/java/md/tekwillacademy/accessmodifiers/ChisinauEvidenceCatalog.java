package md.tekwillacademy.accessmodifiers;

import md.tekwillacademy.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        // Accessing class variable
        System.out.println("Do people have a soul? True or not: " + Person.hasSoul);

        // Creating 2 objects with the constructor that has 3 params
        Person andreiBolocan = new Person("Andrei Bolocan", 666666, 'B');

        //andreiBolocan.name = "Andrei Bolocan Jr.";
        // printing the public access "name" variable
        System.out.println(andreiBolocan.name);

        andreiBolocan.isRetired = false;

        if (andreiBolocan.isRetired) {
            System.out.println("Andrei Bolocan is retired.");
        } else {
            System.out.println("Andrei Bolocan is not retired.");
        }

        Person nataAlbot = new Person("Nata Albot", 555555,'B');

        // Changing the name of object nataAlbot
        nataAlbot.name = "Nata Bolocan";
        nataAlbot.isRetired = true;
        System.out.println("Nata married with Andrei and changed her full name to: " +nataAlbot.name);

        // Creating 3 objects with the constructor that has 5(all) params
        Person misaPeicov = new Person("Misa Peicov", 444444,'A', false, "single");
        System.out.println(misaPeicov.name);

        Person slavaRadulov = new Person("Slava Radulov", 333333, 'F', true,"married");

        // Printing the "isRetired" status, that we have declared in the constructor
        System.out.println("Since we declared the isRetired status for Slava as true, we should see the same value " +
                "for the print result. The print result is: " + slavaRadulov.isRetired);

        Person irinaTabaranu = new Person("Irina Tabaranu", 222222, 'C', true, "concubine");
        //Printing the object's memory address, with no actual reason. Actually the reason is to use all the objects.
        System.out.println(irinaTabaranu);


    }
}
