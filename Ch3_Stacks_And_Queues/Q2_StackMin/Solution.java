package Ch3_Stacks_And_Queues.Q2_StackMin;

import Ch3_Stacks_And_Queues.Q2_StackMin.MinStack;
import java.util.*;

/*
Design a stack in which, in addition to push and pop, has a function min which returns the minimum element.
*/
public class Solution {
    public static void main(String[] args) {

        MinStack stack = new MinStack();
        // StackWithMin2 stack2 = new StackWithMin2();
        int[] array = { 2, 1, 3, 1 };
        for (int value : array) {
            stack.push(value);
            // stack2.push(value);
            System.out.print(value + ", ");
        }
        System.out.println('\n');
        for (int i = 0; i < array.length; i++) {
            System.out.println("Popped " + stack.pop());
            System.out.println("New min is " + stack.minimum());
        }
    }
}