package example;

import java.util.Arrays;
import java.util.Scanner;

public class MostPickedNumber {

    public static void main(String[] args) {
        System.out.println("1 ~ 10까지의 수를 5번 입력 받아서 가장 많이 입력된 수를 구하세요!");
        Scanner sc = new Scanner(System.in);
        // 배열생성
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println("입력한 수" + Arrays.toString(arr));
//        System.out.println("------------");
        // 카운트 해야 할 배열 생성
        int[] countArr = new int[11];
        for (int i = 0; i < arr.length; i++) {
            int countNum = arr[i];
            countArr[countNum] += 1;

        } // countArr[]에 횟수가 쌓임
//        System.out.println(Arrays.toString(countArr)); //쌓인 횟수 확인
//        System.out.println("------------");

        int max = 0;
        int index = 0;
        for (int i = 0; i < countArr.length; i++) {
            if (max < countArr[i]) {
                max = countArr[i];
                index = i;
            }
        }
        System.out.println("가장 많이 입력한 숫자 : " + index);
    }
}
