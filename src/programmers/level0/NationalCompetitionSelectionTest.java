package programmers.level0;

import java.util.*;

//0번부터 n - 1번까지 n명의 학생 중 3명을 선발하는 전국 대회 선발 고사를 보았습니다.
// 등수가 높은 3명을 선발해야 하지만, 개인 사정으로 전국 대회에 참여하지 못하는 학생들이 있어
// 참여가 가능한 학생 중 등수가 높은 3명을 선발하기로 했습니다.
//
//각 학생들의 선발 고사 등수를 담은 정수 배열 rank와 전국 대회 참여 가능 여부가 담긴 boolean
// 배열 attendance가 매개변수로 주어집니다. 전국 대회에 선발된 학생 번호들을 등수가 높은 순서대로
// 각각 a, b, c번이라고 할 때 10000 × a + 100 × b + c를 return 하는 solution 함수를 작성해 주세요.
//    class Solution {
//        public int solution(int[] rank, boolean[] attendance) {
//            int answer = 0;
//            return answer;
//        }
//    }
public class NationalCompetitionSelectionTest {

    //static class 정의법, 객체 정렬, 구글링을 활용 하는 법(내 입맛에 맞춰 활용)
    static class Student {

        int rank;
        int seq;

        public Student(int rank, int seq) {
            this.rank = rank;
            this.seq = seq;
        }
    }

    public static int solution(int[] rank, boolean[] attendance) {
        List<Student> students = new ArrayList<>();

        //1. 참여가 불가능한 학생 제외시키기
        for (int i = 0; i < attendance.length; i++) {
            boolean bool = attendance[i];

            //2. 참여가 가능한 학생은 Student Type의 List를 만들어서 넣어준다.
            if (bool) {
                students.add(new Student(rank[i], i));
            }
        }

        //3. 그 List를 rank 기준으로 정렬한다.
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.rank - o2.rank;
            }
        });

        //4. 반복문을 3번 반복 시켜서 해당 학생의 번호를 뽑는다.
        int value = 10000;
        int result = 0;
        for (int i = 0; i < 3; i++) {

            //5. 첫 번째로 나온 학생의 번호 x 10000 / 두 번째로 나온 학생의 번호 X 100 / 세 번째로 나온 학생의 번호 X 1
            result += students.get(i).seq * value;
            value /= 100;
        }

        //6. 변수로 추출해서 return.
        return result;
    }

    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        Student student = new Student(1, 2);
        solution(rank, attendance);
        int answer = 0;
    }
}
