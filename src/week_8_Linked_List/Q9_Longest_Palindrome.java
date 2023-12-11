package week_8_Linked_List;

public class Q9_Longest_Palindrome {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(3);
        Node n5 = new Node(2);
        Node n6 = new Node(4);
        head.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=n6;
        printLL(head);

        System.out.println(longestPalindrome(head));
    }

    static int longestPalindrome(Node head){
        if(head == null) return 0;
        if(head.next == null) return 1;

        Node cur = head;
        Node prev = null;
        int ans = 0;

        while (cur != null){
            Node next = cur.next;
            cur.next = prev;
            int commonIfCurIsExactCenter = countCommon(prev,next);
            int lengthFromExactCenter = 2 * commonIfCurIsExactCenter + 1;
            int commonIfCurIsNotExactCenter = countCommon(cur,next);
            int lengthFromNotExactCenter = 2 * commonIfCurIsNotExactCenter;

            int largeOfTheseTwoLengths = Math.max(lengthFromExactCenter, lengthFromNotExactCenter);

            ans = Math.max(ans, largeOfTheseTwoLengths);
            prev = cur;
            cur = next;
        }
        return ans;
    }
    static int countCommon(Node a, Node b){
        int count = 0;
        while (a != null && b != null){
            if(a.value == b.value){
                count++;
                a = a.next;
                b = b.next;
            }else break;
        }return count;
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
