package week_8_Linked_List;

public class Q5_Add_Two_Number {
    public static void main(String[] args) {
        Node head1 = new Node(7);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        Node n4 = new Node(3);
        head1.next=n2;n2.next=n3;n3.next=n4;

        Node head2 = new Node(5);
        Node l2 = new Node(6);
        Node l3 = new Node(4);
        head2.next=l2;l2.next=l3;

        printLL(head1);
        printLL(head2);
        Node ans = addTwoNumber(head1,head2);
        printLL(ans);
    }

    static Node addTwoNumber(Node head1, Node head2){
        if(head1 == null) return head2;
        if(head2 == null) return head1;

        Node newHead1 = reverseLL(head1);
        Node newHead2 = reverseLL(head2);

        Node ans = null;
        int carry = 0;
        Node temp = null;

        while (newHead1 != null || newHead2 != null || carry != 0){
            int sum = carry;
            if(newHead1 != null){
                sum += newHead1.value;
                newHead1 = newHead1.next;
            }
            if(newHead2 != null){
                sum += newHead2.value;
                newHead2 = newHead2.next;
            }

            int digit = sum % 10;
            carry = sum/10;
            Node newNode = new Node(digit);

            if(ans == null){
                ans = temp = newNode;
            }else{
                temp.next = newNode;
                temp = newNode;
            }
        }
        return reverseLL(ans);
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
    static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
