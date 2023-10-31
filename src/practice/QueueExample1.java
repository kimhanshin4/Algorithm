package practice;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample1 {

    public static void main(String[] args) {
        Queue<Integer> cardGameBabe = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("카드의 개수 : ");
        int input = sc.nextInt();
        System.out.println("--------------");

        for (int i = 0; i < input; i++) {
            int input2 = sc.nextInt();
            cardGameBabe.offer(input2);
        }

        System.out.print("몇 번 섞으시겠습니까? : ");
        int input3 = sc.nextInt();

        for (int i = 0; i < input3; i++) {
            cardGameBabe.offer(cardGameBabe.poll());
        }

        System.out.println(cardGameBabe.peek());

    }

}

