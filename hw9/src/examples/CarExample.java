package examples;

import entities.Car;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CarExample {
    public static void main(String[] args) {
        Random random = new Random();
        List<Car> cars = random.ints(100, 1, 300)
                .mapToObj(i -> new Car("Car" + i, randomColor(), i))
                .collect(Collectors.toList());

        Car fastestRedCar = cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase("red"))
                .max((car1, car2) -> Integer.compare(car1.getMaxSpeed(), car2.getMaxSpeed()))
                .orElse(null);

        if (fastestRedCar != null) {
            System.out.println("Самая быстрая красная машина: " + fastestRedCar.getName());
        } else {
            System.out.println("Красных машин не найдено.");
        }
    }

    private static String randomColor() {
        String[] colors = {"red", "blue", "green", "yellow", "black", "white"};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
