package programmers.java.level1;

public class 숫자_문단열과_영단어H {

    /*    숫자 문단열과 영단어
    네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를
     건네주면 프로도는 원래 숫자를 찾는 게임입니다.
    다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

        1478 → "one4seveneight"
    234567 → "23four5six7"
    10203 → "1zerotwozero3"
    이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다.
     s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

    참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.

    숫자	영단어
    0	zero
    1	one
    2	two
    3	three
    4	four
    5	five
    6	six
    7	seven
    8	eight
    9	nine*/
    public static int solution(String s) {
        //결국 0~9까지 숫자와 영단어 갯수는 정해져 있음 => 배열로 묶어 선언
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine"}; //23four5six7
        for (int i = 0; i < nums.length; i++) {
            //배열 nums를 순회하며 '문자열'숫자를 숫자로 변경
            // => ex) i=4, => nums["four"], 4
            s = s.replace(nums[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
//        String s = "one4seveneight";
        String s = "23four5six7";
        int result = solution(s);
        System.out.println(result); //1478 //234567
    }
}
