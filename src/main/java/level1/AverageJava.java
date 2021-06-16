//정수를 담고 있는 배열 arr의 평균값을 return

package level1;

public class AverageJava {

    public double solution(int[] arr) {
        double answer = 0;
        double arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        answer = arrSum/arr.length;
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        AverageJava averageJava = new AverageJava();
        int[] arr = {1,2,3,4};
        averageJava.solution(arr);

    }
}
