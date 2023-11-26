package VehiclesInformation;

public class Motorcycle extends VehiclesInformation.Vehicle {
    private String BikeType;
    public Motorcycle(String make,String model,int year,double RentalRate,String BikeType)
    {
        super(make,model,year,RentalRate);
        this.BikeType=BikeType;
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Bike Type: "+BikeType);
    }
}
