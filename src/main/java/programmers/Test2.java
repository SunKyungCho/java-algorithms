package programmers;

import java.sql.Array;
import java.util.*;

public class Test2 {


    public static String solution(int[] numbers) {

        List<String> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(String.valueOf(number));
        }


        Stack<String> objects = new Stack<>();

        Collections.sort(list, (a, b) -> {
            int length = Math.min(a.length(), b.length());
            char[] aChars = a.toCharArray();
            char[] bChars = b.toCharArray();
            for (int i = 0; i < length; i++) {
                if (aChars[i] > bChars[i]) {
                    return -1;
                } else if (aChars[i] < bChars[i]) {
                    return 1;
                } else {
                    continue;
                }
            }
            return 0;
        });
        return String.join("", list);
    }



    public static void main(String[] args) {
        String solution = solution(new int[]{3, 30, 34, 5, 9});
        System.out.println();
    }
}
