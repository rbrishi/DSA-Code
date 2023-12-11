//package week_8_Linked_List;
//
//public class LearnLinkedList {
//    public static void main(String[] args) {
//        Node<Integer> head = new Node<>(12);
//        Node<Integer> n1 = new Node<>(13);
//        Node<Integer> n2 = new Node<>(14);
//        Node<Integer> n3 = new Node<>(15);
//        head.next = n1;
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = null;
//
//        traverseLinkedList(head);
//        //head = insertInLinkedList(3,10,head);
//        head = deleteFromLinkedList(2,head);
//        traverseLinkedList(head);
//    }
//
//    static void traverseLinkedList(Node<Integer> head){
//        Node<Integer> temp = head;
//        while (temp != null){
//            System.out.print(temp.value+ " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    static Node<Integer> insertInLinkedList(int position, int data, Node<Integer> head){
//        Node<Integer> newNode = new Node<>(data);
//
//        if(position == 0) {
//            newNode.next = head;
//            return newNode;
//        }
//
//        Node<Integer> temp = head;
//
//        for(int i = 0; i < position-1; i++){
//            temp = temp.next;
//        }
//        newNode.next = temp.next;
//        temp.next = newNode;
//
//        return head;
//    }
//
//    static Node<Integer> deleteFromLinkedList(int pos, Node<Integer> head){
//        if(head == null) return null;
//        if(pos == 0) return head.next;
//
//        Node<Integer> temp = head;
//        for(int i = 0; i < pos-1; i++){
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//        return head;
//    }
//}
//
////class Node{
////    int value;
////    Node next;
////
////    public Node(int data){
////        this.value = data;
////        this.next = null;
////    }
////}
//
////Make this generic
//class Node<E>{
//    E value;
//    Node<E> next;
//
//    public Node(E data){
//        this.value = data;
//        this.next = null;
//    }
//}
