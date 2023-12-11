package week_8_Linked_List;

public class Q2_Remove_Duplicate {
    public static void main(String[] args) {
        Node head = new Node(-1);
        Node n2 = new Node(-1);
        Node n3 = new Node(2);
        Node n4 = new Node(2);
        Node n5 = new Node(3);
        Node n6 = new Node(3);

        head.next=n2; n2.next=n3; n3.next=n4; n4.next=n5; n5.next=n6;
        printLL(head);

        Node unique = removeDuplicate(head);
        printLL(unique);
    }
    static Node removeDuplicate(Node head){
        if(head == null) return null;

        Node temp = head;
        Node original = head;
        Node newHead = null;

        while (original != null){
            while (original.next != null && original.value == original.next.value){
                original = original.next;
            }
            if(newHead == null){
                newHead = temp = original;
            }else{
                temp.next = original;
                temp = original;
            }
            original = original.next;
        }
        return newHead;
    }

    static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
