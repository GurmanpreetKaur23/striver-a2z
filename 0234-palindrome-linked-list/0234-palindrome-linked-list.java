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
    public ListNode reverse(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }

        ListNode curr = head ; 
        ListNode prev = null ;
        ListNode next = null ;

        while(curr!=null) {
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true ;

        ListNode slow = head ;
        ListNode fast = head ;
        while(fast!=null && fast.next!=null) {
            slow = slow.next ;
            fast = fast.next.next ;
        }

        ListNode secondhalf = reverse(slow) ;

        ListNode firsthalf = head ;
        ListNode temp = secondhalf ;

        while(secondhalf !=null) {
            if(firsthalf.val != secondhalf.val) {
                // reverse(temp) ;
                return false ;
            }
            firsthalf = firsthalf.next ;
            secondhalf = secondhalf.next ;
        }
        // reverse(temp) ;
        return true ;
    } 
}