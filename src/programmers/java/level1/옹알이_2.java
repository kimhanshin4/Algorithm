package programmers.java.level1;

public class 옹알이_2 {

    /*옹알이 (2)
문제 설명
머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다. 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과
네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워합니다.
문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록
solution 함수를 완성해주세요.

제한사항
1 ≤ babbling의 길이 ≤ 100
1 ≤ babbling[i]의 길이 ≤ 30
문자열은 알파벳 소문자로만 이루어져 있습니다.*/
    //contains //replace
    public static int solution(String[] babbling) {
        int answer = 0;
        for (String check : babbling) {
            if (check.contains("ayaaya") || check.contains("yeye") || check.contains("woowoo")
                || check.contains("mama")) {
                continue;
            }
            if (check
                .replace("aya", "1")
                .replace("ye", "1")
                .replace("woo", "1")
                .replace("ma", "1")
                .replace("1", "")
                .isEmpty()) {
                ++answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        String[] babbling = {"aya", "yee", "u", "maa"};
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        int result = solution(babbling);
        System.out.println("result = " + result); //1 //2
    }
}
//s1
/*        int answer = 0;
        //가능한 발음 쪼개서 각각 초기화
        String babA = "aya";
        String babB = "ye";
        String babC = "woo";
        String babD = "ma";

        for (String check : babbling) {
            //연속해서 같은 발음을 할 수 없다.
            if (check.contains(babA + babA) || check.contains(babB + babB)
                || check.contains(babC + babC) || check.contains(babD + babD)) {
                continue;
            }
            //옹알이를 대입한 check에 가능한 발음 유무 체크
            check = check.replace(babA, "1");
            check = check.replace(babB, "1");
            check = check.replace(babC, "1");
            check = check.replace(babD, "1");

            //check에 1만 들어있다면 가능한 발음들만 내포
            //횟수를 세기위해 빈 문자열로 전환
            check = check.replace("1", "");
            if (check.isEmpty()) {
                answer++;
            }
        }
        return answer;*/

//s2
/*        int answer = 0;
        for (String check : babbling) {
            if (check.contains("ayaaya") || check.contains("yeye") || check.contains("woowoo")
                || check.contains("mama")) {
                continue;
            }
            if (check
                .replace("aya", "1")
                .replace("ye", "1")
                .replace("woo", "1")
                .replace("ma", "1")
                .replace("1", "")
                .isEmpty()) {
                ++answer;
            }
        }
        return answer;*/

//s3
/*        int answer = 0;
        String[] filter = {"aya", "ye", "woo", "ma"};
        for(int i = 0; i < babbling.length;i++){
            for(int j = 0; j < filter.length; j++){
                if(!babbling[i].contains("ayaaya") && !babbling[i].contains("yeye") &&!babbling[i].contains("woowoo")&&!babbling[i].contains("mama"))
                babbling[i] = babbling[i].replace(filter[j]," ");
            }
            babbling[i] = babbling[i].replace(" ", "");
            if(babbling[i] == "")   answer ++;
        }
        return answer;*/