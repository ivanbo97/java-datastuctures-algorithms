package com.ivanboyukliev.stacks;

import com.ivanboyukliev.lists.arraylist.Employee;

import java.util.LinkedList;

public class LinkedStack {
    private LinkedList<Employee> stack;

    public  LinkedStack() {
        stack = new LinkedList<>();
    }

    public void push(Employee employee){
        stack.push(employee);
    }

    public Employee pop(){
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        for (Employee employee : stack){
            System.out.println(employee);
        }
    }
}
