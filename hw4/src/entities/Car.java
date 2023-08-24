package entities;

public class Car {
    private String modelName;
    private String manufacturer;
    private int year;
    private double engineVolume;

    // Constructors
    public Car(String modelName, String manufacturer, int year, double engineVolume) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    // Getters and Setters
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    // Display method
    public void display() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year: " + year);
        System.out.println("Engine Volume: " + engineVolume + "L");
    }

    // Override toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Model Name: ").append(modelName).append("\n");
        sb.append("Manufacturer: ").append(manufacturer).append("\n");
        sb.append("Year: ").append(year).append("\n");
        sb.append("Engine Volume: ").append(engineVolume).append("L").append("\n");
        return sb.toString();
    }
}