package entities;

import java.util.Scanner;

public class Fraction {
    private double numerator;
    private double denominator;

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            throw new IllegalArgumentException("Знаменатель не может быть равен 0.");
        }
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public double getNumerator() {
        return numerator;
    }

    public void setDenominator(double denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            throw new IllegalArgumentException("Знаменатель не может быть равен 0.");
        }
    }

    public double getDenominator() {
        return denominator;
    }

    public void inputFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числитель: ");
        numerator = scanner.nextInt();

        System.out.print("Введите знаменатель: ");
        int tempDenominator = scanner.nextInt();
        if (tempDenominator != 0) {
            denominator = tempDenominator;
        } else {
            throw new IllegalArgumentException("Знаменатель не может быть равен 0.");
        }
    }

    public void outputFraction() {
        System.out.println(numerator + "/" + denominator);
    }

    public Fraction add(Fraction other) {
        double commonDenominator = this.denominator * other.denominator;
        double newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }

    public Fraction subtract(Fraction other) {
        double commonDenominator = this.denominator * other.denominator;
        double newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }

    public Fraction multiply(Fraction other) {
        double newNumerator = this.numerator * other.numerator;
        double newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно.");
        }
        double newNumerator = this.numerator * other.denominator;
        double newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }
}
