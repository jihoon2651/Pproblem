package level1;

//num이 짝수일 경우 Even / 홀수 : Odd 반환

public class EvenOddNumber {

    public String solution(int num) {
        String answer = "";

        if (num % 2 == 0) {
            answer = "Even";
        }

        if (num % 2 != 0) {
            answer = "Odd";
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        System.out.println(evenOddNumber.solution(3));
    }

}

