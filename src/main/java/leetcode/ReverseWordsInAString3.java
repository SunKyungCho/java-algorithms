package leetcode;

import java.util.StringJoiner;

public class ReverseWordsInAString3 {

    public String reverseWords(String s) {

        String[] splits = s.split(" ");
        StringJoiner joiner = new StringJoiner(" ");
        for (String str : splits) {
            joiner.add(new StringBuilder(str).reverse().toString());
        }
        return joiner.toString();
    }
}
