package real.brid;

import java.util.LinkedList;
import java.util.List;


public class TestCheck {

    public String solution(String S) {
        // write your code in Java SE 8
        List<Character> list = new LinkedList<>();
        for (char c : S.toCharArray()) {
            list.add(c);
        }
        int head = 0;
        while (head + 1 < list.size()) {
            if ((list.get(head) == 'B' && list.get(head + 1) == 'A')
                    || (list.get(head) == 'A' && list.get(head + 1) == 'B')
            ) {
                list.remove(head + 1);
                list.remove(head);
                head = 0;
                continue;
            } else if ((list.get(head) == 'C' && list.get(head + 1) == 'D')
                    || (list.get(head) == 'D' && list.get(head + 1) == 'C')
            ) {
                list.remove(head + 1);
                list.remove(head);
                head = 0;
                continue;
            }
            head++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : list) {
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }
}
