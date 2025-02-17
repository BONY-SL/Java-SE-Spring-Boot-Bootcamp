package demo.car;

public class Car {

    private Integer registerdID;
    private String model;
    private String color;
    private String manufactureYear;
    private String brand;

    {
        System.out.println("Instance Block Run");
        // instance block provide default value for class instance variables
    }

    static {
        System.out.println("Static Block Run");
        // Run First
        //static block provide default value for class variables
    }
    public Car(){

    }

    public Car(Integer registerdID, String model, String color, String manufactureYear, String brand) {
        this.registerdID = registerdID;
        this.model = model;
        this.color = color;
        this.manufactureYear = manufactureYear;
        this.brand = brand;
    }

    public Integer getRegisterdID() {
        return registerdID;
    }

    public void setRegisterdID(Integer registerdID) {
        this.registerdID = registerdID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString(){
        return "Car ID : "+this.getRegisterdID() + "\n"+
                "Car Model : "+this.getModel()+ "\n"+
                "Color : "+this.getColor()+ "\n"+
                "Manufacture Year : "+this.getManufactureYear()+ "\n"+
                "Brand : "+this.getBrand()+ "\n";
    }

    public static void main(String[] args) {

        System.out.println(1);
        Car c = new Car();

    }
}
