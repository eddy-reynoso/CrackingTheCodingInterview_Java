package Ch3_Stacks_And_Queues.Q1_TripleStack;

public class TripleStack {

    int[] stack;
    int p0;
    int p1;
    int p2;

    public TripleStack(int stackLength) {
        stack = new int[3 * stackLength];
        for (int i = 0; i < stack.length; i++) {
            stack[i] = Integer.MIN_VALUE;
        }
        p0 = -3;
        p1 = -2;
        p2 = -1;
    }

    public boolean isEmpty(int stackNumber) {
        if (stackNumber == 0 && p0 < 0) {
            return true;
        } else if (stackNumber == 1 && p1 < 0) {
            return true;
        } else if (stackNumber == 2 && p2 < 0) {
            return true;
        }
        return false;
    }

    public int peek(int stackNumber) {
        if (stackNumber == 0 && p0 >= 0) {
            return stack[p0];
        } else if (stackNumber == 1 && p1 >= 0) {
            return stack[p1];
        } else if (stackNumber == 2 && p2 >= 0) {
            return stack[p2];
        }
        return Integer.MIN_VALUE;
    }

    public int pop(int stackNumber) {
        int result = Integer.MIN_VALUE;
        if (stackNumber == 0 && p0 >= 0) {
            result = stack[p0];
            p0 -= 3;
            return result;
        } else if (stackNumber == 1 && p1 >= 0) {
            result = stack[p1];
            p1 -= 3;
            return result;
        } else if (stackNumber == 2 && p2 >= 0) {
            result = stack[p2];
            p2 -= 3;
            return result;
        }
        return result;
    }

    public void push(int stackNumber, int value) {
        if (stackNumber == 0) {
            pushHelper(p0, value);
        } else if (stackNumber == 1) {
            pushHelper(p1, value);
        } else if (stackNumber == 2) {
            pushHelper(p2, value);
        }
    }

    public void pushHelper(int pointer, int value) {
        if (pointer + 3 >= stack.length) {
            int[] newStack = new int[stack.length * 2];
            for (int i = 0; i < newStack.length; i++) {
                if (i < stack.length) {
                    newStack[i] = stack[i];
                } else {
                    newStack[i] = Integer.MIN_VALUE;
                }
            }
            stack = newStack;
            pointer += 3;
            stack[pointer] = value;
        } else {
            pointer += 3;
            stack[pointer] = value;
        }
        if (pointer == p0 + 3) {
            p0 += 3;
        } else if (pointer == p1 + 3) {
            p1 += 3;
        } else {
            p2 += 3;
        }

    }

    public void printStacks() {
        System.out.println("Stack 0:");
        for (int i = 0; i <= p0; i += 3) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
        System.out.println("Stack 1:");

        for (int i = 1; i <= p1; i += 3) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
        System.out.println("Stack 2:");
        for (int i = 2; i <= p2; i += 3) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();

    }

}