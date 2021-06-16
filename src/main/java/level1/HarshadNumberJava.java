package level1;//양의 정수 x가 하샤드 수 이려면
//x의 자릿수의 합으로 x가 나누어져야한다
//예를 들어 18의 자릿수 합은 1+8=9 이고
//18은 9로 나누어 떨어짐으로 18은 하셔드 수이다
//하셔드 수 판별하도록 리턴

public class HarshadNumberJava {

    public boolean solution(int x) {
        boolean answer = true;
        int xSum = 0;
        String xToString = "";

        xToString = Integer.toString(x);

        for (int i = 0; i < xToString.length(); i++) {
            xSum += Integer.parseInt(xToString.substring(i,i+1));
        }
        System.out.println(xSum);

        if (x % xSum == 0) {
            answer = true;
        }else {
            answer = false;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        HarshadNumberJava harshadNumberJava = new HarshadNumberJava();
//        harshadNumberJava.solution(10);
//        harshadNumberJava.solution(12);
//        harshadNumberJava.solution(11);
//        harshadNumberJava.solution(13);

    }
}
