
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}

public class Length_of_LinkedList {

    //The function takes the head of a linked list as parameter and return the number of nodes in the linklist(Length of LinkedList)
    public int getCount(Node head) {
        // code here
        int numberOfNodes = 0;
        Node curr = head;
        
        //The Loop will run the exact number of times as the number of nodes present in the given LinkedList
        //And each time the loop executes it increases th numberOfNodes variable by one
        while(curr != null){
            numberOfNodes += 1;
            curr = curr.next;
        }
        
        return numberOfNodes;
    }
}