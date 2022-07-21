package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStonWeight {

    public static int lastStoneWeight(int[] stones) {

        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            q.add(stone);
        }

        while (q.size() > 1) {
            Integer first = q.poll();
            Integer second = q.poll();
            Integer result = first - second;
            if (result > 0) {
                q.add(result);
            }
        }

        return q.size() > 1 ? q.poll() : 0;
    }
}
