package programmers.java.level1;

public class 크기가_작은_부분문자열H {

    //크기가 작은 부분문자열
//숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 이 부분문자열이 나타내는 수가
// p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.
//
//예를 들어, t="3141592"이고 p="271" 인 경우, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다.
// 이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.
    //제한사항
    //1 ≤ p의 길이 ≤ 18
    //p의 길이 ≤ t의 길이 ≤ 10,000
    //t와 p는 숫자로만 이루어진 문자열이며, 0으로 시작하지 않습니다.
    public static int solution(String t, String p) {
        int length = t.length() - p.length() + 1; //for문을 돌릴 때 넣기위한 길이 작업
        long numP = Long.parseLong(p); //"숫자"문자열을 숫자로 형변환
        int answer = 0;

        for (int i = 0; i < length; i++) {
            String numCut = t.substring(i, i + p.length()); //p의 길이 만큼 자르기

            if (Long.parseLong(numCut) <= numP) { //numCut이 numP 보다 작거나 같으면
                answer++; //answer 카운트 up
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        String t = "3141592";
//        String p = "271";
        String t = "500220839878";
        String p = "7";
        int result = solution(t, p); //2 //8
        System.out.println("result = " + result);
    }
}

//m1 fail
//        int answer = 0;
//        int cnt = 0;
//        List<Integer> numList = new ArrayList<>();
//        for (int i = 0; i < t.length() - 2; i++) {
//            numList.add(Integer.parseInt(t.substring(i, i + 3)));
//            System.out.println("numList.get(i) = " + numList.get(i));
//            if (numList.get(i) <= Integer.parseInt(p)) {
//                cnt++;
//            }
//        }
//        return cnt;

//s1
//        int length = t.length() - p.length() + 1; //for문을 돌릴 때 넣기위한 길이 작업
//        long numP = Long.parseLong(p); //"숫자"문자열을 숫자로 형변환
//        int answer = 0;
//
//        for (int i = 0; i < length; i++) {
//            String numCut = t.substring(i, i + p.length()); //p의 길이 만큼 자르기
//
//            if (Long.parseLong(numCut) <= numP) { //numCut이 numP 보다 작거나 같으면
//                answer++; //answer 카운트 up
//            }
//        }
//        return answer;