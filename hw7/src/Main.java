import entities.User;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Task1();
    }

    public static void Task1() {
        //Task 1

        // a. Создать ArrayList<String> (list1)
        ArrayList<String> list1 = new ArrayList<>();

// b. Создать массив строк. Добавить в список все элементы массива (одним методом)
        String[] array = {"one", "two", "three"};
        list1.addAll(Arrays.asList(array));

// c. Создать новый (list2) ArrayList<String>, проинициализировав его предыдущим списком
        ArrayList<String> list2 = new ArrayList<>(list1);

// d. Создать список (list3) используя Arrays.asList(…)
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("four", "five", "six"));

// e. Вставить list3 в середину list2
        list2.addAll(list2.size() / 2, list3);

// f. Отсортировать список по убыванию.
        Collections.sort(list2, Collections.reverseOrder());

// g. *Удалить каждый второй элемент списка используя listiterator
        ListIterator<String> iterator = list2.listIterator();
        while (iterator.hasNext()) {
            iterator.next(); // Пропустить один элемент
            if (iterator.hasNext()) {
                iterator.next(); // Пропустить второй элемент
                iterator.remove(); // Удалить второй элемент
            }
        }

        //Task 2

        // a. Создать HashSet<String> (set1)
        HashSet<String> set1 = new HashSet<>();

// b. Вставить в set1 2 произвольные строки
        set1.add("apple");
        set1.add("banana");

// c. Вставить в set1 все элементы из list1 и list2
        set1.addAll(list1);
        set1.addAll(list2);

// d. Вывести на экран значения set1
        System.out.println("Значения set1: " + set1);

// e. Создать LinkedHashSet<String> (set2)
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

// f. Вставить в set2 все элементы из list2 и list3
        set2.addAll(list2);
        set2.addAll(list3);

// g. Вывести на экран значения set1 (повторно)
        System.out.println("Значения set1: " + set1);
// Вывести на экран значения set2
        System.out.println("Значения set2: " + set2);


        //Task 3

        // a. Создать LinkedHashMap<Integer, String> (map1)
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();

        // b. Добавить в map значения всех месяцев года (номер месяца : название)
        map1.put(0, "Январь");
        map1.put(1, "Февраль");
        map1.put(2, "Март");
        map1.put(3, "Апрель");
        map1.put(4, "Май");
        map1.put(5, "Июнь");
        map1.put(6, "Июль");
        map1.put(7, "Август");
        map1.put(8, "Сентябрь");
        map1.put(9, "Октябрь");
        map1.put(10, "Ноябрь");
        map1.put(11, "Декабрь");

        // c. Вывести на экран первый и последний месяц года (0 и 11)
        System.out.println("Первый месяц года: " + map1.get(0));
        System.out.println("Последний месяц года: " + map1.get(11));

        // d. Вставить на место 6-го месяца слово ‘ОТПУСК’, вывести на экран
        map1.put(6, "ОТПУСК");
        System.out.println("6-й месяц: " + map1.get(6));

        // e. Создать HashMap<Integer, String> (map2)
        HashMap<Integer, String> map2 = new HashMap<>();

        // f. Вставить в map2 все значения map1
        map2.putAll(map1);

        // g. *Создать метод для вывода всех элементов map в консоль
        printMap(map1);
        printMap(map2);

        // h. *Создать map3 (ключ – имя студента (String), значение -контакты студента: моб.тел, почта, скайп (Set<String>))
        HashMap<String, Set<String>> map3 = new HashMap<>();
        Set<String> contacts = new HashSet<>();
        contacts.add("123-456-7890");
        contacts.add("example@example.com");
        contacts.add("skype_id");
        map3.put("Иванов", contacts);

        // Вывод map3
        System.out.println("Контакты студента Иванов: " + map3.get("Иванов"));


        //Task 4

        // b. Создать userSet (HashSet<User>)
        HashSet<User> userSet = new HashSet<>();

        // c. Создать 2 экземпляра класса User с одинаковыми полями и 1 экземпляр отличающийся возрастом
        User user1 = new User("John", 30, "123-456-7890");
        User user2 = new User("Jane", 25, "987-654-3210");
        User user3 = new User("John", 35, "555-555-5555");

        // d. Добавить пользователей в userSet
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        // e. Вывести пользователей на экран
        System.out.println("Пользователи в userSet:");
        for (User user : userSet) {
            System.out.println(user);
        }

        // f. Переопределить в классе User метод hashCode, указав в нем только обработку поля name.
        // g. Вывести пользователей на экран
        System.out.println("\nПользователи в userSet после переопределения hashCode для поля name:");
        for (User user : userSet) {
            System.out.println(user);
        }

        // h. Переопределить в классе User метод hashCode, указав в нем все поля класса.
        user1.hashCode(); // Переопределенный hashCode для всех полей класса

        // i. Вывести пользователей на экран
        System.out.println("\nПользователи в userSet после переопределения hashCode для всех полей:");
        for (User user : userSet) {
            System.out.println(user);
        }
    }

    // g. *Создать метод для вывода всех элементов map в консоль (EntrySet< Integer, String >)
    private static void printMap(Map<Integer, String> map) {
        System.out.println("Вывод элементов карты:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }
}