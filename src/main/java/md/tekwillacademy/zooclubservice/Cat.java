package md.tekwillacademy.zooclubservice;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("A cat meows.");
    }

    @Override
    public void eat() {
        System.out.println(" A cat eats cat food.");
    }
}
