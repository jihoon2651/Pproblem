import java.util.*
import kotlin.Comparator

//"sun", "bed", "car" , n = 1 이면
//-> "u", "e", "a"
//-> 포함되어있는 문자열로 정렬
//-> 'car', "bed", "sun"

class StringArrray {

    fun solution(strings: Array<String>, n: Int): Array<String?> {
        val answer = arrayOfNulls<String>(strings.size)

        val stringList = arrayOfNulls<String>(strings.size)

        for (i in strings.indices) {
            stringList[i] = strings[i].substring(n,n+1)
            println(stringList[i])
        }
        Arrays.sort(stringList)
        //Comparator 람다식 비교 메서드
        Arrays.sort(strings) { s1, s2 ->

            val c1 = s1[n]
            val c2 = s2[n]

            if (c1 == c2){
                // 사전순으로 정렬
                s1.compareTo(s2)
            } else{
                // 순서를 바꾼다
                -1
            }
        }

        for (i in answer.indices) {
            println(answer[i])
        }

        return answer
    }

}

fun main() {

    val stringArrray = StringArrray()
//    val strings = arrayOf("sun", "bed", "car")
    val strings = arrayOf("abce", "abcd", "cdx")
    val n = 2
    stringArrray.solution(strings,n)

}