package Ch3_Stacks_And_Queues.Q2_StackMin;

import java.util.*;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> min;
    int minimum;

    public MinStack() {
        stack = new Stack<Integer>();
        min = new Stack<Integer>();
        minimum = Integer.MAX_VALUE;
    }

    public void push(int value) {
        if (value <= minimum) {
            min.push(value);
            minimum = value;
        }
        stack.push(value);
    }

    public int pop() {
        int value = stack.pop();
        if (value == minimum) {
            min.pop();
            minimum = !min.isEmpty() ? min.peek() : Integer.MAX_VALUE;
        }
        return value;
    }

    public int minimum() {
        return minimum;
    }
}