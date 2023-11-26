package Engin;

import VehiclesInformation.Vehicle;

import java.util.ArrayList;
import java.util.List;
public class RentalSystem {
    private List<Vehicle>ad1;
    private List<Vehicle>Re1;
    public RentalSystem() {
        ad1 = new ArrayList<>();
        Re1 = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle)
    {
        ad1.add(vehicle);
    }
    public List<Vehicle>getAd1()
    {
        return ad1;
    }
    public List<Vehicle>getRe1()
    {
        return Re1;
    }
    public void RentVehicle(Vehicle vehicle)
    {
        if(ad1.contains(vehicle))
        {
            ad1.remove(vehicle);
            Re1.add(vehicle);
        }
    }
    public void ReturnVehicle(Vehicle vehicle)
    {
        if(Re1.contains(vehicle))
        {
            Re1.remove(vehicle);
            ad1.add(vehicle);
        }
    }
    public void DisplayInfo()
    {
        System.out.println("Available Vehicles: ");
        for(Vehicle d:ad1)
        {
            d.DisplayInfo();
            System.out.println();
        }
        System.out.println("Rented Vehicle: ");
        {
            for(Vehicle rd:Re1)
            {
                rd.DisplayInfo();
                System.out.println();
            }
        }
    }
    public void displayforrent()
    {
        System.out.println("Available Vehicles: ");
        for(Vehicle d:ad1)
        {
            d.DisplayInfo();
            System.out.println();
        }
    }
    public double Totalcost(Vehicle vehicle,int days)
    {
        double rate= vehicle.getRentalRate();
        double cost=rate*days;
        return cost;
    }
    public void rentedVehicle()
    {
        System.out.println("Rented Vehicle: ");
        {
            for(Vehicle rd:Re1)
            {
                rd.DisplayInfo();
                System.out.println();
            }
        }
    }
}
