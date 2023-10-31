package practice;

import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample1 {

    public static void main(String[] args) {
        ArrayList<String> teamMember = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("팀원 : ");
            String inputMember1 = sc.nextLine();
            teamMember.add(inputMember1);
        }
        String printMember;
        for (int i = 0; i < teamMember.size(); i++) {
            printMember = teamMember.get(i);
            System.out.println("팀원 : " + printMember);
        }
        System.out.println("리스트의 길이: " + teamMember.size());
    }
}

