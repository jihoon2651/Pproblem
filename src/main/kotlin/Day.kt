import java.util.*

// 2016년 1월 1일은 금요일
// 2016년 a월 b일은 무슨요일일까?
// 2016년은 윤년이다.
// 실제로 있는 날
// ex) a=5 b=24 -> 2016년 5월 24 TUE
// 1 :

class Day {
    fun solution(a: Int, b: Int): String {
        var answer = ""

        val dayList = arrayOf("SUN","MON","TUE","WED","THU","FRI","SAT")
        val finalList = intArrayOf(31,29,31,30,31,30,31,31,30,31,30,31)
        var sumDate = 0

        if (a > 1){
            for (i in 1 until a){
                sumDate += finalList[a-1]
            }
        }
        println(sumDate)

        when((sumDate+b)%7){
            1 -> answer = "SUN"
            2 -> answer = "MON"
            3 -> answer = "TUE"
            4 -> answer = "WED"
            5 -> answer = "THU"
            6 -> answer = "FRI"
            0 -> answer = "SAT"
        }
        println(answer)
        return answer
    }
}

fun main() {
    val day = Day()
    val a = 6
    val b = 22
    day.solution(a,b)
}