package entities;

public class City {
    private String name;
    private String region;
    private String country;
    private long citizens;
    private int postalIndex;
    private int phoneCode;

    public City(String name, String region, String country, long citizens, int postalIndex, int phoneCode) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.citizens = citizens;
        this.postalIndex = postalIndex;
        this.phoneCode = phoneCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getCitizens() {
        return citizens;
    }

    public void setCitizens(long citizens) {
        this.citizens = citizens;
    }

    public int getPostalIndex() {
        return postalIndex;
    }

    public void setPostalIndex(int postalIndex) {
        this.postalIndex = postalIndex;
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }
}
