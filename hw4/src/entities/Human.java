package entities;

import java.util.Date;

public class Human {
    private String fullName;
    private Date birthDate;
    private String phone;
    private String city;
    private String country;
    private String address;


    public Human Create(String fullName,
                        Date birthDate,
                        String phone,
                        String city,
                        String country,
                        String address) {
        return new Human(fullName, birthDate, phone, city, country, address);
    }

    public Human(String fullName,
                 Date birthDate,
                 String phone,
                 String city,
                 String country,
                 String address) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
    }


    @Override
    public String toString() {
        return fullName + '\n'
                + birthDate.toString() + '\n'
                + phone + '\n'
                + city + '\n'
                + country + '\n'
                + address + '\n';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
