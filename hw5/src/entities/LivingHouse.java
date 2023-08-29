package entities;

import entities.abstractions.Building;

public class LivingHouse extends Building {

    private int tenants;

    public LivingHouse(String address, int squareMeters, int tenants) {
        super(address, squareMeters);

        this.tenants = tenants;
    }

    public int getTenants() {
        return tenants;
    }

    public void setTenants(int tenants) {
        this.tenants = tenants;
    }

    @Override
    public String toString() {
        return tenants + "\n" + super.toString();
    }
}
