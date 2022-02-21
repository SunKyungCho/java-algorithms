package leetcode;

/*
*
* https://leetcode.com/problems/min-cost-climbing-stairs/
* */
public class MinCostClimbingStairs {

    public static int minCostClimbingStairs(int[] cost) {

//        int step = -1;
//        int minimum = 0;
//        while(step + 1 < cost.length && step + 2 < cost.length) {
//            step += cost[step+1] < cost[step+2] ? 1 : 2;
//            minimum += cost[step];
//        }
//        return minimum;

        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }


}
