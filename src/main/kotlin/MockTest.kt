import java.util.*
import java.util.ArrayList




//수포자
//  1번 : 1 2 3 4 5 1 2 3 4 5 ...
//  2번 : 2 1 2 3 2 4 2 5 2 1 ...
//  3번 : 3 3 1 1 2 2 4 4 5 5 ...
// 가장 많이 문제를 맞춘순으로 출력
// 같으면 오름차순으로
// ex) 1 2 3 4 5 -> 1
// ex) 1 3 2 4 2 -> 1,2,3

class MockTest {
    fun solution(answers: IntArray): IntArray {

        val answerList =
            arrayOf(
                intArrayOf(1, 2, 3, 4, 5),
                intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
                intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
            )

        val scoreList = IntArray(3)
        var scoreListCopy = intArrayOf()

        val list = ArrayList<Int?>()
        var max = 0

        for (i in answers.indices) {
            if (answerList[0][i % 5] == answers[i]) {
                scoreList[0]++
            }
            if (answerList[1][i % 8] == answers[i]) {
                scoreList[1]++
            }
            if (answerList[2][i % 10] == answers[i]) {
                scoreList[2]++
            }
        }

//        for (i in answers.indices) {
//            for (j in answerList.indices) {
//                if (answers[i] == answerList[j][i]) {
//                    scoreList[j]++
//                }
//            }
//        }

        scoreListCopy = scoreList.clone()
        Arrays.sort(scoreListCopy)
        max = scoreListCopy[2]

//        for (i in scoreList.indices) {
//            println(scoreList[i])
//        }

        for (i in scoreList.indices) {
            if (scoreList[i] == max) {
                list.add(i+1)
            }
        }

        val result = IntArray(list.size)

        for (i in result.indices) {
            result[i] = list[i]!!
            println(result[i])
        }

        return result
    }
}

fun main() {
    val mockTest = MockTest()
    val answers = intArrayOf(1,2,3,4,5)
//    val answers = intArrayOf(1,3,2,4,2)

    println(mockTest.solution(answers))
}