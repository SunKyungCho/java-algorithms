package leetcode;

/*
# 567. Permutation in String

## 문제
s1, s2 두개의 문자열이 있을때
s1의 순열이 s2에 포함되어 있다면 true 아니면 false를 리턴하라.

순열 -> s1의 모든 조합

### 첫번째 풀이:
둘다 정렬을 한다.

s1 -> ab
s2 -> eidbaooo -> 정렬 -> abdeiooo
s2에 s1이 포함되어 있는지 확인한다.

### 두번째 풀이 sliding window
두개를 비교하는데
=====
ab
eidbaooo
 ab
eidbaooo
  ab
eidbaooo
=====
이렇게 하나씩 밀어가면서 비교를 해준다. 일치하면 true하면 된다.
그렇면 비교를 어떻게할 수 있을까? 비교의 핵심은 문자에 중복이 있을 수 있다는것 일것 같다.
빈도를 체크하면 될 것 같다.

매번 비교를 해야해서 비효율적이다. s1의 최대 100000인데 이걸 매번 비교하는건 타임아웃이 날것이다.

### 세번째 풀이
이문자제는 소문자만을 사용하고 있다 즉 int[26]개면 충분하다.
int[26]를 설정하고

s1의 루프를 돌면서 문자의 index를 -1해주자.
ab ->  [-1, -1, 0,0,0,0,0,.......] 이렇게 구성될거다.

그러면 두번째로 s2의 루프를 돌면서 int[26]에 더하기를 해주자.
이게 만약 모두 0이라면 일치하는게 있다고 볼 수 있겠다!

ab
eidbaooo
 ab
eidbaooo -> e를 0으로 초기화
  ab
eidbaooo -> i를 0으로 초기화

주의 점은 이미 지나온 곳은 초기화를 해주어야 한다는 것이다.
비교하는 s1가 지나온 곳은 비교의 대상이 아니므로 다시 다시 값을 빼주어 비교대상이 아니게 한다.

* */

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {

        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']--;
        }

        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i) - 'a']++;
            if(i - s1.length() >= 0) {
                count[s2.charAt(i - s1.length()) - 'a']--;
            }
            if(check(count)) {
                return true;
            }
        }
        return false;
    }

    private boolean check(int[] count) {
        for (int i : count) {
            if(i != 0) return false;
        }
        return true;
    }
}
