package entities;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AutoBase {
    public static void main(String[] args) {
        List<Driver> drivers = new ArrayList<>();
        List<Vehicle> vehicles = new ArrayList<>();
        List<Cargo> cargoRequests = generateRandomCargoRequests();



        Dispatcher dispatcher = new Dispatcher(drivers, vehicles);

        for (Cargo cargo : cargoRequests) {
            Trip trip = dispatcher.assignTrip(cargo);

            if (trip != null) {
                trip.complete();
                logTrip(trip);
            }
        }
    }

    private static List<Cargo> generateRandomCargoRequests() {
        //тесты
        List<Cargo> cargoRequests = new ArrayList<>();

        return cargoRequests;
    }

    private static void logTrip(Trip trip) {

        try {
            FileWriter writer = new FileWriter("trip_log.txt", true);
            writer.write("Driver: " + trip.getDriver().getName() + ", Vehicle: " + trip.getVehicle().getPlateNumber()
                    + ", Cargo Destination: " + trip.getCargo().getDestination() + ", Payment: $" + trip.getPayment() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
