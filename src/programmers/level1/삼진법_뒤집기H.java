package programmers.level1;

public class 삼진법_뒤집기H {

    //삼진법 뒤집기
//자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를
// return 하도록 solution 함수를 완성해주세요.
    public static int solution(int n) {
        String baseStr = "";
        //10 => 3진법
        while (n != 0) { //소숫점이하는 버려짐 => n을 나누다보면 0 도달
            baseStr += n % 3; //n을 3으로 나눈 나머지가 왼쪽을 기준으로 붙음 => 3진법화 + 뒤집기
            n /= 3; //n을 3으로 나눔
        }
        //뒤집어진 3진법을 10진법으로
        return Integer.parseInt(baseStr, 3); //=> (baseStr은 3진법) => 10진법으로
    }

    public static void main(String[] args) {
//        int n = 45;
        int n = 125;
        int result = solution(n);
        System.out.println(result); //7 //229

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

/*s2
         String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();


        return Integer.parseInt(a,3);*/