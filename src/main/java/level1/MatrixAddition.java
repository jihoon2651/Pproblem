package level1;// 행렬의 합 리턴하기

public class MatrixAddition {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
                System.out.println(answer[i][j]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MatrixAddition matrixAddition = new MatrixAddition();
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
//        int[][] arr1 = {{1},{2}};
//        int[][] arr2 = {{3},{4}};

        matrixAddition.solution(arr1,arr2);
    }
}
