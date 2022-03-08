package Hmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Class of implementation customer list
public class Reservation {
    private String name; //customer name

    //Collection - customer order list of tickets
    private Map<Integer, Cars> customerList = new HashMap<Integer, Cars>();

    public Reservation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCarsToList(Integer lot, Cars car) {
        if(customerList.containsKey(lot)) {
            //Change seat property to car object in Database and add to customer list
            System.out.println("This car is already in your list");
        }
        else {
            customerList.put(lot, car);
        }
        System.out.println("\nYou have added car: "+car.getModel()+" model of "+ car.getCompanyName()+ "company  in "+ car.getPickUpLocation()+" at "+car.getPickUpDate()+" in your list.");
        System.out.printf("Your total price for the cars to book is: %.2f", this.getTotalPrice());
    }

    public void removeCarFromList(Integer lot, Cars car) { //remove ticket from order list
        if (!customerList.containsKey(lot)) {
            System.out.println("Car "+car.getModel()+" model of "+ car.getCompanyName()+ "company  in "+ car.getPickUpLocation()+" at "+car.getPickUpDate()+" doesnt exist in your list");
        } else {
            customerList.remove(lot);
            System.out.println("You have removed car "+car.getModel()+" model of "+ car.getCompanyName()+ "company  in "+ car.getPickUpLocation()+" at "+car.getPickUpDate()+" doesnt exist in your list" + " from your list.");
            System.out.printf("Your total price for the cars to book is: %.2f", this.getTotalPrice());
        }
    }

    public float getTotalPrice() {  //Total price of tickets in the order list
        float total = 0;
        for(Integer i : customerList.keySet()){
            total += customerList.get(i).getPrice();
        }
        return total;
    }
}
