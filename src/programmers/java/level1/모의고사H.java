package programmers.java.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사H {

    /*모의고사
문제 설명
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이
누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.*/
    //Math.max / '%'
    public static int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) {
                score[0]++;
            }
            if (answers[i] == b[i % b.length]) {
                score[1]++;
            }
            if (answers[i] == c[i % c.length]) {
                score[2]++;
            }
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if (maxScore == score[0]) {
            list.add(1);
        }
        if (maxScore == score[1]) {
            list.add(2);
        }
        if (maxScore == score[2]) {
            list.add(3);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
//        int[] answers = {1, 2, 3, 4, 5};
        int[] answers = {1, 3, 2, 4, 2};
        int[] result = solution(answers);
        System.out.println(Arrays.toString(result));//[1] //[1,2,3]
    }
}
//s1
/*
import java.util.ArrayList;
import java.util.Arrays;

        //수포자들이 찍은 패턴 배열화
        int[] stu1 = {1, 2, 3, 4, 5};
        int[] stu2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] stu3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scoreCnt = {0, 0, 0}; //각 수포자들의 점수를 담을 배열

        for (int i = 0; i < answers.length; i++) {
            //각 학생별 정답시 점수 up
            if (answers[i] == stu1[i % 5]) {
                scoreCnt[0]++;
            }
            if (answers[i] == stu2[i % 8]) {
                scoreCnt[1]++;
            }
            if (answers[i] == stu3[i % 10]) {
                scoreCnt[2]++;
            }
        }
        //수포자중 가장 많은 문제를 맞춘 학생의 Count값 선별
        int maxCnt = Math.max(Math.max(scoreCnt[0], scoreCnt[1]), scoreCnt[2]);
        ArrayList<Integer> highestStu = new ArrayList<>();
        for (int i = 0; i < 3; i++) { //가장 높은 점수에 도달한 학생들 선별
            if (maxCnt == scoreCnt[i]) {
                highestStu.add(i + 1); //=> ex) '1번' 수포자, '2번'수포자, '3번' 수포자
            }
        }
        //ArrayList를 배열화
        int[] answer = new int[highestStu.size()];
        for (int i = 0; i < highestStu.size(); i++) {
            answer[i] = highestStu.get(i);
        }
        return answer;*/

//s2
/*
import java.util.ArrayList;

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        return list.stream().mapToInt(i->i.intValue()).toArray();*/