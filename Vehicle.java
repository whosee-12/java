// Base class
class Vehicle {
    // Attributes
    String make;
    String model;
    int year;

    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

// Derived class
class Car extends Vehicle {
    // Additional attribute
    int numberOfDoors;

    // Constructor
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); // Call the constructor of the base class
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display details of the car
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }


    public static void main(String[] args) {
        // Create an instance of the Car class and set values for its attributes
        Car myCar = new Car("Toyota", "Camry", 2022, 4);

        // Call the displayDetails method to print out the details of the car
        myCar.displayDetails();
    }
}
