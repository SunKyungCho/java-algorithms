package leetcode;


/*

문제: 문자열 s가 있을때 반복하지 문자열의 최대 길이는?

## 풀이 1:
a b c a b c b b

각 문자의 위치를 기억한다.
위치를 가지고 문자열의 길이는 어떻게 구할 수 있는가?
HashMap에 위치를 기억하다 보면 이미 가지고 있는 문자를 만나는 순간이 오게 된다.

1번째 a  => map.put(a, 1);
2번째 b  => map.put(b, 2);
3번째 c  => map.put(c, 3);
4번째 a  << a는 이미 위치 1을 가지고 있다!

이미 있는 문자를 만났다는건
이미 있는 문자에서 부터 지금까지의 길이가 중복이 없었던 문자의 길이라는 것이다.
현재 만난 a는 4번째 이미 있는 문자의 위치는 1번째
4 - 1 = 3
중복이 없었던 문자열의 길이는 3이라는 것을 알 수 있다.
이렇게 구해진 문자를 가지고 max 값을 갱신해 나가면 최종 최대 문자열의 길이를 구할 수 있을 것이다.

### 첫풀이 문제점:
abc
이 경우는 어떨까? 중복이 되었을때만 길이를 구할 수 있어서 처음부터 중복이 없는 경우는 값을 구할 수가 없었다.

## 풀이 2
start 값을 갖는다.
즉, 어디를 기준점으로 문자의 길이를 재고 있는지 시작점을 기억한다.
그러면 현재의 중복여부와 상관없이 현재의 인덱스를 가지고 문자열의 길이를 알 수 있을것이다.

중복이 나타나면 start를 업데이트 해준다.
start를 가지고 문자열 길이를 구해서 max로 계속 갱신해준다면 결과를 구할 수 있을 것이다.

* */


import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> position = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (position.containsKey(s.charAt(i))) {
                /*
                Math.max를 써야 하는 이유는 이미 나온 문자가 기준점 보다 이전에 나온 문자라면
                이건 새로운 기준점이 아니라 신규 문자로 봐야 한다.

                abcabcbb << input 문자열

                ab(start)c'a'
                a의 경우 이미 있기때문에 positon에서 0이 나올것이다.
                이런경우 기준점이 변하진 않는다. 그냥 중복없는 문자열 길이가 늘어난것.

                */
                start = Math.max(start, position.get(s.charAt(i)) + 1);
            }
            position.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}
