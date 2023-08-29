package entities;

import entities.abstractions.Building;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Street {
    private String name;
    private ArrayList<Building> buildings;

    public Street() {
        name = "";
        buildings = new ArrayList<Building>();
    }

    public Street(String name, ArrayList<Building> buildings) {
        this.name = name;
        this.buildings = buildings;
    }

    public Street(String name) {
        this.name = name;
        buildings = new ArrayList<Building>();
    }

    public boolean addBuilding(Building building) {
        return buildings.add(building);
    }

    public boolean removeBuilding(Building building) {
        return buildings.remove(building);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (var building:buildings) {
            sb.append(building.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
