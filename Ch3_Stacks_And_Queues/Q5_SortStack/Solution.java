package Ch3_Stacks_And_Queues.Q5_SortStack;

import java.util.*;

/*
Write a program to sort a stack such that the smallest items are on top. 
You can use an additional temporary stack, but you may not copy the elements 
into any other data structure (such as an array). The stack supports the following
operations: push, pop, peek, isEmpty.
*/
public class Solution {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(3);
        stack.push(4);

        stack.push(5);
        stack.push(6);
        stack.push(7);

        stack.push(9);
        stack.push(9);
        printStack(stack);
        Stack<Integer> sortedStack = sortStack(stack);
        printStack(sortedStack);

    }

    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<Integer>();
        int sorted = 0;
        int size = stack.size();

        while (!stack.isEmpty()) {
            int min = stackMin(stack);

            sorted++;
            temp.push(min);

            while (!stack.isEmpty()) {
                int curr = stack.peek();
                if (curr == min) {
                    stack.pop();
                    min = Integer.MIN_VALUE;
                } else {
                    temp.push(stack.pop());
                }
            }

            for (int i = 0; i < size - sorted; i++) {
                stack.push(temp.pop());
            }
        }

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        return stack;
    }

    public static int stackMin(Stack<Integer> stack) {
        int min = Integer.MAX_VALUE;
        Object[] stackArray = stack.toArray();
        for (int i = 0; i < stackArray.length; i++) {
            min = Math.min(min, Integer.parseInt(stackArray[i].toString()));
        }
        return min;
    }

    public static void printStack(Stack<Integer> stack) {
        System.out.println(Arrays.toString(stack.toArray()) + " Top");
    }
}