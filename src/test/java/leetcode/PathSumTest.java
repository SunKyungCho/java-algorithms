package leetcode;

import org.junit.jupiter.api.Test;

import static leetcode.PathSum.TreeNode;
import static org.assertj.core.api.BDDAssertions.then;

class PathSumTest {


    @Test
    void test() {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), null);
        PathSum pathSum = new PathSum();
        boolean result = pathSum.hasPathSum(treeNode, 1);
        then(result).isFalse();
    }
}