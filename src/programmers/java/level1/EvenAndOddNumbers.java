package programmers.java.level1;

public class EvenAndOddNumbers {

    //정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
    public static String solution(int num) {
        String answer = "";
        if (num % 2 == 0) { //0을 포함한 짝수는 2로 나누면 0
            answer = "Even";
        } else { //정수의 범위엔 -값도 포함 => else로 돌려 -홀수도 Odd에 포함
            answer = "Odd";
        }
        return answer;
    }

    public static void main(String[] args) {
        int num = 1;
        String answer = solution(num);
        System.out.println(answer);
    }
}
//PX
//public class EvenOrOdd {
//    String evenOrOdd(int num) {
//        return (num % 2 == 0) ? "Even" : "Odd";
//    }
//
//    public static void main(String[] args) {
//        EvenOrOdd evenOrOdd = new EvenOrOdd();
//        // 아래는 테스트로 출력해 보기 위한 코드입니다.
//        System.out.println("결과 : " + evenOrOdd.evenOrOdd(3));
//        System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));
//    }
//}

//Editing
//    public static String solution(int num) {
//        String answer = "";
//        if (num % 2 == 0) {
//            answer = "Even";
//        } else {
//            answer = "Odd";
//        }
//        return answer;
//    }

//Personal
//    public static String solution(int num) {
//        String answer = "";
//        if (num % 2 == 1) {
//            answer = "Odd";
//        } else if (num % 2 == -1) {
//            answer = "Odd";
//        } else if (num % 2 == 0) {
//            answer = "Even";
//        } else {
//            answer = "Even";
//        }
//        return answer;
//    }