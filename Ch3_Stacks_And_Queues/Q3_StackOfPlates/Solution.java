package Ch3_Stacks_And_Queues.Q3_StackOfPlates;

import Ch3_Stacks_And_Queues.Q3_StackOfPlates.*;
import java.util.*;

/*
Imagine a literal stack of plates. If the stack gets too high, it might topple. 
Therefore in real life, we would likely start a new stack when the previous stack 
exceeds some threshold. Implement a data structure SetOfStacks that mimics this.

SetOfStacks should be composed of several stacks and should create a new stack 
once the previous stack exceeds capacity.
SetOfStacks.push() and SetOfStacks.pop should behave identically to a single stack
(tthat is pop() should return the same values if there were just a single stack).

FOLLOW UP
Implement a function popAt(int index) which performs a pop operation at a specific sub-stack
*/
public class Solution {
    public static void main(String[] args) {
        StackOfPlates stack = new StackOfPlates(1);

        System.out.println(stack.isEmpty());
        System.out.println("Stacklist index: " + stack.stackIndex);

        stack.push(0);
        System.out.println("Stacklist index: " + stack.stackIndex);

        stack.push(1);
        System.out.println("Stacklist index: " + stack.stackIndex);
        stack.push(2);
        System.out.println("Stacklist index: " + stack.stackIndex);

        stack.push(3);
        System.out.println("Stacklist index: " + stack.stackIndex);

        stack.push(4);
        System.out.println("Stacklist index: " + stack.stackIndex);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Stacklist index: " + stack.stackIndex);
        System.out.println(stack.isEmpty());
        System.out.println("Pop: " + stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println("Stacklist index: " + stack.stackIndex);

        System.out.println("Pop: " + stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println("Stacklist index: " + stack.stackIndex);

    }
}