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
    public ListNode rotateRight(ListNode head, int k) {
         if(head==null || head.next==null || k==0) {
            return head ;
        }
        int len = 0 ;
        ListNode temp = head , prev = null , curr = head ;

        while(temp!=null) {
            len++ ;
            temp = temp.next ;
        }
        k = k % len ;

        while(k-->0) {
            while(curr.next!=null) {
                prev=curr;
                curr=curr.next ;
            }
            prev.next = null ;
            curr.next = head ;
            head = curr ;
        }
        return head ;
    }
}