package md.tekwillacademy.classesandobjects.autoservicetask;

public class Car {
    public String vinNumber;
    public String plateNumber;
    public String make;
    public int kmWhenEnteredTheService;
    public String model;

    public Car(String enteredVinNumber, String enteredPlateNumber, String enteredMake) {
        this.vinNumber = enteredVinNumber;
        this.plateNumber = enteredPlateNumber;
        this.make = enteredMake;
    }
    public Car(String model){
        this.model = model;
    }
}
