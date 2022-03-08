import java.util.ArrayList;

// Class of available tickets of airlines

public class Bookable {
    private String name;
    public ArrayList<Cars> carsAvailable = new ArrayList<>();

    public Bookable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCar(Cars car) {
        if(this.carsAvailable.contains(car)) {
            System.out.println("The car "+car.getModel()+" model of "+ car.getCompanyName()+ "company  in "+ car.getPickUpLocation()+" at "+car.getPickUpDate()+" already exists in the database.");
        }
        else {
            this.carsAvailable.add(car);
        }
        System.out.println("You have added car: "+ car.getCompanyName() + "--"+car.getModel()+"-("+car.getSize()+")-Location: "+car.getPickUpLocation()+" pick up time:"+car.getPickUpDate()+" in the database.");
        System.out.println("The number of available cars is " + this.carsAvailable.size() +" in the database now.");

    }

    public void removeCar(Cars car) {
        if (!carsAvailable.contains(car)) {
            System.out.println("Car "+car.getCompanyName() + "--"+car.getModel()+"-("+car.getSize()+")-Location: "+car.getPickUpLocation()+" pick up time:"+car.getPickUpDate()+" not in database!");
        } else {
            carsAvailable.remove(car);
            System.out.println("You have removed car "+ car.getCompanyName() + "--"+car.getModel()+"-("+car.getSize()+")-Location: "+car.getPickUpLocation()+" pick up time: "+car.getPickUpDate()+ " from the database.");
            System.out.println("The number of available cars is " + carsAvailable.size() +" in the database now.");
        }
    }



}
