package example;

import java.util.HashMap;
import java.util.Scanner;

public class MostPickedNumberWithMap {

    public static void main(String[] args) {
        System.out.println("Map을 활용해서 숫자 5개를 입력 받아 최빈 값 구하기\n최빈 값이 두 개 라면 -1을 출력");
        HashMap<Integer, Integer> numMap = new HashMap<>(); //해쉬맵 생성
//        HashMap<Integer, Integer> countMap = new HashMap<>(); // <-이거 필요하나?
        Scanner sc = new Scanner(System.in);

        //번호를 받아 맵에 넣기 으려면?
        //ex) numMap.put(key,valye);
        for (int i = 0; i < 5; i++) {
            int inputNum = sc.nextInt();
            numMap.put(inputNum, numMap.getOrDefault(inputNum, 0) + 1);
        } //inputNum을 받는 만큼 value에 +1

        //이제 해야할 거? 최빈값을 찾아야지 + 두 개면 -1 출력
        //그러려면? if?
        // foreach로 돌려서 if로? 올?
        //맵 하나 더?

        int keyNum = 0;
        int valueNum = 0;
//        for (int i = 0; i < ; i++) {}
        for (Integer key : numMap.keySet()) { //변수를 줘서 키들을 꺼내오는 목적
            if (valueNum < numMap.get(key)) {
                valueNum = numMap.get(key);
                keyNum = key;
                //높은 value값을 maxNum에
            } else if (valueNum == numMap.get(key)) {
                keyNum = -1;
            }
            //최빈값 두개 = "-1??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
        }
        System.out.println(keyNum);
    }
}
