/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0 ;
        ListNode temp = head ;

        while(temp!=null) {
            count++ ;
            temp = temp.next ;
        }

        int steps = count - n ;

        if(steps==0) {
            // second node
            return head.next ;
        }
        temp = head ;
        for(int i=1 ; i<steps ; i++) {
            temp = temp.next ;
        }
        temp.next = temp.next.next ;
        return head ;
    }
}