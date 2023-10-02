package md.tekwillacademy.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Cookie", true);
        System.out.println(dog1.getName());
        dog1.eat();

        dog1.makeSound();

        Dog dog2 = new Dog("Pufic", false);
        System.out.println(dog2.getName());

        Cat cat1 = new Cat("Ciri");
        cat1.eat();
        cat1.makeSound();


    }
}
