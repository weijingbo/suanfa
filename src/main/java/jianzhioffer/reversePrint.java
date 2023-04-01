package jianzhioffer;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class reversePrint {
    public int[] reversePrint(ListNode head) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while(head != null) {
            stack.addLast(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = stack.removeLast();
        return res;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode next = new ListNode(3);
        ListNode last = new ListNode(2);
        head.next = next;
        next.next = last;
        reversePrint reversePrint = new reversePrint();
        System.out.println(Arrays.toString(reversePrint.reversePrint(head)));
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}