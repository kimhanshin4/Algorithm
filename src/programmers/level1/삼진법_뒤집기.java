package programmers.level1;

public class 삼진법_뒤집기 {

    //삼진법 뒤집기
//자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를
// return 하도록 solution 함수를 완성해주세요.
    public static int solution(int n) {
        String str = "";

        while (n != 0) {
            str += n % 3;
            n /= 3;
        }

        return Integer.parseInt(str, 3);
    }

    public static void main(String[] args) {
        int n = 45;
//        int n = 125;
        int result = solution(n);
        System.out.println(result);

    }

}
/*s1
*         String str = "";

        while (n != 0) {
            str += n % 3;
            n /= 3;
        }

        return Integer.parseInt(str, 3);
*/
