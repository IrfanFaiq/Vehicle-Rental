package Day1;

import java.util.Scanner;

class Vehicle{
    private String make;
    private String model;
    private int year;
    private double rentalPricePerDay;

    //constructor
    public Vehicle(String make, String model, int year, double rentalPricePerDay){
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    //Getter and setter for vehicle
    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getRentalPricePerDay(){
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay){
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public double calculateRentalCost(int days){
        return days * rentalPricePerDay;
    }
}

class Car extends Vehicle{
    private int numSeats;
    private int numDoors;

    //constructor to initialize
    public Car(String make, String model, int year, double rentalPricePerDay, int numSeats, int numDoors){
        super(make, model, year, rentalPricePerDay);
        this.numSeats = numSeats;
        this.numDoors = numDoors;
    }

    //Getter setter numseat numdoor
    public int getNumSeats(){
        return numSeats;
    }

    public void setNumSeats(int numSeats){
        this.numSeats = numSeats;
    }

    public int getNumDoors(){
        return numDoors;
    }

    public void setNumDoors(int numDoors){
        this.numDoors = numDoors;
    }
}

class Motorcycle extends Vehicle{
    private int engineSize;

    //constructor to initialize
    public Motorcycle(String make, String model, int year, double rentalPricePerDay, int engineSize){
        super(make, model, year, rentalPricePerDay);
        this.engineSize = engineSize;
    }

    //Getter setter enginSize
    public int getEngineSize(){
        return engineSize;
    }

    public void setEngineSize(int engineSize){
        this.engineSize = engineSize;
    }
}

public class VehicleRental {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Car car = new Car("amke?", "Nissan", 2012, 10, 4, 4);
        Motorcycle motorcycle = new Motorcycle("Kamek kita", "RTX 2050", 2012, 5, 220);

        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        double carRentalCost = car.calculateRentalCost(days);
        double MotorcycleRentalCost = motorcycle.calculateRentalCost(days);

        System.out.println("Car rental price for " + days + " days: RM" + carRentalCost + " Model: " + car.getModel() + " Make: " + car.getMake() + " Year: " + car.getYear() + " Seat and door number: " + car.getNumSeats() + " / " + car.getNumDoors());
        System.out.println("Motorcycle rental price for " + days + " days: RM" + MotorcycleRentalCost + " Model: " + motorcycle.getModel() + " Make: " + motorcycle.getMake() + " Year: " + motorcycle.getYear() + " Engine size: " + motorcycle.getEngineSize());

        scanner.close();

    }
}
