package example;

import java.util.Arrays;

public class NumbersGame {

    //12345
    //23456
    //...
    public static void main(String[] args) {
//0123401234012340123401234
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
        }
//0123401234012340123401234

    }
}

//for문 5줄? for (int i = 0; i < 5; i++) {
//1234567
//2345678
//3456789

//        for (int i = 0; i < 5; i++) { //
//            for (int j = 0; j < 5; j++) {
//                System.out.print((i+1) + j+" ");// 일딴 프린트
//            }
//            System.out.println();
//        }