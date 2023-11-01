package example.classes;

public class User {

    String name;
    int age;
    int height;
    long id;
    private long pw;
    private long phoneNumber;

    User(Long id) {
        this.id = id;
    }

    public static int get() {
        return 1;
    }
}
