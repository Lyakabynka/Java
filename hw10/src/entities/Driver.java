package entities;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    private final String name;
    private final int experience;
    private boolean available;
    private double earnings;
    private final List<Cargo> cargoHistory;

    public Driver(String name, int experience) {
        this.name = name;
        this.experience = experience;
        this.available = true;
        this.earnings = 0.0;
        this.cargoHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public boolean isAvailable() {
        return available;
    }

    public double getEarnings() {
        return earnings;
    }

    public List<Cargo> getCargoHistory() {
        return cargoHistory;
    }

    public void assignCargo(Cargo cargo) {
        this.available = false;
        cargoHistory.add(cargo);
    }

    public void completeTrip(double payment) {
        this.available = true;
        this.earnings += payment;
    }

    public void makeRepairRequest() {
        this.available = false;
    }
}
