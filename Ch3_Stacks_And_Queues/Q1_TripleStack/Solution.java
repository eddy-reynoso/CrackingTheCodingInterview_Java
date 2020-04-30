package Ch3_Stacks_And_Queues.Q1_TripleStack;

import Ch3_Stacks_And_Queues.Q1_TripleStack.TripleStack;
import java.util.*;

/*
Use an array to implement 3 stacks.
*/
public class Solution {
    public static void main(String[] args) {
        TripleStack stacks = new TripleStack(1);

        stacks.printStacks();
        stacks.push(0, 10);
        stacks.printStacks();
        stacks.push(1, 20);
        stacks.printStacks();
        stacks.push(2, 30);
        stacks.printStacks();

        stacks.push(1, 21);
        stacks.printStacks();
        stacks.push(0, 11);
        stacks.printStacks();
        stacks.push(0, 12);
        stacks.printStacks();

        stacks.pop(0);
        stacks.printStacks();

        stacks.push(2, 31);
        stacks.printStacks();

        stacks.push(0, 13);
        stacks.printStacks();
        stacks.push(1, 22);
        stacks.printStacks();

        stacks.push(2, 31);
        stacks.printStacks();
        stacks.push(2, 32);
        stacks.printStacks();

    }

}