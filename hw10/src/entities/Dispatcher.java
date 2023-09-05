package entities;

import java.util.List;

public class Dispatcher {
    private final List<Driver> drivers;
    private final List<Vehicle> vehicles;

    public Dispatcher(List<Driver> drivers, List<Vehicle> vehicles) {
        this.drivers = drivers;
        this.vehicles = vehicles;
    }

    public Trip assignTrip(Cargo cargo) {

        Driver selectedDriver = null;
        Vehicle selectedVehicle = null;

        for (Driver driver : drivers) {
            if (driver.isAvailable() && driver.getExperience() >= calculateRequiredExperience(cargo)) {
                selectedDriver = driver;
                break;
            }
        }

        if (selectedDriver == null) {
            return null; // No available driver found
        }

        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable() && vehicle.getCapacity() >= cargo.getQuantity()) {
                selectedVehicle = vehicle;
                break;
            }
        }

        if (selectedVehicle == null) {
            return null; // No suitable vehicle found
        }

        Trip trip = new Trip(selectedDriver, selectedVehicle, cargo);
        trip.setPayment(calculatePayment(cargo));

        return trip;
    }

    private int calculateRequiredExperience(Cargo cargo) {
        return 1;
    }

    private double calculatePayment(Cargo cargo) {
        return 100.0;
    }
}
