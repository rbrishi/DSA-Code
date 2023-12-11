package week_8_Linked_List;

public class Q3_Reverse_LL {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        head.next=n2; n2.next=n3; n3.next=n4; n4.next=n5;
        printLL(head);

        Node reverseNode = reverseLLRecursively(head);
        printLL(reverseNode);
    }
    static Node reverseLL(Node head){
        if(head == null || head.next == null) return head;

        Node prev = head;
        Node cur = head.next;
        head.next = null;

        while (cur != null){
            Node forward = cur.next;
            cur.next = prev;
            prev = cur;
            cur = forward;
        }
        return prev;
    }

    static Node reverseLLRecursively(Node head){
        if(head == null || head.next == null) return head;

        Node headOfSubProblem = reverseLLRecursively(head.next);
        head.next.next = head;
        head.next = null;

        return headOfSubProblem;
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
