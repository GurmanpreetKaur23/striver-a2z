/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        int index = 0;
        Node node = head;
        while(node != null){
            if(index == p){
                Node n = new Node(x);
                Node next = node.next;
                node.next = n;
                n.prev = node;
                n.next = next;
                if(next != null){
                    next.prev = n;
                }
                break;
            }
            index++;
            node = node.next;
        }
        return head;
    }
}