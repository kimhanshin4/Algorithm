package example.classes;

public class User {

    String name;
    int age;
    int height;
    long id;
    private long pw;
    private long phoneNumber;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public long getId() {
        return id;
    }

    public long getPw() {
        return pw;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public User(String name, int age, int height, long id, long pw, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.id = id;
        this.pw = pw;
        this.phoneNumber = phoneNumber;
    }

    User(Long id) {
        this.id = id;
    }

    public static int get() {
        return 1;
    }
}
