package entities;

public class User {
    private String name;
    private int age;
    private String phone;

    public User(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    // Переопределение метода hashCode только для поля name
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    // Переопределение метода equals для сравнения пользователей по всем полям
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User otherUser = (User) obj;
        return age == otherUser.age && name.equals(otherUser.name) && phone.equals(otherUser.phone);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
