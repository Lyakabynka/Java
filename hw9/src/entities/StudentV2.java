package entities;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StudentV2 {
    private String fullName;
    private int age;
    private String group;
    private int points;

    public StudentV2(String fullName, int age, String group, int points) {
        this.fullName = fullName;
        this.age = age;
        this.group = group;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}