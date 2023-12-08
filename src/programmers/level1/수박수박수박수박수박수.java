package programmers.level1;

import java.util.*;

public class 수박수박수박수박수박수 {

    //수박수박수박수박수박수?
//길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
// 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
    //제한 조건
    //n은 길이 10,000이하인 자연수입니다.
    public static String solution(int n) {
        String answer = "";
        List<String> subakSubakSu = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 1) { //홀수자리엔 "수"를
                subakSubakSu.add("수");
            } else { //짝수자리엔 "박"을 list에 추가
                subakSubakSu.add("박");
            }
        }
        for (String subak : subakSubakSu) { //리스트를 String으로
            answer += subak; //수박수박수
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        String answer = solution(n);
        System.out.println("answer = " + answer);
    }
}
//m
//        String answer = "";
//        List<String> subakSubakSu = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            if ((i + 1) % 2 == 1) { //홀수자리엔 "수"를
//                subakSubakSu.add("수");
//            } else { //짝수자리엔 "박"을 list에 추가
//                subakSubakSu.add("박");
//            }
//        }
//        for (String subak : subakSubakSu) { //리스트를 String으로
//            answer += subak;
//        }
//
//        return answer;

//KYS
//        String answer = "";
//        String[] subak = {"수", "박"};
//        for (int i = 0; i < n; i++) {
//            answer += subak[i % 2];
//        }
//        return answer;

//KDM
//        StringBuilder subakMaker = new StringBuilder();
//        subakMaker.append("수");
//        for (int i = 1; i <= n; i++) {
//            subakMaker.append((i % 2 == 0) ? "수" : "박");
//        }
//        return subakMaker.toString();

//KJY
//    public String solution(int n) {
//        String answer = "";
//        for (int i = 0; i < n; i++) {
//            answer += i % 2 == 0 ? "수" : "박";
//        }
//        return answer;
//    }