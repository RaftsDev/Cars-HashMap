import java.util.HashMap;
import java.util.Map;

// Class of available tickets of airlines

public class Bookable {
    private String name;
    //public ArrayList<Cars> carsAvailable = new ArrayList<>();

    public Map<Integer, Cars> carsAvailable=new HashMap<Integer,Cars>();

    public Bookable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCar(Cars car) {

            //Put car object in HashMap, increment key value
            this.carsAvailable.put(car.getLot(), car);
            //System.out.println("You have added car: "+ car.getCompanyName() + "--"+car.getModel()+"-("+car.getSize()+")-Location: "+car.getPickUpLocation()+" pick up time:"+car.getPickUpDate()+" in the database.");
            //System.out.println("The number of available cars is " + this.carsAvailable.size() +" in the database now.");

    }

    public void removeCar(Cars car) {

        if (!carsAvailable.containsKey(car.getLot())) {
            System.out.println("Car "+car.getCompanyName() + "--"+car.getModel()+"-("+car.getSize()+")-Location: "+car.getPickUpLocation()+" pick up time:"+car.getPickUpDate()+" not in database!");
        } else {
            carsAvailable.remove(car.getLot());
            System.out.println("You have removed car "+ car.getCompanyName() + "--"+car.getModel()+"-("+car.getSize()+")-Location: "+car.getPickUpLocation()+" pick up time: "+car.getPickUpDate()+ " from the database.");
            System.out.println("The number of available cars is " + carsAvailable.size() +" in the database now.");
        }
    }
    public void print(){
        System.out.println("\n--------------------------------------------- CARS FOR RENT --------------------------------------------------------");
        for(Integer i : carsAvailable.keySet()){
            Cars car=carsAvailable.get(i);
            System.out.printf("\n|Lot#:%2d| Company: %15s | %15s(%7s) | Location: %15s | Pick up:%15s|", car.getLot(),car.getCompanyName(),car.getModel(),car.getSize(),car.getPickUpLocation(),car.getPickUpDate());
            //System.out.printf(":"+car);
        }
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
    }




}
