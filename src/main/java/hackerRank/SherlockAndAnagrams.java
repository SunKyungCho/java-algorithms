package hackerRank;

import java.util.Arrays;
import java.util.HashMap;

public class SherlockAndAnagrams {

    public static int solution(String s) {

        HashMap<String, Integer> map = new HashMap<>();
        int totalvalue = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String currentSubString = s.substring(i, j);
                char[] chars = currentSubString.toCharArray();
                Arrays.sort(chars);
                currentSubString = String.valueOf(chars);

                int value = map.getOrDefault(currentSubString, 0);
                totalvalue += value;
                map.put(currentSubString, ++value);
            }
        }
        return totalvalue;
    }

    public static boolean isEqualString(String keyword, String substring) {
        return keyword.chars().sum() == substring.chars().sum();
    }
}
