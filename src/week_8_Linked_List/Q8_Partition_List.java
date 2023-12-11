package week_8_Linked_List;

public class Q8_Partition_List {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(3);
        Node n4 = new Node(2);
        Node n5 = new Node(5);
        Node n6 = new Node(2);
        head.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=n6;
        printLL(head);

        int B = 4;
        Node ans = partitionList(head,B);
        printLL(ans);
    }

    static Node partitionList(Node head, int B){
        if(head == null || head.next == null) return head;

        Node cur = head;

        Node sHead = new Node(-1);
        Node sTail = sHead;

        Node lHead = new Node(-1);
        Node lTail = lHead;

        while (cur != null){
            if(cur.value < B){
                sTail.next = cur;
                sTail = sTail.next;
                cur = cur.next;
            }else{
                lTail.next = cur;
                lTail = lTail.next;
                cur = cur.next;
            }
        }
        //connect LL
        lTail.next = null;  // to avoid circular LL
        sTail.next = lHead.next;

        return sHead.next;
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









