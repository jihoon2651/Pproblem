import java.text.SimpleDateFormat
import java.util.*

// 2016년 1월 1일은 금요일
// 2016년 a월 b일은 무슨요일일까?
// 2016년은 윤년이다.
// 실제로 있는 날
// ex) a=5 b=24 -> 2016년 5월 24 TUE
// 1 :

class Day2 {
    fun solution(a: Int, b: Int): String {
        var answer = ""

        val cal = Calendar.getInstance()
        cal[2016, a - 1] = b
        val date = cal.time
        val sim = SimpleDateFormat("E", Locale.ENGLISH)
        answer = sim.format(date).toUpperCase()

        return answer
    }
}

fun main() {
    val day2 = Day2()
    val a = 5
    val b = 24
    println(day2.solution(a,b))
}