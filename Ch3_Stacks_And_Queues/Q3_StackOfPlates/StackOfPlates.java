package Ch3_Stacks_And_Queues.Q3_StackOfPlates;

import java.util.*;

public class StackOfPlates {
    ArrayList<Stack<Integer>> stackList;
    int maxSize;

    int stackSize;
    int stackIndex;

    HashMap<Stack<Integer>, Integer> stackSizes;

    public StackOfPlates(int maxStackSize) {
        maxSize = maxStackSize;
        stackList = new ArrayList<Stack<Integer>>();

        stackList.add(new Stack<Integer>());

        stackSizes = new HashMap<Stack<Integer>, Integer>();
        stackSizes.put(stackList.get(0), 0);
        stackIndex = 0;
        stackSize = 0;

    }

    public boolean isEmpty() {
        return stackList.size() == 1 && stackList.get(0).isEmpty();
    }

    public int peek() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return stackList.get(stackIndex).peek();

    }

    public void push(int value) {
        if (stackSize == maxSize) {
            Stack<Integer> newStack = new Stack<Integer>();
            newStack.push(value);
            stackList.add(newStack);

            stackSizes.put(newStack, 1);
            stackSize = 1;
            stackIndex++;
        } else {
            Stack<Integer> currentStack = stackList.get(stackIndex);
            currentStack.push(value);
            stackSize++;
            stackSizes.put(currentStack, stackSize);
        }
    }

    public int pop() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        int value = stackList.get(stackIndex).pop();

        if (isEmpty()) {
            stackSize = 0;
            stackSizes.clear();
            Stack<Integer> currentStack = stackList.get(0);
            stackSizes.put(currentStack, 0);
        } else if (stackList.get(stackIndex).isEmpty()) {
            int size = stackList.size();
            stackList.remove(size - 1);
            stackIndex--;
            Stack<Integer> currentStack = stackList.get(stackIndex);

            stackSize = stackSizes.get(currentStack) - 1;
            stackSizes.put(currentStack, stackSize);

        } else {
            stackSize--;
            Stack<Integer> currentStack = stackList.get(stackIndex);
            stackSizes.put(currentStack, stackSize);
        }

        return value;
    }

}