import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Task12(arr, false);

        System.out.println(Arrays.toString(arr));
    }

    public static void Task1() {
        System.out.println("\"Your time is limited,");
        System.out.println("\tso don't waste it");
        System.out.println("\t\tliving someone else's life\"");
        System.out.println("\t\t\tSteve Jobs");
    }

    public static void Task2() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int percent = scanner.nextInt();

        System.out.println(value * percent / 100);
    }

    public static void Task3() {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        int result = num3 + num2 * 10 + num1 * 100;
        System.out.println(result);
    }

    public static void Task4() {
        Scanner scanner = new Scanner(System.in);
        int number;

        number = scanner.nextInt();

        if (number < 100000 || number > 999999) {
            System.out.println("Error. Given number does not consist of 6 digits.");
        } else {
            int firstDigit = number / 100000;
            int secondDigit = (number / 10000) % 10;
            int fourthDigit = (number / 1000) % 10;
            int thirdDigit = (number / 100) % 10;
            int fifthDigit = (number / 10) % 10;
            int sixthDigit = number % 10;

            int mutatedNumber =
                    sixthDigit * 100000 +
                            fifthDigit * 10000 +
                            fourthDigit * 1000 +
                            thirdDigit * 100 +
                            secondDigit * 10 +
                            firstDigit;

            System.out.println("Mutated number: " + mutatedNumber);
        }

    }

    public static void Task5() {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

        String monthStr;
        if (month >= 3 && month <= 5) {
            monthStr = "Spring";
        } else if (month >= 6 && month <= 8) {
            monthStr = "Summer";
        } else if (month >= 9 && month <= 11) {
            monthStr = "Fall";
        } else {
            monthStr = "Winter";
        }
        System.out.println(monthStr);
    }

    public static void Task6() {

        double mToMi = 0.0006214;
        double mToFt = 3.2808;
        double mToYd = 1.0936;

        Scanner scanner = new Scanner(System.in);

        double meters = scanner.nextDouble();

        System.out.println("Miles: " + meters * mToMi);
        System.out.println("Feet: " + meters * mToFt);
        System.out.println("Yard: " + meters * mToYd);
    }

    public static void Task7() {

        Scanner scanner = new Scanner(System.in);

        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();

        if (startRange > endRange) {
            int temp = startRange;
            startRange = endRange;
            endRange = temp;

            System.out.println("Given range was incorrect and was normalized.");
        }

        for (int i = startRange; i < endRange; i++) {
            if ((i & 1) != 0) System.out.println(i);
        }
    }

    public static void Task8() {

        Scanner scanner = new Scanner(System.in);

        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();

        for (int i = startRange; i <= endRange; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " | ");
            }
            System.out.println();
            System.out.println("===========================================================================");
        }
    }

    public static void Task9() {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        fillArrayWithRandomNumbers(arr, -9, 10);

        System.out.println(Arrays.toString(arr));

        int max = arr[0], min = arr[0], countPositive = 0, countNegative = 0, countZero = 0;

        for (var item : arr) {
            if (item < min) {
                min = item;
            }

            if (item > max) {
                max = item;
            }

            if (item > 0) {
                countPositive++;
            } else if (item < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }

        System.out.println("Positive: " + countPositive + "\n" +
                "Negative: " + countNegative + "\n" +
                "Zeros: " + countZero + "\n" +
                "Max: " + max + "\n" +
                "Min: " + min);
    }

    public static void Task10() {

        Scanner scanner = new Scanner(System.in);

        var arr = new int[10];
        fillArrayWithRandomNumbers(arr, -9, 10);

        var evenNumbersArray = Arrays.stream(arr)
                .filter(number -> (number & 1) == 0)
                .toArray();

        var oddNumbersArray = Arrays.stream(arr)
                .filter(number -> (number & 1) != 0)
                .toArray();

        var positiveNumbersArray = Arrays.stream(arr)
                .filter(number -> number > 0)
                .toArray();

        var negativeNumbersArray = Arrays.stream(arr)
                .filter(number -> number < 0)
                .toArray();

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(evenNumbersArray));
        System.out.println(Arrays.toString(oddNumbersArray));
        System.out.println(Arrays.toString(positiveNumbersArray));
        System.out.println(Arrays.toString(negativeNumbersArray));
    }

    public static void Task11(int length, boolean isHorizontal, char symbol) {
        if (isHorizontal) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
        } else {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        }
    }

    public static void Task12(int[] arr, boolean isByAscending) {
        if (isByAscending) {
            Arrays.sort(arr);
        } else {
            Arrays.sort(arr);
            int temp;
            for (int i = 0; i < (int) (arr.length / 2); i++) {
                temp = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = arr[i];
                arr[i] = temp;
            }
        }
    }

    static void fillArrayWithRandomNumbers(int[] arr, int min, int max) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(min, max);
        }
    }

}