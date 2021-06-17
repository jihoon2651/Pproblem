package level1;

//정수 제곱근 판별
//임의의 양의 정수 n, n이 어떤 양의 정수 x의 제곱인지 판단
//n이 양의 정수x의 제곱곤근이면 x+1 제곱을리턴, 아니면 -1을 리턴
//ex 121 -> 144 / 3 -> -1
// 11 * 11 = 121

public class IntegerSquareRoot {

    public long solution(long n) {
        long answer = 0;
        String compareStr = "";

        double squreRootCheck = Math.pow(n,0.5);
        compareStr = Double.toString(squreRootCheck);
        System.out.println(compareStr);

//        String x = a.split("\\.")[1];
        long realNumberCheck = Long.parseLong(compareStr.split("\\.")[1]);
        int x = Integer.parseInt(compareStr.split("\\.")[0]);
//        System.out.println(x);
        if (realNumberCheck > 0){
            answer = -1;
        }else {
            answer = (long) Math.pow(x+1,2);
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        IntegerSquareRoot integerSquareRoot = new IntegerSquareRoot();
//        integerSquareRoot.solution(121);
        integerSquareRoot.solution(6);
    }
}
