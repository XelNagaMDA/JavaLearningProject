package md.tekwillacademy.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        System.out.println(DataGeneratorUtil.getRandomInt(20, 100));
        System.out.println(DataGeneratorUtil.getRandomInt(100, 120));
        System.out.println(DataGeneratorUtil.getRandomInt(120, 100));

        int randomInt = DataGeneratorUtil.getRandomInt(1, 2);
        System.out.println(randomInt);


        int randomInt2 = DataGeneratorUtil.getRandomInt(333);
        System.out.println(randomInt2);

        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));

        Customer customer1 = new Customer("John Wick", "Male", 131);

        String infoAboutCustomer1 = customer1.toString();
        System.out.println(infoAboutCustomer1);

        customer1.setAge(44);
        System.out.println(customer1.toString());

        Customer customer2 = new Customer("Helen Not-Wick", "Female", 39);
        System.out.println(customer2.toString());

        customer2.setName("Helen Wick");
        System.out.println(customer2.toString());

        System.out.println("John Wick's age is: " + customer1.getAge());
        System.out.println("John Wick's wife name is: " + customer2.getName());


    }
}
