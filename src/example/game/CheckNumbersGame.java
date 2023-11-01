package example.game;

import java.util.Scanner;

public class CheckNumbersGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("환영합니다.");
        System.out.println("입력 받은 수 까지 2의 배수인지 3의 배수인지 체크합니다!!");
        System.out.print("입력: ");
        int inputNum = sc.nextInt();
        //입력 받은 수 까지
//        String[] pending = new String[inputNum]; // 굳이...
        // 2의 배수인지 3의 배수인지 if?
//        for (int i = 0; i < pending.length; i++) { // 굳이...
        for (int i = 1; i <= inputNum; i++) {
//            int sum = 0;
//            sum += i + 1;
//            if (sum % 2 == 0 && sum % 3 == 0) {
//                System.out.printf("%d -> 2와 3의 배수입니다.\n", sum);
//            } else {
//                if (sum % 2 == 0) {
//                    System.out.printf("%d -> 2의 배수입니다.\n", sum);
//                } else if (sum % 3 == 0) {
//                    System.out.printf("%d -> 3의 배수입니다.\n", sum);
//                } else {
//                    System.out.println(sum);
//                }
//            }
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.printf("%d -> 2와 3의 배수입니다.\n", i);
            } else {
                if (i % 2 == 0) {
                    System.out.printf("%d -> 2의 배수입니다.\n", i);
                } else if (i % 3 == 0) {
                    System.out.printf("%d -> 3의 배수입니다.\n", i);
                } else {
                    System.out.println(i);
                }
            }
        }
    }

}
