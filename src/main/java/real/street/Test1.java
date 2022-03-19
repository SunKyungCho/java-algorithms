package real.street;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* N [1...200,000]
 * 주어진 문자열에 'B', 'A', 'L', 'L', 'O', 'O', 'N'이 포함되어 있으면 삭제하라
 * 순서는 상관없음
 * 몇번에 걸쳐서 삭제되는지

풀이:
 BAONXXOLL

* */
public class Test1 {

    public int solution(String S) {

        Map<Character, Integer> map = new HashMap<>();
        List<Character> balloonFull = List.of('B', 'A', 'L', 'O', 'N');
        List<Character> balloonSingle = List.of('B', 'A', 'N');
        List<Character> balloonDouble = List.of('L', 'O');
        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character balloon : balloonFull) {
            if (!map.containsKey(balloon)) {
                return 0;
            }
        }

        //최소값을 찾아야한다.
        int loop = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (balloonSingle.contains(entry.getKey())) {
                loop = Math.min(loop, entry.getValue());
            } else if (balloonDouble.contains(entry.getKey())) {
                loop = Math.min(loop, entry.getValue() / 2);
            }
        }
        return loop;
    }
}
