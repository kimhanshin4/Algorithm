package programmers.level1;

import java.util.*;

public class 카드뭉치H {

    /*카드 뭉치
    문제 설명
    코니는 영어 단어가 적힌 카드 뭉치 두 개를 선물로 받았습니다. 코니는 다음과 같은 규칙으로 카드에 적힌 단어들을
    사용해 원하는 순서의 단어 배열을 만들 수 있는지 알고 싶습니다.

    원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용합니다.
    한 번 사용한 카드는 다시 사용할 수 없습니다.
    카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
    기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없습니다.
    예를 들어 첫 번째 카드 뭉치에 순서대로 ["i", "drink", "water"],
    두 번째 카드 뭉치에 순서대로 ["want", "to"]가 적혀있을 때 ["i", "want", "to", "drink", "water"] 순서의
    단어 배열을 만들려고 한다면 첫 번째 카드 뭉치에서 "i"를 사용한 후 두 번째 카드 뭉치에서 "want"와 "to"를 사용하고
    첫 번째 카드뭉치에 "drink"와 "water"를 차례대로 사용하면 원하는 순서의 단어 배열을 만들 수 있습니다.

    문자열로 이루어진 배열 cards1, cards2와 원하는 단어 배열 goal이 매개변수로 주어질 때, cards1과 cards2에 적힌
    단어들로 goal를 만들 수 있다면 "Yes"를, 만들 수 없다면 "No"를 return하는 solution 함수를 완성해주세요.*/
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> qGoal = new LinkedList<>();
        Queue<String> qCard1 = new LinkedList<>();
        Queue<String> qCard2 = new LinkedList<>();
        Stack<?> stack = new Stack<>();
        for (String word : goal) {
            qGoal.offer(word);
        }

        for (String card : cards1) {
            qCard1.offer(card);
        }

        for (String card : cards2) {
            qCard2.offer(card);
        }

        while (!qGoal.isEmpty()) {
            String word = qGoal.poll();

            if (word.equals(qCard1.peek())) {
                qCard1.poll();
            } else if (word.equals(qCard2.peek())) {
                qCard2.poll();
            } else {
                return "No";
            }
        }

        return "Yes";
    }

    public static void main(String[] args) {
//        String[] cards1 = {"i", "drink", "water"};
//        String[] cards2 = {"want", "to"};
//        String[] goal = {"i", "want", "to", "drink", "water"};
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        String result = solution(cards1, cards2, goal);
        System.out.println(result);
    }
}

//s1
/*        String answer = "Yes";
        int cardsIndex1 = 0; //cards1 배열 순회를 위한 Index용 int 선언
        int cardsIndex2 = 0;
        for (int i = 0; i < goal.length; i++) {
            //cards1을 순회해 goal의 i와 같은지 비교
            if (cardsIndex1 < cards1.length && goal[i].equals(cards1[cardsIndex1])) {
                cardsIndex1++; //cards 배열의 다음 index를 탐색하기 위함
                continue;
            }
            //cards2를 순회해 goal의 i와 같은지 비교
            if (cardsIndex2 < cards2.length && goal[i].equals(cards2[cardsIndex2])) {
                cardsIndex2++;
                continue;
            }
            return "No";
        }
        return answer;*/

//s2
/*        Queue<String> qGoal = new LinkedList<>();
        Queue<String> qCard1 = new LinkedList<>();
        Queue<String> qCard2 = new LinkedList<>();

        for(String str : goal) {
            qGoal.offer(str);
        }

        for(String card : cards1) {
            qCard1.offer(card);
        }

        for(String card : cards2) {
            qCard2.offer(card);
        }

        while(!qGoal.isEmpty()) {
            String str = qGoal.poll();

            if(str.equals(qCard1.peek())) qCard1.poll();
            else if(str.equals(qCard2.peek())) qCard2.poll();
            else return "No";
        }

        return "Yes";*/