package codility;

import java.util.ArrayList;
import java.util.List;

public class lesson1 {

    public static int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        List<Integer> digitIndex = getBinaryGaps(binaryString);
        return findBiggestGap(digitIndex);
    }

    public static int findBiggestGap(List<Integer> digitIndex) {
        int biggestGap = 0;
        for (int i = 0; i < digitIndex.size() - 1; i++) {
            int gap = digitIndex.get(i + 1) - digitIndex.get(i) - 1;
            biggestGap = Math.max(gap, biggestGap);
        }
        return biggestGap;
    }

    public static List<Integer> getBinaryGaps(String binaryString) {
        List<Integer> gaps = new ArrayList<>();
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                gaps.add(i);
            }
        }
        return gaps;
    }
}

