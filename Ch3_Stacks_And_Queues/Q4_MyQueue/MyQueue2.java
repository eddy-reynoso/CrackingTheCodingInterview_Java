package Ch3_Stacks_And_Queues.Q4_MyQueue;

import java.util.*;

public class MyQueue2 {
    Stack<Integer> masterStack;
    Stack<Integer> helperStack;

    public MyQueue2() {
        masterStack = new Stack<Integer>();

        helperStack = new Stack<Integer>();
    }

    int peek() {
        int value = Integer.MIN_VALUE;

        if (masterStack.isEmpty()) {
            return value;
        }

        while (!masterStack.isEmpty()) {
            value = masterStack.peek();
            helperStack.push(masterStack.pop());
        }
        while (!helperStack.isEmpty()) {
            masterStack.push(helperStack.pop());
        }

        return value;
    }

    void enqueue(int value) {
        masterStack.push(value);
    }

    int dequeue() {
        int value = Integer.MIN_VALUE;

        if (masterStack.isEmpty()) {
            return value;
        }

        while (!masterStack.isEmpty()) {
            value = masterStack.peek();
            helperStack.push(masterStack.pop());
        }
        helperStack.pop();
        while (!helperStack.isEmpty()) {
            masterStack.push(helperStack.pop());
        }

        return value;
    }
}