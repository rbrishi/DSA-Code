package week_9_Stack;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
//        StackUsingArray stack = new StackUsingArray(5);
//        StackUsingLinkedList stack = new StackUsingLinkedList();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        while (!stack.isEmpty()){
//            System.out.print(stack.pop()+" ");
//        }
//        System.out.println();

        //stack.push(6);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//
//        System.out.println(stack.isEmpty());
//
//        System.out.println(stack.peek());
        //stack.printStack();

//        while (!stack.isEmpty()){
//            System.out.print(stack.peek()+" ");
//            stack.pop();
//        }

        ArrayDeque stackAD = new ArrayDeque();
        stackAD.push(1);
        stackAD.push(2);

        System.out.println(stackAD.pop());
    }
}
