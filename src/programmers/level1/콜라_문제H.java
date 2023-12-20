package programmers.level1;

public class 콜라_문제H {

    /*콜라 문제
    문제 설명
    오래전 유행했던 콜라 문제가 있습니다. 콜라 문제의 지문은 다음과 같습니다.
    정답은 아무에게도 말하지 마세요.
    
    콜라 빈 병 2개를 가져다주면 콜라 1병을 주는 마트가 있다. 빈 병 20개를 가져다주면 몇 병을 받을 수 있는가?
    단, 보유 중인 빈 병이 2개 미만이면, 콜라를 받을 수 없다.
    
    문제를 풀던 상빈이는 콜라 문제의 완벽한 해답을 찾았습니다. 상빈이가 푼 방법은 아래 그림과 같습니다.
    우선 콜라 빈 병 20병을 가져가서 10병을 받습니다. 받은 10병을 모두 마신 뒤, 가져가서 5병을 받습니다.
    5병 중 4병을 모두 마신 뒤 가져가서 2병을 받고, 또 2병을 모두 마신 뒤 가져가서 1병을 받습니다.
    받은 1병과 5병을 받았을 때 남은 1병을 모두 마신 뒤 가져가면 1병을 또 받을 수 있습니다.
    이 경우 상빈이는 총 10 + 5 + 2 + 1 + 1 = 19병의 콜라를 받을 수 있습니다.*/

    //n - 총 빈병 수 //a - 새콜라를 받는데 필요한 빈병 수
    //colaPlus, colaRemain == 마시면 빈 병
    public static int solution(int a, int b, int n) {
        int colaPlus = 0;
        int colaRemain;
        while (true) {
            if (n < a) { //총 빈병 수는 새콜라를 받는데 필요한 수 보다 커야한다.
                break; //=>새콜라를 받기에 빈병 수가 부족하면 while문 end.
            }
            colaPlus += (n / a) * b; //가진 빈병 으로 받을 수 있는 콜라 량
            colaRemain = n % a; //새콜라로 교환할 수 없을 만큼 남은 나머지 빈 병
            n = (n / a) * b + colaRemain; //(새콜라==마시면 빈병)+나머지 빈병 = 총 빈병 수
        }
        return colaPlus;
    }

    public static void main(String[] args) {
//        int a = 2;
//        int b = 1;
//        int n = 20;
        int a = 3;
        int b = 1;
        int n = 20;
        int result = solution(a, b, n); //19 //9
        System.out.println(result);
    }
}
//s1
/*        int answer = 0;
        int colaRemain;
        while (true) {
            if (n < a) { //총 빈병 수는 새콜라를 받는데 필요한 수 보다 커야한다.
                break; //=>새콜라를 받기에 빈병 수가 부족하면 while문 end.
            }
            answer += (n / a) * b; //가진 빈병 으로 받을 수 있는 콜라 량
            colaRemain = n % a; //새콜라로 교환할 수 없을 만큼 남은 나머지 빈 병
            n = (n / a) * b + colaRemain; //(새콜라==마시면 빈병)+나머지 빈병 = 총 빈병 수
        }
        return answer;*/

//s2
/*        return (n - b) / (a - b) * b;*/

//s3
/*        int answer = 0;
        while(n >= a){
            answer += (n / a)*b;
            n = (n / a)*b + (n % a);
        }
        return answer;*/

//s4
/*        int count = 0;
		int num = n;

        while(num >= a) {
            count += num / a * b;
            num = num / a * b + num % a;
        }
		return count;*/