package programmers.level1;

public class CreateStrangeCharacters {

    //문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
// 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수,
// solution을 완성하세요.

    //문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
    //첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

    public static String solution(String s) {
        String answer;
        String[] wordList = s.split("(?<=\\s)"); //문자열을 단어별로 쪼개기
        for (int i = 0; i < wordList.length; i++) {
            String[] wordSplit = wordList[i].split(""); //단어를 문자로 쪼개기
            for (int j = 0; j < wordSplit.length; j++) {
                if (j % 2 == 0) { //짝수자리는 대문자로
                    wordSplit[j] = wordSplit[j].toUpperCase();
                } else { //나머지인 홀수자리는 소문자로
                    wordSplit[j] = wordSplit[j].toLowerCase();
                }
            }
            wordList[i] = String.join("", wordSplit); //쪼개진 문자들 단어로 합하기
        }
        answer = String.join("", wordList); //단어들 한 줄로 합하기
        return answer;
    }

    public static void main(String[] args) {
//        String s = "try hello world";
        String s = "what the hell is happening";
//        String s = "AA aa ZZ zz";
        String answer = solution(s);
        System.out.println(answer); //"TrY HeLlO WoRlD"
    }
}

//좋아요st
//class Solution {
//  public String solution(String s) {
//
//        String answer = "";
//        int cnt = 0;
//        String[] array = s.split("");
//
//        for(String ss : array) {
//            cnt = ss.contains(" ") ? 0 : cnt + 1;
//            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
//        }
//      return answer;
//  }
//}

//첫 풀이 but error => 단어별 짝/홀수 인덱스를 판단해야함
//    public String solution(String s) {
//        List<String> charList = new ArrayList<>();
//        List<String> charUList = new ArrayList<>();
//        //char[] charListArr = new char[s.length()];
//        String answer = "";
//        //String evenC = "";
//        //String OddC = "";
//        for (int i = 0; i < s.length(); i++) {
//            charList.add(String.valueOf(s.charAt(i)));
//            ; //문자열s를 문자로 나눠 리스트에 대입
//        }
//        //System.out.println(charList.toString());
//        //System.out.println("-----------------");
//                for (int i = 0; i < charList.size(); i++) {
//            if (charList.get(i).matches("[a-zA-Z]")) {
//                if (i % 2 == 0) {
//                    charUList.add(charList.get(i).toUpperCase());
//                } else {
//                    charUList.add(charList.get(i).toLowerCase());
//                }
//            } else {
//                charUList.add(charList.get(i));
//            }
//        }
////        System.out.println(charUList.toString());
////        System.out.println("-----------------");
//        for (int i = 0; i < charList.size(); i++) {
//            answer = String.join("", charUList);
//        }
//
//        return answer;
//    }