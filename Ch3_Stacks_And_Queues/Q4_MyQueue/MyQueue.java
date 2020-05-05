package Ch3_Stacks_And_Queues.Q4_MyQueue;

import java.util.*;

public class MyQueue {
    Stack<Integer> newStack;
    Stack<Integer> oldStack;

    public MyQueue() {
        newStack = new Stack<Integer>();

        oldStack = new Stack<Integer>();
    }

    void shiftStacks() {
        if (oldStack.isEmpty()) {
            while (!newStack.isEmpty()) {
                oldStack.push(newStack.pop());
            }
        }
    }

    int peek() {
        shiftStacks();
        return oldStack.peek();
    }

    void enqueue(int value) {
        newStack.push(value);
    }

    int dequeue() {
        shiftStacks();
        return oldStack.pop();
    }
}