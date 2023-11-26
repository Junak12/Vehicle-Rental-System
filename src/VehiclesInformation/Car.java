package VehiclesInformation;

public class Car extends Vehicle {
    private int doors;
    private String fuelType;
    public Car(String make,String model,int year,double RentalRate,int doors,String fuelType)
    {
        super(make,model,year,RentalRate);
        this.doors=doors;
        this.fuelType=fuelType;
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Number of doors: "+doors);
        System.out.println("Fuel Type : "+fuelType);
    }
}
