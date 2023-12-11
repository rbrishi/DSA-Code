package week_8_Linked_List;

public class LearnDoublyLinkedList {
    public static void main(String[] args) {
        Node1<Integer> head = new Node1<>(1);
        Node1<Integer> n1 = new Node1<>(2);
        Node1<Integer> n2 = new Node1<>(3);

        head.next = n1;

        n1.prev = head;
        n1.next = n2;

        n2.prev = n1;
        n2.next = null;

        traverseDoublyLinkedList(n2);
    }
    static void traverseDoublyLinkedList(Node1<Integer> head){
        Node1<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}
class Node1<E>{
    E data;
    Node1<E> next;
    Node1<E> prev;

    Node1(E data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}
