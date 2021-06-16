package level1;

//콜라츠
//주어진 수가 1이 될때까지 다음작업을 반복하면 모든 수를 1로 만들 수 있다
//1-1 입력된 수가 짝수라면 2로 나눈다
//1-2 입력된 수가 홀수라면 3을 곱하고 1을 더한다
//1-3 결과로 나온 수에 같은 작업을 1이 될때까지 반복
//몇번반복해야 1이 되는지 반복횟수를 리턴, 500이상이라면 -1로 반환

//문제에는 매개변수가 Int num 으로 주어졌고
//long 으로 바꿀시 해결

public class CollatzJava {

    public int solution(long num) {
        int answer = 0;

        while (true) {
            if (num == 1 || answer >= 500){
                break;
            }
            if (num % 2 == 0) {
                num = num/2;
            }else{
                num = (num*3)+1;
            }
            answer++;
        }

        if (answer >= 500 ) {
            answer = -1;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        CollatzJava collatzJava = new CollatzJava();
        collatzJava.solution(626331);
    }
}
