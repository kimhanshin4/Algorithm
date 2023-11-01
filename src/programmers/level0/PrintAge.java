package programmers.level0;

public class PrintAge {

    public int solution(int age) {
        int currentYear = 2022;
        int answer = 0;
        if (0 < age && age <= 120) {
            for (int i = 1; i <= age; i++) {
                answer = currentYear - i + 1;
            }
        }
//        return 2023 - age; //ㅎ..
        return answer;
    }

}
