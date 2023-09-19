package md.tekwillacademy.accessmodifiers.peopleevidence;

public class Person {
    // Defining a class variable
    public static boolean hasSoul = true;


    // Private access - variable "IDNP" is an instance variable because it defines the objects of the Person class
    // Also, IDNP is a constant
    private final long IDNP;

    // Default access - variable "maritalStatus" is an instance variable
    String maritalStatus;

    // Protected access - variable "drivingCategory" is an instance variable
    protected char drivingCategory;

    // Public access - variable "isRetired" is an instance variable
    public boolean isRetired;

    // Public access - variable "name" is an instance variable
    public String name;

    public  Person(String name, long idnp, char drivingCategory){
        this.name = name;
        IDNP = idnp;
        this.drivingCategory = drivingCategory;
        System.out.println("This is an object initialization with 3 params.");
    }

    public  Person(String name, long idnp, char drivingCategory, boolean isRetired, String maritalStatus){
        this.name = name;
        IDNP = idnp;
        this.drivingCategory = drivingCategory;
        this.isRetired = isRetired;
        this.maritalStatus = maritalStatus;
        System.out.println("This is an object initialization with 5(all) params.");

    }






}
