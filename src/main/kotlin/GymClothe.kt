//


class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        val all = IntArray(n)

        for (i in lost) all[i - 1]--

        for (i in reserve) all[i - 1]++

        for (i in all.indices) {
            if (all[i] < 0) {
                if (i != all.size - 1 && all[i + 1] > 0) {
                    all[i]++
                    all[i + 1]--
                } else if (i != 0 && all[i - 1] > 0) {
                    all[i]++
                    all[i - 1]--
                }
            }
        }
        
        for (i in all.indices) {
            if (all[i] >= 0) {
                answer++
            }
        }
        return answer
    }
}

fun main() {

    val gym = Gym2()

    val n = 5
    val A = intArrayOf(5)
    val B = intArrayOf(4)
//        int n = 5;
//        int[] A = {2, 4};
//        int[] B = {1,3,5};
//        int n = 5;
//        int[] A = {3};
//        int[] B = {1,2,3};
//        int n = 5;
//        int[] A = {2,3,4};
//        int[] B = {1,2,3};
//        int n = 5;
//        int[] A = {1, 2};
//        int[] B = {1, 2};

    //        int n = 5;
//        int[] A = {2, 4};
//        int[] B = {1,3,5};
//        int n = 5;
//        int[] A = {3};
//        int[] B = {1,2,3};
//        int n = 5;
//        int[] A = {2,3,4};
//        int[] B = {1,2,3};
//        int n = 5;
//        int[] A = {1, 2};
//        int[] B = {1, 2};
    println(gym.solution(n, A, B))

}