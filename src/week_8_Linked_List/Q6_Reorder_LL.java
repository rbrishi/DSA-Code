package week_8_Linked_List;

public class Q6_Reorder_LL {
    public static void main(String[] args) {
        Node head1 = new Node(7);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        Node n4 = new Node(3);
        Node n5 = new Node(9);
        head1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;
        printLL(head1);
        Node ans = reorderLL(head1);
        printLL(ans);
    }

    static Node reorderLL(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node l2 = reverseLL(slow);
        Node l1 = head;
        while (l1 != l2){
            if(l1 == l2){
                l1.next = null;
                break;
            }
            Node l1Next = l1.next;
            Node l2Next = l2.next;
            l1.next = l2;
            l2.next = l1Next;

            l1  = l1Next;
            l2 = l2Next;
        }
        return head;
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
