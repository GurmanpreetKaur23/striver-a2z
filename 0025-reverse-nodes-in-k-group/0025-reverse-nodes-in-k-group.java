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
    public ListNode reverseKGroup(ListNode head, int k) {
        // step1 - pehla check kro k groups hai v
        ListNode temp = head ;
        int cnt = 0 ;

        while(cnt<k) {
            if(temp==null) return head ;
            temp = temp.next ;
            cnt++ ;
        }

        // step2 - recursivly call the rest of the list
        ListNode prev = reverseKGroup(temp , k) ;

        // step3 - reverse the rest of the LL
        temp = head ;
        cnt = 0 ;

        while(cnt<k) {
            ListNode next = temp.next ;
            temp.next = prev ;
            prev = temp ;
            temp = next ;

            cnt++ ;
        }
        return prev ;
    }
}