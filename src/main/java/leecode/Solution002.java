package leecode;

/**
 * @author plw on 2021/4/9 5:21 PM.
 * @version 1.0
 */
public class Solution002 {

    /**
     * 内部节点对象
     */
    public static class ListNode {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        int carry = 0;
        ListNode head = null;
        ListNode tail = null;
        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry != 0) {
            ListNode node = new ListNode(carry);
            tail.next = node;
            tail = node;
        }
        return head;
    }
}
