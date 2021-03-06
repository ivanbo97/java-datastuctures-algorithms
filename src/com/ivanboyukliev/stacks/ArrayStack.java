package com.ivanboyukliev.stacks;

import com.ivanboyukliev.lists.arraylist.Employee;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        this.stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == stack.length) {
            // Should resize the backing array
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = employee;
    }

    public Employee pop() {
        if (top == 0) {
            throw new EmptyStackException();
        }
        return stack[--top];
    }

    public Employee peek() {
        if (top == 0) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
