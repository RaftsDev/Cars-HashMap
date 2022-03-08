public class Main {

    public static void main(String[] args) {

        AmericanWheels car1 = new AmericanWheels(10.00f, "Mazda3", "March,01,2022", "March,02,2022", "Los Angeles", "San Francisco, CA");
        AmericanWheels car2 = new AmericanWheels(15.00f, "Toyota Corolla", "March,02,2022", "March,05,2022", "San Francisco", "Los Angeles, CA");
        AmericanWheels car3 = new AmericanWheels(17.00f, "Hyundai Elantra", "March,03,2022", "March,05,2022", "Irvine, CA", "Los Angeles, CA");
        AmericanRoads car4 = new AmericanRoads(25.00f, "Hyundai Elantra", "March,03,2022", "March,05,2022", "Irvine, CA", "Los Angeles, CA");
        AmericanRoads car5 = new AmericanRoads(27.00f, "Chevrolet Spark", "April,05,2022", "April,07,2022","Pittsburgh, PA", "Jersey city, NJ");
        Commuter car6 = new Commuter(30.00f, "Ford Focus", "April,07,2022", "April,09,2022","Brooklyn, NY","NYC, NY");
        Commuter car7 = new Commuter(40.00f, "Nissan Versa", "April,03,2022", "April,05,2022","Queens, NY","NYC, NY");
        AmericanRoads car8 = new AmericanRoads(50.00f, "Toyota Corolla", "April,05,2022", "April,07,2022","Brooklyn, NY","Queens, NY");

        //Fill out list of available flights in Order System
        Bookable orderList = new Bookable("Order system");
        orderList.addCar(car1);
        orderList.addCar(car2);
        orderList.addCar(car3);
        orderList.addCar(car4);
        orderList.addCar(car5);
        orderList.addCar(car6);
        orderList.addCar(car7);
        orderList.addCar(car8);
        orderList.addCar(car1);

        Reservation PinalList = new Reservation("Pinal's list");
        String location = "Brooklyn, NY";
        for(Cars i : orderList.carsAvailable){
            if(i.getPickUpLocation() == location){
                PinalList.addCarsToList(i);
            }
        }

    }
}
