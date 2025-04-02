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
    public ListNode findMiddle(ListNode head) {
        if(head==null || head.next==null) {
            return head ;
        }
        ListNode slow = head ;
        ListNode fast = head ;

        while(fast!=null && fast.next!=null && fast.next.next!=null) {
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
    }

    public ListNode mergeLists(ListNode head1 , ListNode head2) {
        if(head1!=null && head2!=null) {
            if(head1.val<=head2.val) {
                head1.next = mergeLists(head1.next , head2) ;
                return head1 ;
            } 
            else {
                head2.next = mergeLists(head1 , head2.next) ;
                return head2 ;
            }
        }

        if(head1==null) return head2; 
        return head1 ;
    }

    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) {
            return head ;
        }

        ListNode mid = findMiddle(head) ;
        ListNode secondhalf = mid.next ;
        mid.next = null ;

        ListNode left = sortList(head) ;
        ListNode right = sortList(secondhalf) ;

        return mergeLists(left , right) ;
    }
}