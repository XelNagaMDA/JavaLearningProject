package md.tekwillacademy.classesandobjects;

import md.tekwillacademy.classesandobjects.autoservicetask.Car;
import md.tekwillacademy.classesandobjects.autoservicetask.Garage;
import md.tekwillacademy.classesandobjects.autoservicetask.Tool;
import md.tekwillacademy.classesandobjects.autoservicetask.Worker;

public class ManageAutoService {
    public static void main(String[] args) {

        // Declaring and creating Car class objects, that has 2 constructors, one with 3 and one with 1 params
        Car mazda3 = new Car("JV143543535654", "WJW 111", "Mazda");
        Car honda = new Car("Civic");

        Car toyota = new Car("Prius");
        toyota.kmWhenEnteredTheService = 130277;



        // Declaring and creating Garage class objects that has the default, no param constructor
        Garage japanCarService = new Garage();
        japanCarService.name = "Made in Japan - Car Service";
        japanCarService.service = "All Included Services";
        japanCarService.address = "Dacia 47";


        // Declaring and creating a Worker class object
        Worker worker1 = new Worker();
        worker1.age = 45;
        worker1.name = "Takayashi Popescu";
        worker1.specialization = "Electrical Mechanic";


        // Declaring and creating Tool class objects
        Tool screwdriver = new Tool("Screwdriver");
        screwdriver.price = 15.0F;
        screwdriver.weight = 200;

        Tool plier = new Tool();
        plier.name = "Plier";

        System.out.println("There is a new car service in Chisinau named " + japanCarService.name + ", that serves" +
                " japanese made cars. Its garage-office opened at the following address: " + japanCarService.address);
        System.out.println("The garage has the following option for premium members: " + japanCarService.service);
        System.out.println("The owner is " + worker1.name + ", a " + worker1.age + " years old resident." +
                " He is a " + worker1.specialization + " by specialization.");
        System.out.println("He's a humble and respectful mechanic that owns a " + toyota.model + " and loves working " +
                "at the car with his hands, using his 2 favorite tools: the " + screwdriver.name +
                " and the " + plier.name);


    }
}
