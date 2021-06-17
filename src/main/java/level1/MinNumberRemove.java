package level1;

//제일 작은 수 제거하기
//배열에서 가장 작은 수를 재거거 한 후 리턴

import sun.nio.cs.ext.IBM037;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MinNumberRemove {

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        ArrayList<Integer> answerList = new ArrayList<>();
        int min = 0;
        int index = 0;
        min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            answerList.add(arr[i]);

            if (i == 0)
                continue;

            if (min > arr[i]) {
                min = arr[i];
            }
        }

//        ArrayList를 활용한
//        HashSet<Integer> hashSet = new HashSet<>();
//        for (int item : answerList) {
//            hashSet.add(item);
//        }
//
//
//        hashSet.remove(index);
////        answerList.remove(index);
//
//        for (int i = 0; i < answerList.size(); i++) {
//            System.out.println(answerList.get(i));
//        }
//
//        Iterator<Integer> iterSet = hashSet.iterator();
//
//        if (arr.length == 1) {
//            answer[0] = -1;
//        } else {
//            for (int i = 0; i < arr.length - 1; i++) {
//                answer[i] = iterSet.next();
//            }
//        }


        if (arr.length == 1) {
            answer = new int[arr.length];
            answer[0] = -1;

        } else {
            answer = new int[arr.length - 1];
//          5 1 3 4
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == min) {
                    continue;
                }
                answer[index++] = arr[i];
            }

        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        MinNumberRemove minNumberRemove = new MinNumberRemove();
//        int[] arr = {4, 3, 2, 1};
//        int[] arr = {10};
//        int[] arr = {1,2,3,4};
//        int[] arr = {5, 1, 3, 4};
        int[] arr = {5, 1, 1,4};

        System.out.println(minNumberRemove.solution(arr));
    }
}
