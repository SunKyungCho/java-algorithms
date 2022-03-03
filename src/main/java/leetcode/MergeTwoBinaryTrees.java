package leetcode;


/*
두개의 TreeNode가 있다.
두개의 노드를 병합하라.
같은 포지션의 값이 있다면 값을 더하면 된다.

dfs 로 풀어보자.

현재 값을 더한다.






*/

public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1, root2);
    }

    private TreeNode merge(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) {
            return null;
        } else if(root1 == null) {
            return new TreeNode(root2.val, merge(null, root2.left), merge(null, root2.right));
        } else if(root2 == null) {
            return new TreeNode(root1.val, merge(root1.left, null), merge(root1.right, null));
        } else {
            return new TreeNode(root1.val + root2.val, merge(root1.left, root2.left), merge(root1.right, root2.right));
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
