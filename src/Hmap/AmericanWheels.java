package Hmap;

public class AmericanWheels extends Cars {

    public AmericanWheels(float price, String model, String pickUpDate, String dropOffDate, String pickUpLocation, String DropOffLocation) {
        super(price, model,  pickUpDate, dropOffDate, pickUpLocation, DropOffLocation);
        this.companyName = "American Wheels";
    }
}
