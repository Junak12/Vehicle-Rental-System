package VehiclesInformation;

public class Vehicle {
    private String make;
    private String model;
    private int  year;
    private double RentalRate;

    public Vehicle(String make,String model,int year,double RentRate)
    {
        this.make=make;
        this.model=model;
        this.year=year;
        this.RentalRate=RentRate;
    }
    public void DisplayInfo()
    {
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("RentalRate: "+RentalRate);
    }
    public double getRentalRate()
    {
        return RentalRate;
    }
    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
}
