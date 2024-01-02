package programmers.java.level1;

import java.util.*;

public class 로또의_최고_순위와_최저_순위H {

    /*로또의 최고 순위와 최저 순위
문제 설명
로또 6/45(이하 '로또'로 표기)는 1부터 45까지의 숫자 중 6개를 찍어서 맞히는 대표적인 복권입니다. 아래는 로또의
순위를 정하는 방식입니다.

순위	당첨 내용
1	6개 번호가 모두 일치
2	5개 번호가 일치
3	4개 번호가 일치
4	3개 번호가 일치
5	2개 번호가 일치
6(낙첨)	그 외
로또를 구매한 민우는 당첨 번호 발표일을 학수고대하고 있었습니다. 하지만, 민우의 동생이 로또에 낙서를 하여,
일부 번호를 알아볼 수 없게 되었습니다. 당첨 번호 발표 후, 민우는 자신이 구매했던 로또로 당첨이 가능했던
최고 순위와 최저 순위를 알아보고 싶어 졌습니다.
알아볼 수 없는 번호를 0으로 표기하기로 하고, 민우가 구매한 로또 번호 6개가 44, 1, 0, 0, 31 25라고
가정해보겠습니다. 당첨 번호 6개가 31, 10, 45, 1, 6, 19라면, 당첨 가능한 최고 순위와 최저 순위의 한 예는 아래와
같습니다.

당첨 번호	31	10	45	1	6	19	결과
최고 순위 번호	31	0→10	44	1	0→6	25	4개 번호 일치, 3등
최저 순위 번호	31	0→11	44	1	0→7	25	2개 번호 일치, 5등
순서와 상관없이, 구매한 로또에 당첨 번호와 일치하는 번호가 있으면 맞힌 걸로 인정됩니다.
알아볼 수 없는 두 개의 번호를 각각 10, 6이라고 가정하면 3등에 당첨될 수 있습니다.
3등을 만드는 다른 방법들도 존재합니다. 하지만, 2등 이상으로 만드는 것은 불가능합니다.
알아볼 수 없는 두 개의 번호를 각각 11, 7이라고 가정하면 5등에 당첨될 수 있습니다.
5등을 만드는 다른 방법들도 존재합니다. 하지만, 6등(낙첨)으로 만드는 것은 불가능합니다.
민우가 구매한 로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어집니다. 이때, 당첨
가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.*/
    //switch
    public static int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int lotteryNumCnt = 0;
        //현재 로또 용지에서 알 수 없는 숫자와, 정확한 숫자를 각각 세기
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCnt++;
            }
            if (lottos[i] != 0) {
                for (int num : win_nums) {
                    if (num == lottos[i]) {
                        lotteryNumCnt++;
                    }
                }
            }
        }
        int lowestRank;
        int highestRank;
        //등수 계산
        switch (lotteryNumCnt) {
            case 2: //2개 번호가 일치 할 때
                lowestRank = 5; //=> 5등
                highestRank = lowestRank - zeroCnt; //=>등수 = 현재 등수 - 0갯수
                //0은 어떤 수든 될 수 있음 => 당첨 숫자
                break;
            case 3:
                lowestRank = 4;
                highestRank = lowestRank - zeroCnt;
                break;
            case 4:
                lowestRank = 3;
                highestRank = lowestRank - zeroCnt;
                break;
            case 5:
                lowestRank = 2;
                highestRank = lowestRank - zeroCnt;
                break;
            case 6:
                lowestRank = 1;
                highestRank = lowestRank - zeroCnt;
                break;
            default:
                lowestRank = 6;
                highestRank = lowestRank - zeroCnt;
        }
        //1등 보다 높은 등수 는 나올 수 없음
        if (highestRank < 1) {
            highestRank = 1;
        }
        return new int[]{highestRank, lowestRank};
    }

    public static void main(String[] args) {
//        int[] lottos = {44, 1, 0, 0, 31, 25};
//        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        int[] result = solution(lottos, win_nums); //[3,5] //[1,1]
        System.out.println(Arrays.toString(result));
    }

}
//s1
/*        int zeroCount = 0;
        int sameNumber = 0;
        int highRank;
        int currentRank;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
            } else {
                for (int l : win_nums) {
                    if (lottos[i] == l) {
                        sameNumber++;
                    }
                }
            }
        }
        //등수 계산
        switch (sameNumber) {
            case 2: //2개 번호가 일치 할 때
                currentRank = 5; //=> 5등
                highRank = currentRank - zeroCount; //=>등수 = 현재 등수 - 0갯수
                //0은 어떤 수든 될 수 있음 => 당첨 숫자
                break;
            case 3:
                currentRank = 4;
                highRank = currentRank - zeroCount;
                break;
            case 4:
                currentRank = 3;
                highRank = currentRank - zeroCount;
                break;
            case 5:
                currentRank = 2;
                highRank = currentRank - zeroCount;
                break;
            case 6:
                currentRank = 1;
                highRank = currentRank - zeroCount;
                break;
            default:
                currentRank = 6;
                highRank = currentRank - zeroCount;
        }
        //1등 보다 높은 등수 는 나올 수 없음
        if (highRank < 1) {
            highRank = 1;
        }

        int[] answer = {highRank, currentRank};
        return answer;*/
