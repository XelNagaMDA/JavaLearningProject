package md.tekwillacademy.zooclubservice;

public class Dog extends Animal {

    private boolean hasAGoodLife;

    public Dog( String dogName, boolean hasAGoodLife) {
        super(dogName);
        this.hasAGoodLife = hasAGoodLife;
    }

    @Override
    public void makeSound() {
        System.out.println("A dog barks.");
    }

    @Override
    public void eat() {
        System.out.println("A dog eats dog food.");
    }

    public String getName() {
        return this.name + " - This is from the child class";
    }
}
