package practice;

import java.util.Scanner;
import java.util.Stack;

public class StackExample1 {

    public static void main(String[] args) {
        Stack<Integer> practice = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); // ex) 5
        System.out.println("---------------");
        int stackNum;
        for (int i = 0; i < input; i++) {
            stackNum = sc.nextInt();
            if (stackNum == 0) {
                practice.pop();
            } else {
                practice.push(stackNum);
            }

        }
        System.out.println(practice.peek());
    }
}
