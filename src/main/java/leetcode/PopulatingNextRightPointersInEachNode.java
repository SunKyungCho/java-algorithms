package leetcode;

/*

116. Populating Next Right Pointers in Each Node
완벽한 이진트리가 주어진다.


BFS를 생각했지만 가만보니 DFS로 풀수 있을것 같았다.
완벽한 이진트리이기때문에

핵심은 왼쪽 오른쪽자식과 오른쪽 왼쪽 자식의 연결이다.






* */


import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode {

    public Node connect(Node root) {

        dfs(root, null);
        return root;
    }

    private void dfs(Node current, Node next) {
        if(current == null) return;

        current.next = next;
        dfs(current.left, current.right);
        dfs(current.right, current.next == null ? null : current.next.left);

    }


    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
