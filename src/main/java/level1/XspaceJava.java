package level1;/*
정수 X와 자연수 n을 받아
X부터 시작해 X씩 중가하는 숫자를 n개 지니는 리스트를
리턴한다
*/

public class XspaceJava {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = x + (long) (i) *x;
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        XspaceJava xspaceJava  = new XspaceJava();
//        System.out.println(xspaceJava.solution(2,5));
        System.out.println(xspaceJava.solution(4,3));
//        System.out.println(xspaceJava.solution(-4,2));

    }
}
