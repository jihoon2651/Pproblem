import java.util.*
import java.util.ArrayList
import java.util.Arrays

class MockTest2 {
    fun solution(answers: IntArray): IntArray? {
        val point = intArrayOf(0, 0, 0) // 점수표
        var pointCopy = intArrayOf() // 점수표 정렬
        var max = 0 // 점수 최대값
        val list = ArrayList<Int>() // 정답자 넣기
        val spzPatterns = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
            intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        )

        // [1] 채점하기
        for (i in answers.indices) {
            if (spzPatterns[0][i % 5] == answers[i]) {
                point[0]++
            }
            if (spzPatterns[1][i % 8] == answers[i]) {
                point[1]++
            }
            if (spzPatterns[2][i % 10] == answers[i]) {
                point[2]++
            }
        }

        // [2] 점수표 정렬해서 가장 큰 값 찾기
        pointCopy = point.clone()
        Arrays.sort(pointCopy)
        max = pointCopy[2]
        for (i in point.indices) {
            if (point[i] == max) {
                list.add(i + 1)
            }
        }

        // [3] 가장 큰 값을 가진 학생 번호 구하기
        val answer = IntArray(list.size)
        for (i in answer.indices) {
            answer[i] = list[i]
            println(answer[i])
        }
        return answer
    }
}

fun main() {
    val mockTest2 = MockTest2()
    val answers = intArrayOf(1,2,3,4,5)
//    val answers = intArrayOf(1,3,2,4,2)

    println(mockTest2.solution(answers))
}