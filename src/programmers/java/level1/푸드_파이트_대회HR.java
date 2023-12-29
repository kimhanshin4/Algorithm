package programmers.java.level1;

public class 푸드_파이트_대회HR {

    /*푸드 파이트 대회
문제 설명
수웅이는 매달 주어진 음식을 빨리 먹는 푸드 파이트 대회를 개최합니다. 이 대회에서 선수들은 1대 1로 대결하며,
매 대결마다 음식의 종류와 양이 바뀝니다. 대결은 준비된 음식들을 일렬로 배치한 뒤, 한 선수는 제일 왼쪽에 있는
음식부터 오른쪽으로, 다른 선수는 제일 오른쪽에 있는 음식부터 왼쪽으로 순서대로 먹는 방식으로 진행됩니다. 중앙에는
물을 배치하고, 물을 먼저 먹는 선수가 승리하게 됩니다.

이때, 대회의 공정성을 위해 두 선수가 먹는 음식의 종류와 양이 같아야 하며, 음식을 먹는 순서도 같아야 합니다. 또한,
이번 대회부터는 칼로리가 낮은 음식을 먼저 먹을 수 있게 배치하여 선수들이 음식을 더 잘 먹을 수 있게 하려고 합니다.
이번 대회를 위해 수웅이는 음식을 주문했는데, 대회의 조건을 고려하지 않고 음식을 주문하여 몇 개의 음식은 대회에
사용하지 못하게 되었습니다.

예를 들어, 3가지의 음식이 준비되어 있으며, 칼로리가 적은 순서대로 1번 음식을 3개, 2번 음식을 4개, 3번 음식을 6개
준비했으며, 물을 편의상 0번 음식이라고 칭한다면, 두 선수는 1번 음식 1개, 2번 음식 2개, 3번 음식 3개씩을 먹게 되므로
음식의 배치는 "1223330333221"이 됩니다. 따라서 1번 음식 1개는 대회에 사용하지 못합니다.

수웅이가 준비한 음식의 양을 칼로리가 적은 순서대로 나타내는 정수 배열 food가 주어졌을 때, 대회를 위한 음식의 배치를
나타내는 문자열을 return 하는 solution 함수를 완성해주세요.*/

    //StringBuilder, .append/.valueOf/.repeat/.reverse
    public static String solution(int[] food) {
        //음식을 순서대로 담을 StringBuilder foodTable 선언
        StringBuilder foodTable = new StringBuilder();

        for (int i = 1; i < food.length; i++) { //0번 물을 제외한 나머지 음식 갯수 만큼 반복
            // i번 음식을 2로 나눈 개수만큼 StringBuilder에 추가 => 홀 수일 경우 소수점 소실
            int count = food[i] / 2;
            foodTable.append(String.valueOf(i).repeat(count)); //테이블 왼쪽 절반 먼저 배치,
        }

        String answer = foodTable + "0"; //절반 배치 완료된 foodTable에 음식에 물'0'을 더함
        answer += foodTable.reverse(); //배치된 음식을 뒤짚어 그 뒤에 추가

        return answer;
    }

    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6};
//        int[] food = {1, 7, 1, 2};
        String result = solution(food);
        System.out.println(result);//"1223330333221" //"111303111"

    }
}

//s1
/*        //음식을 순서대로 담을 StringBuilder foodTable 선언
        StringBuilder foodTable = new StringBuilder();

        for (int i = 1; i < food.length; i++) { //0번 물을 제외한 나머지 음식 갯수 만큼 반복
            // i번 음식을 2로 나눈 개수만큼 StringBuilder에 추가 => 홀 수일 경우 소수점 소실
            int count = food[i] / 2;
            foodTable.append(String.valueOf(i).repeat(count)); //테이블 왼쪽 절반 먼저 배치,
        }

        String answer = foodTable + "0"; //절반 배치 완료된 foodTable에 음식에 물'0'을 더함
        answer += foodTable.reverse(); //배치된 음식을 뒤짚어 그 뒤에 추가

        return answer;*/

//s2
/*        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }

        return answer;*/