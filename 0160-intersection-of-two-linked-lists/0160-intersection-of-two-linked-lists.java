/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int getLength(ListNode head) {
        ListNode temp = head ;
        int len= 0;
        while(temp!=null) {
            temp = temp.next ;
            len++ ;
        } 
        return len ;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA) ;
        int lenB = getLength(headB) ;

        while(lenA>lenB) {
            headA = headA.next ;
            lenA--;
        } 
        while(lenB>lenA) {
            headB = headB.next ;
            lenB-- ;
        }
        while(headA!=headB) {
            headA = headA.next ;
            headB = headB.next ;
        }
        return headA ;
    }
}