public abstract class Cars {
    public String companyName;
    private float price;
    private String model;
    private String size;
    private String pickUpDate;
    private String dropOffDate;
    private String pickUpLocation;
    private String DropOffLocation;

    public Cars(float price, String model, String pickUpDate, String dropOffDate, String pickUpLocation, String DropOffLocation) {
       // this.companyName = companyName;
        this.price = price;
        this.model = model;
        if ((model == "Mazda3") || (model=="Toyota Corola") || (model=="Hyundai Elantra")){
            this.size = "Midsize";
        }else if((model == "Chevrolet Spark") || (model=="Ford Fiesta")){
            this.size = "Economy";
        }else {
            this.size = "Compact";
        }
        this.pickUpDate = pickUpDate;
        this.dropOffDate = dropOffDate;
        this.pickUpLocation = pickUpLocation;
        this.DropOffLocation = DropOffLocation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public float getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getPickUpDate() {
        return pickUpDate;
    }

    public String getDropOffDate() {
        return dropOffDate;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public String getDropOffLocation() {
        return DropOffLocation;
    }
}
