package week_8_Linked_List;

public class Q4_Check_Palindrome {
    public static void main(String[] args) {
        Node head = new Node(1);
        //Node n2 = new Node(2);
//        Node n3 = new Node(3);
//        Node n4 = new Node(2);
//        Node n5 = new Node(1);

        //head.next=n2;
        //n2.next=null;
        //n3.next=n4; n4.next=n5;
        printLL(head);

        System.out.println(isLLPalindrome(head));
    }

    static boolean isLLPalindrome(Node head){
        if(head == null || head.next == null) return true;
        Node middle = findMiddleNode(head);
        Node t2 = reverseLL(middle);
        Node t1 = head;

        while (t2 != null){
            if(t1.value != t2.value) return false;

            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
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

    static Node findMiddleNode(Node head){
        if(head == null) return null;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
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
