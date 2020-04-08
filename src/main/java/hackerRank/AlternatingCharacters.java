package hackerRank;

public class AlternatingCharacters {

    public static int solution(String s) {

        int count = 0;
        char before = ' ';
        for (int i = 0; i < s.length(); i++) {

            char spell = s.charAt(i);
            if( spell == before) {
                count++;
            }
            before = spell;
        }
        return count;
    }
}
