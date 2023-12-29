package programmers.java.level1;

public class 가운데_글자_가져오기 {

    //가운데 글자 가져오기
//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
// 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
    //제한사항
    //s는 길이가 1 이상, 100이하인 스트링입니다.
    public static String solution(String s) {
        if (s.length() % 2 == 1) { //문자열 길이가 홀수 일시
            //문자열 지정 부위 잘라오기 {(s길이 절반 *소수점 날아감) 부터 (s길이 절반+1) 까지}
            return s.substring(s.length() / 2, s.length() / 2 + 1);
        }
        //아니면 => 짝수
        //문자열 지정 부위 잘라오기 {(s길이 절반 -1 =>절반부분 두 개중 바로 전) 부터 (s/2+1 바로 후) 까지}
        return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
    }

    public static void main(String[] args) {
//        String s = "abcde";
        String s = "qwer";
        String answer = solution(s);
        System.out.println(answer);

    }
}
//m1
//        if (s.length() % 2 == 1) { //문자열 길이가 홀수 일시
//            //문자열 지정 부위 잘라오기 {(s길이 절반 *소수점 날아감) 부터 (s길이 절반+1) 까지}
//            return s.substring(s.length() / 2, s.length() / 2 + 1);
//        }
//        //아니면 => 짝수
//        //문자열 지정 부위 잘라오기 {(s길이 절반 -1 =>절반부분 두 개중 바로 전) 부터 (s/2+1 바로 후) 까지}
//        return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);

//s1
//        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
