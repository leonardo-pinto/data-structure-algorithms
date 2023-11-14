package stack;

public class Stack {
    int[] stack = new int[5];
    int top = 0;

    public void push(int value) {
        stack[top] = value;
        top++;
    }

    public int pop() {
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek() {
        return stack[top-1];
    }


}
