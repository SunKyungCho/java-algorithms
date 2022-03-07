package leetcode;

import java.util.ArrayList;
import java.util.List;



/*

nums가 주어졌을때 순열을 구하라.
순서는 상관이 없다.

nums = 1, 2, 3




* */



public class Permutations {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> results = new ArrayList<>();
        dfs(results, new ArrayList<>(), nums);
        return results;
    }

    private void dfs(List<List<Integer>> results, List<Integer> result, int[] nums) {
        if(result.size() == nums.length) {
            results.add(new ArrayList<>(result));
            return ;
        }

        for (int i = 0; i < nums.length; i++) {
            if(result.contains(nums[i])) {
                continue;
            }
            result.add(nums[i]);
            dfs(results, result, nums);
            result.remove(result.size() - 1);
        }
    }


}
