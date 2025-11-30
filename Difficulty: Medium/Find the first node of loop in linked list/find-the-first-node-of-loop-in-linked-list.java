/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        Node slow = head , fast = head ;
        boolean found = false ;
        while(fast != null && fast.next != null) {
            slow = slow.next ;
            fast = fast.next.next ;
            if(slow == fast){
                found = true ;
                break ;
            }
        }
        if(!found) return -1 ;
        slow = head;
        while(slow != fast) {
            slow = slow.next ;
            fast = fast.next ;
        }
        return slow.data ;
    }
}