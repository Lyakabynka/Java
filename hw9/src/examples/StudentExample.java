package examples;

import entities.Student;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StudentExample {
    public static void main(String[] args) {
        Random random = new Random();
        List<Student> students = random.ints(100, 10, 25)
                .mapToObj(i -> new Student("Student" + i, i, "Group" + (i % 10)))
                .collect(Collectors.toList());

        List<String> youngStudentLastNames = students.stream()
                .filter(student -> student.getAge() < 16)
                .map(student -> student.getFullName().split(" ")[0]) // Берем только фамилию
                .collect(Collectors.toList());

        System.out.println("Фамилии студентов младше 16 лет: " + youngStudentLastNames);
    }
}
