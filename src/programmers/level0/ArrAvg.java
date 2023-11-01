package programmers.level0;

public class ArrAvg {

    //    public double solution(int[] numbers) {
//        double answer = 0;
//        return answer;
//    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double answer;

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) { // numbers의 길이만큼 실행
            sum = sum + numbers[i]; //sum += i // 그래서 sum이랑 i를 더한다.
        }
        answer = sum / numbers.length; // 그리고 sum / numbers길이
        System.out.println(answer);
    }
}
