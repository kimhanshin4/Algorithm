package practice;

import java.io.*;

public class UesReturnNoElse {

    public static void main(String[] args) throws IOException {

    }

    static String getName() {
        int age = 10;
        String name = "";
        if (age < 20) {
            return "준영";
        }
        if (age > 20) {
            return "준일";
        }
        if (age == 20) {
            return "준이";
        }
        return name;
    }
}
