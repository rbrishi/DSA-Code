package week_8_Linked_List;

public class Node {
    int value;
    Node next;

    public Node(int data){
        this.value = data;
        this.next = null;
    }

    void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
