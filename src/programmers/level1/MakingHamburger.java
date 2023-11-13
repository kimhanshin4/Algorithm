package programmers.level1;

import java.util.*;

public class MakingHamburger {

    //햄버거 가게에서 일을 하는 상수는 햄버거를 포장하는 일을 합니다.
// 함께 일을 하는 다른 직원들이 햄버거에 들어갈 재료를 조리해 주면 조리된 순서대로 상수의 앞에
// 아래서부터 위로 쌓이게 되고, 상수는 순서에 맞게 쌓여서 완성된 햄버거를 따로 옮겨 포장을 하게 됩니다.
// 상수가 일하는 가게는 정해진 순서(아래서부터, 빵 – 야채 – 고기 - 빵)로 쌓인 햄버거만 포장을 합니다.
// 상수는 손이 굉장히 빠르기 때문에 상수가 포장하는 동안 속 재료가 추가적으로 들어오는 일은 없으며,
// 재료의 높이는 무시하여 재료가 높이 쌓여서 일이 힘들어지는 경우는 없습니다.
//예를 들어, 상수의 앞에 쌓이는 재료의 순서가 [야채, 빵, 빵, 야채, 고기, 빵, 야채, 고기, 빵]일 때,
// 상수는 여섯 번째 재료가 쌓였을 때, 세 번째 재료부터 여섯 번째 재료를 이용하여 햄버거를 포장하고,
// 아홉 번째 재료가 쌓였을 때, 두 번째 재료와 일곱 번째 재료부터 아홉 번째 재료를 이용하여 햄버거를 포장합니다.
// 즉, 2개의 햄버거를 포장하게 됩니다.
//상수에게 전해지는 재료의 정보를 나타내는 정수 배열 ingredient가 주어졌을 때,
// 상수가 포장하는 햄버거의 개수를 return 하도록 solution 함수를 완성하시오.

    //ArrayList<Integer> enjoy = new ArrayList<>();
//        int[] burgerCheck = new int[4];
//        int[] checkingBurger = new int[4];
    public static int solution(int[] ingredient) {
//        int[] ingredient = {1, 2, 6, 2, 2, 1, 3, 1, 2}; //0
        int burger = 0;
        //버거 레시피 => 재료통에서 포장스택으로 옮기기에 순서역전
        int[] perfectBurger = {1, 3, 2, 1};
        //버거 재료통 스택
        Stack<Integer> burgerStandBy = new Stack<>();
        //버거를 포장 할 스택
        Stack<Integer> burgerWrapping = new Stack<>();
        for (int i = 0; i < ingredient.length; i++) {
            boolean isSuccess = true;
            //재료 투하
            burgerStandBy.push(ingredient[i]);
            //버거를 포장스택에 넣을 조건
            if (burgerStandBy.size() >= 4 && burgerStandBy.peek() == 1) {
                for (int j = 0; j < perfectBurger.length; j++) {
                    //재료통에서 뺀 것과 버거 레시피의 순서가 다르면
                    if (perfectBurger[j] != burgerStandBy.peek()) {
                        //=>"응 돌아가, 아직 버거가 될 수 없다!"
                        isSuccess = false;
                        break;
                    } else {
                        //레시피와 순서가 동일 => 포장하러
                        burgerWrapping.push(burgerStandBy.pop());
                    }
                }
                if (isSuccess) {
                    burger++; //=>레시피대로 버거완성! Count!
                    burgerWrapping.clear(); //=>포장용기 비움
                } else {
//                    int length = burgerWrapping.size();
//                    for (int j = 0; j < length; j++) {
//                    }
                    while (!burgerWrapping.isEmpty()) {
                        //=>"응 돌아가"에 이어서 다시 재료통으로 털기
                        burgerStandBy.push(burgerWrapping.pop());
                    }
                }
            }
        }
        return burger;
    }

    public static void main(String[] args) {
        int[] ingredient = {1, 2, 3, 1}; //2
//        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1}; //2
//        int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2}; //0
        int result = solution(ingredient);
        System.out.println(result);

    }
}
//                while (!burgerStandBy.isEmpty()) {
//                    burgerWrapping.push(burgerStandBy.pop());
//                }

//                    if (burgerStandBy.pop() == 2) {
//                        burgerWrapping.push(burgerStandBy.pop());
//                    } else {
//                        for (int j = 1; j <= burgerWrapping.size(); j++) {
//                            burgerStandBy.push(burgerStandBy.pop());
//                        }
//                    }
//                    if (burgerStandBy.pop() == 3) {
//                        burgerWrapping.push(burgerStandBy.pop());
//                    } else {
//                        for (int j = 1; j <= burgerWrapping.size(); j++) {
//                            burgerStandBy.push(burgerStandBy.pop());
//                        }
//                    }
//                    if (burgerStandBy.pop() == 1) {
//                        burgerWrapping.push(burgerStandBy.pop());
//                    } else {
//                        for (int j = 1; j <= burgerWrapping.size(); j++) {
//                            burgerStandBy.push(burgerStandBy.pop());
//                        }
//                    }

//                for (int j = 1; j <= burgerStandBy.size(); j++) {
//                        burgerWrapping.push(burgerStandBy.pop());
//                }
//                for (int j = 1; j <= burgerWrapping.size(); j++) {
//                    burgerWrapping.pop();
//                    if()
//                }
