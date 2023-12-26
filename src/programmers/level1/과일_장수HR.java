package programmers.level1;

import java.util.*;

public class 과일_장수HR {

    /*과일 장수
    문제 설명
    과일 장수가 사과 상자를 포장하고 있습니다. 사과는 상태에 따라 1점부터 k점까지의 점수로 분류하며, k점이 최상품의
    사과이고 1점이 최하품의 사과입니다. 사과 한 상자의 가격은 다음과 같이 결정됩니다.

    한 상자에 사과를 m개씩 담아 포장합니다.
    상자에 담긴 사과 중 가장 낮은 점수가 p (1 ≤ p ≤ k)점인 경우, 사과 한 상자의 가격은 p * m 입니다.
    과일 장수가 가능한 많은 사과를 팔았을 때, 얻을 수 있는 최대 이익을 계산하고자 합니다.
    (사과는 상자 단위로만 판매하며, 남는 사과는 버립니다)

    예를 들어, k = 3, m = 4, 사과 7개의 점수가 [1, 2, 3, 1, 2, 3, 1]이라면, 다음과 같이 [2, 3, 2, 3]으로
    구성된 사과 상자 1개를 만들어 판매하여 최대 이익을 얻을 수 있습니다.

    (최저 사과 점수) x (한 상자에 담긴 사과 개수) x (상자의 개수) = 2 x 4 x 1 = 8 //
    사과의 최대 점수 k, 한 상자에 들어가는 사과의 수 m, 사과들의 점수 score가 주어졌을 때, 과일 장수가 얻을 수 있는
    최대 이익을 return하는 solution 함수를 완성해주세요.*/

    //Arrays.sort() //
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); //오름차순으로 정렬 => 최고등급의 사과들을 배열의 끝으로
        //ex) score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}
        //=> [1, 1, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4]
        int[] temp = new int[score.length];

        for (int i = score.length - m; i >= 0; i -= m) {
            //=>[0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0] // 최저점 사과 => '4'등급 * m(사과 갯수)
            answer += score[i] * m; //사과 1박스 가격을 answer에 +=

            //확인용
            temp[i] = score[i];
            System.out.println(Arrays.toString(temp));
            System.out.println("[박스내 사과최저점] * 한박스 사과갯수 = " + temp[i] * m);
            System.out.println("--------------");
        }
        return answer;

    }

    public static void main(String[] args) {
//        int k = 3;
//        int m = 4;
//        int[] score = {1, 2, 3, 1, 2, 3, 1};
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        int result = solution(k, m, score);//8 //33
        System.out.println(result);

    }
}
//s1
/*        int answer = 0;
        Arrays.sort(score);
        for(int i = score.length - m; i >= 0; i -= m)
            answer += score[i] * m;
        return answer;*/