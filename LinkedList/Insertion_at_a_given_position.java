//Plateform - GeeksForGeeks

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Insertion_at_a_given_position {

    //Function to take head of a LinkedList, position where to add the new Node, and value of the new Node
    public Node insertPos(Node head, int pos, int val) {
        // code here
        if(pos == 1){
            Node temp = new Node(val);
            temp.next = head;
            return temp;
        }
        
        Node curr = head;
        
        for(int i = 1; i < pos -1 && curr != null; i++){
            curr = curr.next;
        }
        
        //When the position given is greater than the length of LinkedList
        if(curr == null){
            return null;
        }

        Node temp = new Node(val);
        temp.next = curr.next;
        curr.next = temp;
        return head;
        
    }
}
