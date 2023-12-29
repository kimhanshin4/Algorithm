package programmers.java.level1;

public class 소수_만들기H {

    /*소수 만들기
    문제 설명
    주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는
    배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는
    경우의 개수를 return 하도록 solution 함수를 완성해주세요.
//int[] nums = {1, 2, 3, 4};
    제한사항
    nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
    nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.*/
    //다수의 메서드 활용
    public static int solution(int[] nums) {
        int decimalCnt = 0;
        //ex) {1, 2, 7,     } i
        //ex) {   2, 7, 6,  } j
        //ex) {      7, 6, 4} k
        //127, 126, 124

        //nums배열에서 3개를 뽑아 비교
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    //뽑은 3개의 수를 더했을 때 소수이면 cnt++
                    if (isDecimal(nums[i] + nums[j] + nums[k])) {
                        decimalCnt++;
                    }
                }
            }
        }
        return decimalCnt;
    }

    private static boolean isDecimal(int num) { //소수 검증 메서드
        boolean isDecimal = true;
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) { //1이 아닌 약수가 있으면 소수가 아님
                isDecimal = false;
                break;
            }
        }
        return isDecimal;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
//        int[] nums = {1, 2, 7, 6, 4};
        int result = solution(nums);
        System.out.println(result);//1 //4
    }
}

//s1
/*        int decimalCnt = 0;
        //nums배열에서 3개를 뽑아 비교
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    //뽑은 3개의 수를 더했을 때 소수이면 cnt++
                    if (isDecimal(nums[i] + nums[j] + nums[k])) {
                        decimalCnt++;
                    }
                }
            }
        }
        return decimalCnt;
    }

    private static boolean isDecimal(int num) { //소수 검증 메서드
        boolean isDecimal = true;
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) { //1이 아닌 약수가 있으면 소수가 아님
                isDecimal = false;
                break;
            }
        }
        return isDecimal;*/