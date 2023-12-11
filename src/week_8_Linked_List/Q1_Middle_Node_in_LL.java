package week_8_Linked_List;

public class Q1_Middle_Node_in_LL {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        Node middle = toFindMiddleNode(head);
        System.out.println(middle.value);
    }

    static Node toFindMiddleNode(Node head){
        if(head == null) return null;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}
