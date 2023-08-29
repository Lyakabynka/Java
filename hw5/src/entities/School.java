package entities;

import entities.abstractions.Building;
import entities.enums.SchoolType;

public class School extends Building {

    private SchoolType type;
    private int students;

    public School(String address, int squareMeters, SchoolType type, int students) {
        super(address, squareMeters);

        this.type = type;
        this.students = students;
    }

    public SchoolType getType() {
        return type;
    }

    public void setType(SchoolType type) {
        this.type = type;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return type.toString() + "\n"  + students + "\n" + super.toString();
    }
}
