//Plateform - LeetCode
//QuestionId - 206

/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

public class Reverse_LinkedList {
    public Node reverseList(Node head) {
        
        //Returns the head if the provided LinkedList is null or have a single node
        if(head == null || head.next == null){
            return head;
        }
        Node prev = null;
        Node curr = head;
        Node nxt = head.next;

        //Inverts the link of Nodes from next node to previous node
        while(nxt != null){
            curr.next = prev;
            prev = curr;
            curr = nxt;
            nxt = nxt.next;
        }
        curr.next = prev;
        return curr;

    }
}
