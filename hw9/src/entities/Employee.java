package entities;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private int age;

    public Employee(String name, String surname, String patronymic, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
    }
}
