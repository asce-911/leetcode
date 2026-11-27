class Solution {

    ListNode reverse(ListNode left, int i) {
        ListNode curr = left;
        ListNode prev = null;

        while (i-- > 0) {
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }

        left.next = curr;
        return prev;
    }

    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode left = head;
        ListNode prevleft = null;
        ListNode res = null;

        while (left != null && left.next != null) {

            ListNode right = left.next;
            ListNode nextleft = right.next;

            ListNode newHead = reverse(left, 2);

            if (res == null) {
                res = newHead;
            }

            if (prevleft != null) {
                prevleft.next = newHead;
            }

            prevleft = left;
            left = nextleft;
        }

        if (prevleft != null) {
            prevleft.next = left;
        }

        return res;
    }
}