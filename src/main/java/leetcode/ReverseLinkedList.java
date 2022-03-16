package leetcode;


/*

linked List 뒤집기




* */
class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode nextNode = head.next;
        ListNode newNode = reverseList(nextNode);

        newNode.next = head;
        head.next = null;
        return newNode;
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
