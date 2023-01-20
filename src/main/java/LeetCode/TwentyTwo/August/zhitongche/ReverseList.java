package LeetCode.TwentyTwo.August.zhitongche;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseList {


 public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
    public ListNode reverseList(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode p = head.next;
        head = head.next;
        while(head ==null){
            head.next = temp.next;
            temp.next = head;
            head = p;
            if(p.next !=null){
                p = p.next;
            }

        }
        return temp.next;
    }

}
