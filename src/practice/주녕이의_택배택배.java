package practice;

public class 주녕이의_택배택배 {

    //택배 기사 최준영은 여러 집을 방문해서 택배를 나르는 일을 하고 있다!
//총 100개의 집 중에서 몇개의 집을 방문했는지 구하시오!
//첫번째 행의 숫자는 입력 받는 개수 입니다!
//그 다음 첫번째 행의 숫자만큼 숫자를 입력 받아서 결과를 구합니다
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