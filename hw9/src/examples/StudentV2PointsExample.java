package examples;

import entities.StudentV2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StudentV2PointsExample {
    public static void main(String[] args) {
        Random random = new Random();
        List<StudentV2> students = random.ints(100, 10, 25)
                .mapToObj(i -> new StudentV2("Student" + i, i, "Group" + (i % 10), random.nextInt(101)))
                .collect(Collectors.toList());

        double averagePoints = students.stream()
                .mapToDouble(StudentV2::getPoints)
                .average()
                .orElse(0);

        System.out.println("Средний балл всех студентов: " + averagePoints);
    }
}