package programmers.level1;

public class CaesarCipherH {

    //시저 암호
//어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
// 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
// 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
    //제한 조건
//공백은 아무리 밀어도 공백입니다.
//s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
//s의 길이는 8000이하입니다.
//n은 1 이상, 25이하인 자연수입니다.
    public static String solution(String s, int n) {
        String result = "";
        n = n % 26; //
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); //문자열에서 변경할 문자 뽑기
            if (Character.isLowerCase(ch)) { //뽑은 문자가 소문자면
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) { //뽑은 문자가 대문자면
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
//        String s = "AB";
        String s = "z B z";
        int n = 4;
        String answer = solution(s, n);
        System.out.println(answer);//"BC"
    }
}

//m1
//        String answer = "";
//        String[] charList = s.split("(?<=\\s)");
//        String[] caesarList = new String[charList.length];
//        char movedChar = ' ';
//        int cAsc = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            cAsc = c;
//            movedChar = (char) (cAsc + 1);
//            caesarList[i] = String.valueOf(movedChar);
//        }
//        char[] charList = {'a', 'b', 'd'};
//        String str = String.valueOf(charList);
//        System.out.println(Arrays.toString(caesarList));
////        System.out.println(Arrays.toString(charList));
////        for (int i = 1; i <= charList.length; i++) {
////            caesarList[i] = charList[i];
////        }
//
//        return answer;

//s1-nw
//return s.chars().map(c -> {
//            int n = n % 26;
//            if (c >= 'a' && c <= 'z') {
//                return 'a' + (c - 'a' + n) % 26;
//            } else if (c >= 'A' && c <= 'Z') {
//                return 'A' + (c - 'A' + n) % 26;
//            } else {
//                return c;
//            }
//        }).mapToObj(c -> String.valueOf((char)c))
//        .reduce((a, b) -> a + b).orElse("");

/*s2
        String result = "";
    n = n % 26;
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isLowerCase(ch)) {
        ch = (char) ((ch - 'a' + n) % 26 + 'a');
      } else if (Character.isUpperCase(ch)) {
        ch = (char) ((ch - 'A' + n) % 26 + 'A');
      }
      result += ch;
    }
        return result;*/

//s3
//        String answer = "";
//        char[] ch = s.toCharArray();
//        for (char c : ch) {
//            if (c == 32) {
//                answer += " ";
//            } else {
//                if (c <= 90) {
//                    c += n;
//                    if (c > 90) {
//                        c -= 26;
//                    }
//                } else {
//                    c += n;
//                    if (c > 122) {
//                        c -= 26;
//                    }
//                }
//                answer += c;
//            }
//        }
//        return answer;