package leetcode;
/*
[70. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)

다이나믹프로그래밍


피보나치 수열과 같다.
f(5) = f(4) + f(3) + f(2)
f(4) = f(3) + f(2)

*/
class ClimbinStairs {

    static int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] temp = new int[n + 1];

        temp[1] = 1;
        temp[2] = 2;

        for(int i = 3; i <=n; i++) {
            temp[i] = temp[i - 1] + temp[i - 2];
        }

        return temp[n];
    }
}
