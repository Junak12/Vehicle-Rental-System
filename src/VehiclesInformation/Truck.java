package VehiclesInformation;

public class Truck extends VehiclesInformation.Vehicle {
    private int Capacity;
    private String cargoType;
    public Truck(String make,String model,int year,double RentalRate,int Capacity,String cargoType)
    {
        super(make,model,year,RentalRate);
        this.Capacity=Capacity;
        this.cargoType=cargoType;
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Load Capacity "+Capacity);
        System.out.println("Cargo Type "+cargoType);
    }

}
