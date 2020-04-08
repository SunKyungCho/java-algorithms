package hackerRank;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {


    public static int solution(String first, String second) {

        Map<Character, Integer> map = new HashMap<>();
        for (char letter: first.toCharArray()) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }
        for (char letter: second.toCharArray()) {
            map.put(letter, map.getOrDefault(letter, 0) - 1);
        }

        return map.values().stream()
                .mapToInt(Math::abs)
                .sum();
    }

}
