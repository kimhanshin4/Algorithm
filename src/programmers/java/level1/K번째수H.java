package programmers.java.level1;

import java.util.*;

public class K번째수H {

    //K번째수
//배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
//
//예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
//1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
//2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
//3. 2에서 나온 배열의 3번째 숫자는 5입니다.

    //배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에
// 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//
//제한사항
//array의 길이는 1 이상 100 이하입니다.
//array의 각 원소는 1 이상 100 이하입니다.
//commands의 길이는 1 이상 50 이하입니다.
//commands의 각 원소는 길이가 3입니다.

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int ansIndex = 0;
        for (int[] eachCommand : commands) { //2중 배열을 1중 배열로 나눔
            int start = eachCommand[0]; //=> 필요한 길이의 시작 숫자
            int end = eachCommand[1]; //=> 필요한 길이의 마지막 숫자
            int ordinalNum = eachCommand[2]; //=> 순서를 나타낸 숫자

            //index -1 => 배열은 0부터 시작
            int[] rawData = Arrays.copyOfRange(array, start - 1, end); //array에서 필요한 부분만 복사
            Arrays.sort(rawData); //복사한 값을 오름차순 정렬
            answer[ansIndex] = rawData[ordinalNum - 1]; //정렬된 rawData의 배열을 answer에 대입
            ansIndex++; //index값을 올려감 => 차례로 대입을 위함
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = solution(array, commands);//[5, 6, 3]
        System.out.println(Arrays.toString(result));
    }
}
/*s1
*         int[] answer = new int[commands.length]; // 3
        int n = 0;

        for (int i = 0; i < commands.length; i++) {
            int k = 0;
            // new int[4] // new int[1] // new int[7]
            int[] list = new int[commands[i][1] - commands[i][0] + 1];
            // j = 2 ~ 5 / j = 4 ~ 4 / j= 1 ~ 7
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                list[k++] = array[j - 1]; // {5,2,6,3} / {6} / {1,5,2,6,3,7,4}
            }
            Arrays.sort(list); // 오름차순 정렬 {2,3,5,6} / {6} / {1,2,3,4,5,6,7}
            answer[n++] = list[commands[i][2] - 1]; // {5,6,3}
        }
        return answer;*/

/*s2
* class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int n = 0;
        int[] ret = new int[commands.length];

        while(n < commands.length){
            int m = commands[n][1] - commands[n][0] + 1;

            if(m == 1){
                ret[n] = array[commands[n++][0]-1];
                continue;
            }

            int[] a = new int[m];
            int j = 0;
            for(int i = commands[n][0]-1; i < commands[n][1]; i++)
                a[j++] = array[i];

            sort(a, 0, m-1);

            ret[n] = a[commands[n++][2]-1];
        }

        return ret;
    }

    void sort(int[] a, int left, int right){
        int pl = left;
        int pr = right;
        int x = a[(pl+pr)/2];

        do{
            while(a[pl] < x) pl++;
            while(a[pr] > x) pr--;
            if(pl <= pr){
                int temp = a[pl];
                a[pl] = a[pr];
                a[pr] = temp;
                pl++;
                pr--;
            }
        }while(pl <= pr);

        if(left < pr) sort(a, left, pr);
        if(right > pl) sort(a, pl, right);
    }
}*/

//s3
/*        int[] answer = new int[commands.length];
        int a = 0;
        for(int[] info : commands){
            int i = info[0];
            int j = info[1];
            int k = info[2];

            int[] buf = Arrays.copyOfRange(array,i-1,j);
            Arrays.sort(buf);
            answer[a] = buf[k-1];
            a++;
        }

        return answer;*/