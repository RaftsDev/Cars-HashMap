package Hmap;

import java.util.ArrayList;

// Class of implementation customer list
public class Reservation {
    private String name; //customer name

    //Collection - customer order list of tickets
    private ArrayList<Cars> customerList = new ArrayList<>();

    public Reservation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCarsToList(Cars car) {
        if(customerList.contains(car)) {
            //Change seat property to car object in Database and add to customer list
            System.out.println("This car is already in your list");
        }
        else {
            customerList.add(car);
        }
        System.out.println("\nYou have added car: "+car.getModel()+" model of "+ car.getCompanyName()+ "company  in "+ car.getPickUpLocation()+" at "+car.getPickUpDate()+" in your list.");
        System.out.printf("Your total price for the cars to book is: %.2f", this.getTotalPrice());
    }

    public void removeCarFromList(Cars car) { //remove ticket from order list
        if (!customerList.contains(car)) {
            System.out.println("Car "+car.getModel()+" model of "+ car.getCompanyName()+ "company  in "+ car.getPickUpLocation()+" at "+car.getPickUpDate()+" doesnt exist in your list");
        } else {
            customerList.remove(car);
            System.out.println("You have removed car "+car.getModel()+" model of "+ car.getCompanyName()+ "company  in "+ car.getPickUpLocation()+" at "+car.getPickUpDate()+" doesnt exist in your list" + " from your list.");
            System.out.printf("Your total price for the cars to book is: %.2f", this.getTotalPrice());
        }
    }

    public float getTotalPrice() {  //Total price of tickets in the order list
        float total = 0;
        for(Cars i : customerList){
            total += i.getPrice();
        }
        return total;
    }
}
