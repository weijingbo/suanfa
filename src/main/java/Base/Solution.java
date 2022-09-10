package Base;

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode vhead = new ListNode();
        ListNode p = head.next;
        ListNode begin = vhead;
        int count = k;
        int sum = 1;
        while (p != null) {
            sum++;
            p = p.next;
        }
        p = head.next;
        while (sum >= k) {
            System.out.println(sum);
            while (head != null && count > 0) {
                head.next = vhead.next;
                vhead.next = head;
                head = p;
                if (p != null) p = p.next;
                count--;
            }
            while (vhead.next != null) {
                vhead = vhead.next;
            }
            sum -= k;
            count = k;
        }
        vhead.next = head;
        return begin.next;
    }
}