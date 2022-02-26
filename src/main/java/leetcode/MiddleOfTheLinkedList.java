package leetcode;


public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {

        ListNode middle = head;
        int count = 1;
        int middleIndex = 0;
        while (head != null) {
            int temp = count / 2;
            if (middleIndex != temp) {
                middle = middle.next;
                middleIndex = temp;
            }

            head = head.next;
            count++;
        }
        return middle;
    }

    static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
