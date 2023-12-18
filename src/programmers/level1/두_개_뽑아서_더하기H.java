package programmers.level1;

import java.util.*;

public class 두_개_뽑아서_더하기H {

    //두 개 뽑아서 더하기
//정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는
// 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
    public static int[] solution(int[] numbers) {
        //sort, List.contains()
        int[] answer = {};
        List<Integer> numBucket = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (!numBucket.contains(numbers[i] + numbers[j])) {
                    numBucket.add(numbers[i] + numbers[j]);
                }
            }
        }
        return numBucket.stream().sorted().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
//        int[] numbers = {5,0,2,7};
        int[] result = solution(numbers);
        System.out.println(result);//[2,3,4,5,6,7] //[2,5,7,9,12]
    }
}
