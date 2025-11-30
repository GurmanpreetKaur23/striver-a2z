// User function Template for Java

class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head = new Node(arr[0]) ;
        Node curr = head ;
        
        for(int i=1 ; i<arr.length ; i++) {
            Node temp = new Node(arr[i]);
            temp.next = null ;
            temp.prev = curr  ;
            curr.next = temp ;
            curr = temp ;
        }
        return head; 
    }
}