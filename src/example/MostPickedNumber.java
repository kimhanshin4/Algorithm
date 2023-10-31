package example;

import java.util.ArrayList;
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

        // 카운트 해야할 배열 생성
        int[] countArr = new int[11];
        for (int i = 0; i < arr.length; i++) {
            int countNum = arr[i];
            countArr[countNum] += 1;
        }

        // 가장 높은 카운트 값
        int maxNum = 0;
        int answer = 0;
        for (int i = 0; i < countArr.length; i++) {
//            maxNum = countArr[countNum+i];
//              if (maxNum>countArr[countNum]) {
                     answer = maxNum;
                }
            }
        }

        //0 1 1 0 0 0 0 0 3 0 0

//        System.out.println();
//    }
//}
