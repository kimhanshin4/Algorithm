package programmers.java.level1;

public class 이천십육년R {

    /*2016년
    문제 설명
    2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이
    무슨 요일인지 리턴하는 함수, solution을 완성하세요.
    요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT

    입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.*/

    //Calendar / Switch Expression
    public static String solution(int a, int b) {
        String answer;
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"}; //2016.1.1 은 금요일
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //16년도 월별 마지막 날짜
        int allDate = 0; //16년도 총 일 수
        for (int i = 0; i < a - 1; i++) {
            allDate += date[i]; //1 ~ a월 까지의 총 일 수
        }
        allDate += (b - 1); //
        answer = day[allDate % 7];

        return answer;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        String result = solution(a, b);
        System.out.println(result); //"TUE"
    }
}

//m
/*//추상클래스 Calendar를 이용해 변수 선언
        Calendar calendar = Calendar.getInstance();

        calendar.set(2016, a - 1, b); //2016년 a월 b일 로 설정
        int dayNum = calendar.get(Calendar.DAY_OF_WEEK); //set된 달력의 요일값 뽑기

        String day = switch (dayNum) { //String으로 전환
            case 1 -> "SUN";
            case 2 -> "MON";
            case 3 -> "TUE";
            case 4 -> "WED";
            case 5 -> "THU";
            case 6 -> "FRI";
            case 7 -> "SAT";
            default -> "Merry Christmas! HO HO HO";
        };
        return day;*/

//s1
/*        String answer;
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int allDate = 0;
        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
        }
        allDate += (b - 1);
        answer = day[allDate % 7];

        return answer;*/