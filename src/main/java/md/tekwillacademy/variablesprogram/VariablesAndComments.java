package md.tekwillacademy.variablesprogram;

public class VariablesAndComments {
    public static void main(String[] args) {
        // Primitive variables declaration
        // Will use Person class related types

        // Truth based variables
        boolean isAlive;
        boolean isMarried;

        // Char based variables
        char gender;
        char drivingLicence;

        // Numeric based variables
        byte children;
        byte age;

        short weight;
        short height;

        int mobilePhoneNumber;
        int workPhoneNumber;

        long id;
        long bankAccountId;

        float salaryBrut;
        float salaryNet;

        double livingSurface;
        double cryptoAccount;

        // Initializing the variables for a Person example

        isAlive = true;
        isMarried = false;
        gender = 'F';
        drivingLicence = 'A';
        children = 1;
        age = 33;
        weight = 53;
        height = 177;
        mobilePhoneNumber = 66666666;
        workPhoneNumber = 222222;
        id = 123412341234L;
        bankAccountId = 6473735586635284L;
        salaryBrut = 50342.3F;
        salaryNet = 35357.9F;
        livingSurface = 0.03457324D;
        cryptoAccount =328465453.5568678463D;

        System.out.println("Olivia is " + age + " years old and has a monthly net salary of " + salaryNet + " euro.");
    }
}
