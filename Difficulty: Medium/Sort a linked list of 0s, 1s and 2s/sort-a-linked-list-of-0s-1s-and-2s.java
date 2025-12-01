/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int count0 = 0 , count1 = 0 , count2 = 0 ;
        Node curr = head ;
        
        while(curr!=null) {
            if(curr.data == 0) count0++ ;
            else if(curr.data == 1) count1++ ;
            else count2++ ;
            
            curr = curr.next ;
        }
        curr = head ;
        
        while(count0-->0) {
            curr.data = 0;
            curr = curr.next ;
        }
        while(count1-->0) {
            curr.data = 1;
            curr = curr.next ;
        }
        while(count2-->0) {
            curr.data = 2;
            curr = curr.next ;
        }
        return head ;
    }
}