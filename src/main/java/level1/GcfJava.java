package level1;

import java.util.ArrayList;

//두수를 입력받아 최대공약수와 최소공배수를 리턴
//최대 공약수 : 두수를 나눌수 있는 최대 수
//          3 12
//      3   1  4
//          50 55
//      5   10  11
// -> 유클리드의 호제법을 이용하자

public class GcfJava {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int temp = 0;
        int gcf = 0;

        if (n < m) {
            temp = n;
            n = m;
            m = temp;
        }
        int a = n;
        int b = m;

        if (n % m == 0) {
            answer[0] = m;
            answer[1] = n;
        }else{
            while (b != 0) {
                //20 12 12 8
                gcf = a%b;
                a = b;
                b = gcf;
            }
            answer[0] = a;
            answer[1] = n*m / answer[0];
        }

        System.out.println(answer[0]);
        System.out.println(answer[1]);

        return answer;
    }
    public static void main(String[] args) {
        GcfJava gcfJava = new GcfJava();
//        gcfJava.solution(3,12);
        gcfJava.solution(20,12);
    }
}
