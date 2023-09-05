package entities;

public class Vehicle {
    private final String plateNumber;
    private final double capacity;
    private boolean available;

    public Vehicle(String plateNumber, double capacity) {
        this.plateNumber = plateNumber;
        this.capacity = capacity;
        this.available = true;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public double getCapacity() {
        return capacity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void assignToTrip() {
        this.available = false;
    }

    public void completeTrip() {
        this.available = true;
    }

    public void breakDown() {
        this.available = false;
    }
}
