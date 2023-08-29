import entities.Hospital;
import entities.Street;

public class Main {
    public static void main(String[] args) {
        Street street = new Street("Street");
        street.addBuilding(new Hospital(street.getName() + " 123", 120, 10));
        System.out.println(street.toString());
    }
}