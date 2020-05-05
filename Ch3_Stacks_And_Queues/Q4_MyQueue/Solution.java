package Ch3_Stacks_And_Queues.Q4_MyQueue;

import Ch3_Stacks_And_Queues.Q4_MyQueue.*;
import java.util.*;

/*
Implement a queue with two stacks
*/
public class Solution {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.enqueue(4);
        System.out.println(q.peek());
        q.enqueue(3);
        System.out.println(q.peek());

        System.out.println(q.dequeue());

        System.out.println(q.peek());

    }
}