package entities;

public class Country {
    private String name;
    private String continent;
    private long citizens;
    private int phoneCode;
    private String capital;
    private String[] cities;

    public Country(String name, String continent, long citizens, int phoneCode, String capital, String[] cities) {
        this.name = name;
        this.continent = continent;
        this.citizens = citizens;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = cities;
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

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }
}
