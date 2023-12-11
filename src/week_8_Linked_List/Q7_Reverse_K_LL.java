package week_8_Linked_List;

public class Q7_Reverse_K_LL {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        head.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=n6;n6.next=n7;
        printLL(head);

        Node ans = reverseKGroups(head,7);
        printLL(ans);
    }

    static Node reverseKGroups(Node head, int k){
        Node dummy = new Node(-1);
        dummy.next = head;
        Node prevTail = dummy;
        Node curHead = head;

        while (curHead != null){
            Node curTail = findTailAfterK(curHead,k);
            if(curTail == null) break;
            Node nextHead = curTail.next;
            reverseKTimes(curHead, k);
            prevTail.next = curTail;
            prevTail = curHead;
            curHead = nextHead;
        }
        prevTail.next = curHead;
        return dummy.next;
    }

    static  Node findTailAfterK(Node head, int k){
        for(int i = 0; i < k-1; i++){
            head = head.next;
            if(head == null) return null;
        }return head;
    }
    static Node reverseKTimes(Node head, int k){
        if(head == null || head.next == null) return head;
        Node cur = head;
        Node prev = null;
        int count = 0;

        while (count < k && cur != null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            count++;
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
