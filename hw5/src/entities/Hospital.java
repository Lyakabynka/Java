package entities;

import entities.abstractions.Building;

public class Hospital extends Building {
    private int patients;

    public Hospital(String address, int squareMeters, int patients) {
        super(address, squareMeters);

        this.patients = patients;
    }

    public int getPatients() {
        return patients;
    }

    public void setPatients(int patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return patients + "\n" + super.toString();
    }
}
