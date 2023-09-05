package entities;

public class Trip {
    private final Driver driver;
    private final Vehicle vehicle;
    private final Cargo cargo;
    private double payment;

    public Trip(Driver driver, Vehicle vehicle, Cargo cargo) {
        this.driver = driver;
        this.vehicle = vehicle;
        this.cargo = cargo;
        this.driver.assignCargo(cargo);
        this.vehicle.assignToTrip();
    }

    public void complete() {
        this.vehicle.completeTrip();
        this.driver.completeTrip(payment);
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public double getPayment() {
        return this.payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public Driver getDriver() {
        return driver;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
