package programmers;

public class AntSwarm {

    //개미 군단이 사냥을 나가려고 합니다. 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다. 장군개미는 5의 공격력을,
// 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다. 예를 들어 체력 23의 여치를 사냥하려고 할 때,
// 일개미 23마리를 데리고 가도 되지만, 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
// 사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가
// 필요한지를 return하도록 solution 함수를 완성해주세요.
    //    public int solution(int hp) {
    //        int answer = 0;
    //        return answer;
    //    }
    public static void main(String[] args) {
        int hp = 544249;
        int answer;
        int generalAnt = 5;
        int killerAnt = 3;
        int workerAnt = 1;
        int count;
//        System.out.println("hp : " + hp);
//        System.out.println("---------");
        System.out.println("버르장머리 없는 여치와 개미군단간의 전투가 시작되었다!");
        holdingTwo();
        System.out.println("여치 : 풉, 미개한 개미들 같으니.");
        holdingOne();
        System.out.println("개미군단 : 드디어, 올 것이 왔군.");
        holdingTwo();
        System.out.println("---------");

        System.out.println("여치의 현재 hp : " + hp);
        holdingTwo();
        System.out.println("---------");

        System.out.println("장군개미들이 먼저 여치를 공격합니다!");
        count = hp / generalAnt;
        hp = hp - generalAnt * count;
        generalAnt = count;
        holdingTwo();
        System.out.printf("장군개미 %d마리의 효과는 탁월했다!\n", count);
//        System.out.println("generalAnt : " + generalAnt);
        holdingOne();
        System.out.println("여치의 현재 hp : " + hp);
        holdingOne();
        System.out.println("---------");

        System.out.println("병정개미가 이어서 여치를 후둘겨 팹니다!");
        count = hp / killerAnt;
        hp = hp - killerAnt * count;
        killerAnt = count;
        holdingTwo();
        if (killerAnt == 0) {
            System.out.printf("안타깝게도 여치는 병정개미가 활약할 체력이 없었다!\n");
        } else {
            System.out.printf("병정개미 %d마리의 효과는 탁월했다!\n", count);
        }
        holdingOne();
//        System.out.println("killerAnt : " + killerAnt);
        System.out.println("여치의 현재 hp : " + hp);
        holdingOne();
        System.out.println("---------");

        System.out.println("이어서 일꾼개미가 숟가락을 얹어봅니다!");
        count = hp / workerAnt;
        hp = hp - workerAnt * count;
        workerAnt = count;
        holdingTwo();
        if (workerAnt == 0) {
            System.out.printf("안타깝게도 여치는 일꾼개미가 활약할 체력이 없었다!\n");
        } else {
            System.out.printf("일꾼개미 %d마리가 숟가락공격으로 마무리했다!\n", count);
        }
        holdingOne();
        System.out.println("여치의 현재 hp : " + hp);
        holdingOne();
        System.out.println("---------");

        System.out.println("개미군단의 승리!");
//        System.out.println("workerAnt : " + workerAnt);
//        System.out.println("---------");
        answer = generalAnt + killerAnt + workerAnt;
        holdingTwo();
        System.out.println("여치 : ㅇ..이 미친 개미들이...끄억.");
        holdingOne();
        System.out.println("개미군단 : 오늘을 기억하라.");
        holdingTwo();
        System.out.println("---------");
        System.out.println("활약한 개미의 수 : " + answer);
    }
    //제출 원본
    //int answer;
    //        int generalAnt = 5;
    //        int killerAnt = 3;
    //        int workerAnt = 1;
    //        int count;
    ////        System.out.println("hp : " + hp);
    ////        System.out.println("---------");
    //
    //        count = hp / generalAnt;
    //        hp = hp - generalAnt * count;
    //        generalAnt = count;
    ////        System.out.println("generalAnt : " + generalAnt);
    ////        System.out.println("hp : " + hp);
    ////        System.out.println("---------");
    //
    //        count = hp / killerAnt;
    //        hp = hp - killerAnt * count;
    //        killerAnt = count;
    ////        System.out.println("killerAnt : " + killerAnt);
    ////        System.out.println("hp : " + hp);
    ////        System.out.println("---------");
    //
    //        count = hp / workerAnt;
    //        hp = hp - workerAnt * count;
    //        workerAnt = count;
    ////        System.out.println("workerAnt : " + workerAnt);
    ////        System.out.println("---------");
    //
    //        answer = generalAnt + killerAnt + workerAnt;

    //              //이제 첨삭도 좀 하자
    //            hp/5 = 5공격횟수
    //            hp%5 /3 = 3공격횟수
    //            hp%5 %3 = 1공격횟수

    public static void holdingOne() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void holdingTwo() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
