package programmers.level1;

public class WeaponsOfKights {

    //숫자나라 기사단의 각 기사에게는 1번부터 number까지 번호가 지정되어 있습니다. 기사들은 무기점에서 무기를 구매하려고 합니다.
    //각 기사는 자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매하려 합니다.
    // 단, 이웃나라와의 협약에 의해 공격력의 제한수치를 정하고, 제한수치보다 큰 공격력을 가진 무기를 구매해야 하는 기사는
    // 협약기관에서 정한 공격력을 가지는 무기를 구매해야 합니다.
    //예를 들어, 15번으로 지정된 기사단원은 15의 약수가 1, 3, 5, 15로 4개 이므로, 공격력이 4인 무기를 구매합니다.
    // 만약, 이웃나라와의 협약으로 정해진 공격력의 제한수치가 3이고 제한수치를 초과한 기사가 사용할 무기의 공격력이 2라면,
    // 15번으로 지정된 기사단원은 무기점에서 공격력이 2인 무기를 구매합니다. 무기를 만들 때, 무기의 공격력 1당 1kg의 철이 필요합니다.
    // 그래서 무기점에서 무기를 모두 만들기 위해 필요한 철의 무게를 미리 계산하려 합니다.
    //기사단원의 수를 나타내는 정수 number와 이웃나라와 협약으로 정해진 공격력의 제한수치를 나타내는 정수 limit와
    // 제한수치를 초과한 기사가 사용할 무기의 공격력을 나타내는 정수 power가 주어졌을 때, 무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게를 return 하는 solution 함수를 완성하시오.
    //class Solution {
    //    public int solution(int number, int limit, int power) {
    //        int answer = 0;
    //        return answer;
    //    }
    //}

    //약수는 크게 제곱수와 제곱수가 아닌 경우로 나뉠 수 있으며, 중간 지점까지,
    // 즉 j의 제곱이 i보다 작거나 같을 때까지 탐색한 후 제곱수의 경우 1번만 카운트하고
    // 나머지 수는 2번 카운트하면 된다
    public static int solution(int number, int limit, int power) {
        int result = 0;
        int measureCnt = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) { //j가 i의 제곱근이면 cnt 1
                    measureCnt++;
                } else if (i % j == 0) { //약수는 한 쌍 이므로 cnt 2
                    measureCnt += 2;
                }
            }
            if (measureCnt > limit) { //cnt가 제한수치를 초과할 시
                measureCnt = power; //제한 공격력 수치로 초기화
            }
            result += measureCnt; //cnt==result이므로 result에 쌓아줌
            measureCnt = 0; //다음 순회를 위한 cnt초기화
        }
        return result; //==총 필요한 철의 무게
    }

    public static void main(String[] args) {
        int number = 10;
        int limit = 3;
        int power = 2;
        int result = solution(number, limit, power);
        System.out.println(result);

    }
}

//시간초과 났던 것 첨삭
//    public static int solution(int number, int limit, int power) {
////        int[] knights = new int[number];
//        int result = 0;
//        int measureCnt = 0;
//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    measureCnt++; //약수시 카운트업
//                }
//            }
//            if (measureCnt > limit) { //공격력이 제한수치를 초과할시=>
//                measureCnt = power;
//            }
//            result += measureCnt;
//            measureCnt = 0;
//        }
//        return result; // 21 나와야됨
//    }

//테스트 성공! But 몇몇 시간초과
//    public static int solution(int number, int limit, int power) {
//        int[] knights = new int[number];
//        int result = 0;
//        int measureCnt = 0;
//        int iron = 0;
//        //기사단원이 구매 할 초기 무기의 공격력 (기사단 번호 별 약수 갯수 구하기)
//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    measureCnt++; //약수시 카운트업
//                }
//            }
//            if (measureCnt > limit) { //공격력이 제한수치를 초과할시=>
//                knights[i - 1] = power; //=>정해진 공격력값 대입
//            } else {
//                knights[i - 1] = measureCnt; //=>아니면 초기 공격력 대입
//            }
//            measureCnt = 0;
//        }
//        //무기생산에 최종적으로 필요한 철의 무게 구하기
//        for (int i = 0; i < number; i++) {
//            iron = knights[i];
//            result += iron;
//        }
//        return result; // 21 나와야됨
//    }