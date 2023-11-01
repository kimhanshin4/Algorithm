package example.game;

import java.util.Scanner;

public class WinnerPriceGame {

    public static void main(String[] args) {
        System.out.println("우승 상금 게임!!!");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("첫 번째 숫자: ");
        int selectNum1 = sc.nextInt();
        System.out.println();
        System.out.print("두 번째 숫자: ");
        int selectNum2 = sc.nextInt();

        //입력값 같으면 두 수 합 * 1000
        //입력값 다르면 둘 중 큰 수 * 1000

        //plus hint
//        int max = 0;
//        Math.max(selectNum1,selectNum2)
        int sum = 0;
        if (selectNum1 > selectNum2) {
            sum = selectNum1 * 1000;
        } else if (selectNum1 < selectNum2) {
            sum = selectNum2 * 1000;
        } else {
            sum = (selectNum1 + selectNum2) * 1000;
        }
        System.out.println("상금: " + sum);
        System.out.println("--------------------");
    }

}

