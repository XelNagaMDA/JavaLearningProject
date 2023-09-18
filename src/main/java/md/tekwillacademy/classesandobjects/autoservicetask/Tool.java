package md.tekwillacademy.classesandobjects.autoservicetask;

public class Tool {
    public double price;
    public String name;
    public float weight;
    public Tool(String name){
        this.name = name;
        System.out.println("You've created a Tool object, with the following name: " + this.name);
    }
    public Tool(){
        System.out.println("You've created a Tool object. The are no details about it. Here are the new details: this.name "
                + this.name + " and this.price " + this.price);
    }

}
