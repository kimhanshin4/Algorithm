package programmers.java.level1;

import java.util.*;

public class HallOfHonorH {

    //명예의 전당
//"명예의 전당"이라는 TV 프로그램에서는 매일 1명의 가수가 노래를 부르고, 시청자들의 문자 투표수로 가수에게
// 점수를 부여합니다. 매일 출연한 가수의 점수가 지금까지 출연 가수들의 점수 중 상위 k번째 이내이면
// 해당 가수의 점수를 명예의 전당이라는 목록에 올려 기념합니다. 즉 프로그램 시작 이후 초기에 k일까지는
// 모든 출연 가수의 점수가 명예의 전당에 오르게 됩니다. k일 다음부터는 출연 가수의 점수가 기존의 명예의 전당 목록의
// k번째 순위의 가수 점수보다 더 높으면, 출연 가수의 점수가 명예의 전당에 오르게 되고 기존의 k번째 순위의 점수는
// 명예의 전당에서 내려오게 됩니다.
//
//이 프로그램에서는 매일 "명예의 전당"의 최하위 점수를 발표합니다. 예를 들어, k = 3이고, 7일 동안 진행된
// 가수의 점수가 [10, 100, 20, 150, 1, 100, 200]이라면, 명예의 전당에서 발표된 점수는 아래의 그림과 같이
// [10, 10, 10, 20, 20, 100, 100]입니다.
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> rankArr = new ArrayList<>(); //
        for (int i = 0; i < score.length; i++) {
            rankArr.add(score[i]);
            //rankArr에 k순위까지의 점수만 받음
            if (rankArr.size() > k) { //받은 점수들이 k 보다 많아지면
                rankArr.remove(Collections.min(rankArr)); //제일 낮은 숫자를 제거
            }
            answer[i] = Collections.min(rankArr); //최하 점수를 넣어줌
        }
        return answer;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] answer = solution(k, score);
        System.out.println(Arrays.toString(answer)); //[10, 10, 10, 20, 20, 100, 100]
    }
}
//

//s1
//        int[] answer = new int[score.length];
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        int temp = 0;
//        for(int i = 0; i < score.length; i++) {
//            priorityQueue.add(score[i]);
//            if (priorityQueue.size() > k) {
//                priorityQueue.poll();
//            }
//            answer[i] = priorityQueue.peek();
//        }
//        return answer;