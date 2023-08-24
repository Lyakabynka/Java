package entities;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;
    private String continent;
    private long citizens;
    private int phoneCode;
    private String capital;
    private List<String> cities;

    public Country(String name, String continent, long citizens, int phoneCode, String capital, List<String> cities) {
        this.name = name;
        this.continent = continent;
        this.citizens = citizens;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = cities != null ? cities : new ArrayList<String>();
    }

    @Override
    public String toString() {
        //Here I started using StringBuilder, as it is much more efficient.
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append('\n');
        sb.append("Continent: ").append(continent).append('\n');
        sb.append("Citizens: ").append(citizens).append('\n');
        sb.append("Phone Code: ").append(phoneCode).append('\n');
        sb.append("Capital: ").append(capital).append('\n');

        sb.append("Cities: \n");
        for (String city : cities) {
            sb.append("- ").append(city).append('\n');
        }

        return sb.toString();
    }

    public void addCity(String city) {
        cities.add(city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public long getCitizens() {
        return citizens;
    }

    public void setCitizens(long citizens) {
        this.citizens = citizens;
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }
}
