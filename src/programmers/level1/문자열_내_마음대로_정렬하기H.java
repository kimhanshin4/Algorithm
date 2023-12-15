package programmers.level1;

import java.util.*;

public class 문자열_내_마음대로_정렬하기H {

    /*    문자열 내 마음대로 정렬하기
    문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순
    정렬하려 합니다.
     예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로
     strings를 정렬합니다.
    
    제한 조건
    strings는 길이 1 이상, 50이하인 배열입니다.
    strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
    strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
    모든 strings의 원소의 길이는 n보다 큽니다.
    인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.*/
    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        for (int i = 0; i < strings.length; i++) { //배열의 i번째의 n번째 문자에 다시 i번째 문자열을 더함
            answer[i] = strings[i].charAt(n) + strings[i];
        } //ex)n=2, apple => papple

        Arrays.sort(answer); //answer배열내 요소들을 오름차순 정렬=>a->z순
        //ex){"papple","apear"} => {"apear","papple"}

        for (int i = 0; i < strings.length; i++) { //각 요소들 맨 앞 문자 잘라내기
            answer[i] = answer[i].substring(1);
        }
        return answer; //깔끔
    }

    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
//        String[] strings = {"abce", "abcd", "cdx"};
        int n = 1;
//        int n = 2;
        String[] result = solution(strings, n);
        System.out.println(result);//["car", "bed", "sun"]//["abcd", "abce", "cdx"]
    }
}

/*m1 - N
    String[] answer = {};
    List<String> stringsAsc = new ArrayList<>();
    for (int i = 0; i < strings.length - 1; i++) {
    String str = strings[i];
    Arrays.sort();
    str.indexOf(n);
    }
    return answer;*/

/*s1
    String[] answer = new String[strings.length];

     for (int i=0; i<strings.length; i++)
    answer[i] = strings[i].charAt(n) + strings[i];

    Arrays.sort(answer);

    for (int i=0; i<answer.length; i++)
    answer[i] = answer[i].substring(1);

    return answer;*/
