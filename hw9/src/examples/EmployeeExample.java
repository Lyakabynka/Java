package examples;

import entities.Employee;
import entities.Student;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class EmployeeExample {
    public static void main(String[] args) {
        Random random = new Random();
        List<Student> students = random.ints(100, 18, 30)
                .mapToObj(i -> new Student("Student" + i, i, "Group" + (i % 10)))
                .collect(Collectors.toList());

        List<Employee> employees = students.stream()
                .map(student -> new Employee(student.getFullName(), "Surname", "Patronymic", student.getAge()))
                .collect(Collectors.toList());

        System.out.println("Список работников: " + employees);
    }
}





