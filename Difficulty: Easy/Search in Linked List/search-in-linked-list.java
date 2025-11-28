/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        boolean found = false ;
        Node temp = head ;
        
        while(temp!=null) {
            if(temp.data == key) found = true ;
            temp = temp.next ;
        }
        return found ;
    }
}