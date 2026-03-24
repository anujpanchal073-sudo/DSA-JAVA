//Plateform - Leetcode
//QuestionId - 138
//Difficulty - Medium

//Time Complexity - O(n)
//Space Complexity - O(1)


class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


public class Copy_LinkedList_with_random_pointer {
    public Node copyRandomList(Node head) {
        
        if(head == null){
            return null;
        }

        Node curr = head;

        while(curr != null){
            Node temp = new Node(curr.val);
            temp.next = curr.next;
            curr.next = temp;
            curr = curr.next.next;
        }

        curr = head;

        while(curr != null){
            if(curr.random == null){
                curr.next.random = null;
            }
            else{
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        curr = head;
        Node nhead = curr.next;
        Node copy = curr.next;

        while(curr != null){
            curr.next = curr.next.next;
            if(copy.next != null){
                copy.next = copy.next.next;
            }
            curr = curr.next;
            copy = copy.next;
        }
        return nhead;
    }
}
