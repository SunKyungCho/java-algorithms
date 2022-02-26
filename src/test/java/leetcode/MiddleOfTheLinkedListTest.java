package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static leetcode.MiddleOfTheLinkedList.ListNode;
import static org.assertj.core.api.Assertions.assertThat;

class MiddleOfTheLinkedListTest {


    @Test
    void test() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode results = new MiddleOfTheLinkedList().middleNode(listNode);

        List<Integer> expected = new ArrayList<>();
        expected.add(results.val);
        expected.add(results.next.val);
        expected.add(results.next.next.val);
        assertThat(expected).containsExactly(3, 4, 5);
    }

    @Test
    void test1() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode results = new MiddleOfTheLinkedList().middleNode(listNode);

        List<Integer> expected = new ArrayList<>();
        while(results != null) {
            expected.add(results.val);
            results = results.next;
        }
        assertThat(expected).containsExactly(4, 5, 6);
    }

}