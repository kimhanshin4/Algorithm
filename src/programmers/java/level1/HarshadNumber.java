package programmers.java.level1;
//양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고,
// 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수,
// solution을 완성해주세요.

//제한 조건
//x는 1 이상, 10000 이하인 정수입니다.
public class HarshadNumber {

    public static boolean solution(int x) {
        boolean answer = true;
        int sum = 0;

        //int를 String화 한 후, 쪼개서 배열의 각 index에 순차적 대입
        String numStr = Integer.toString(x);
        char[] splitNum = new char[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            splitNum[i] = numStr.charAt(i);
            System.out.print(splitNum[i] + " "); //담긴 요소들 확인
        }
        System.out.println(); //줄바꿈용

        //배열에 들어있는 요소 추출 후 sum에 더하기
        for (int i = 0; i < splitNum.length; i++) {
            sum += Integer.parseInt(String.valueOf(splitNum[i]));
        }

        //x가 하샤드 수인지 검증
        if (x % sum != 0) {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
//        int x = 10;
        int x = 12;
        boolean answer = solution(x);
        System.out.println(answer);//true

    }

}
