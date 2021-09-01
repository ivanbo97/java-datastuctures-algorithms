package com.ivanboyukliev.sortalgorithms.stacks;

import com.ivanboyukliev.sortalgorithms.lists.arraylist.Employee;

public class LinkedStackMain {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(new Employee("Jane","Jones",55));
        stack.push(new Employee("Mary","Poppins",95));
        stack.push(new Employee("Matt","Hardy",85));
        stack.push(new Employee("Paul","Scholes",25));
        stack.push(new Employee("Foster","Miller",545));
        stack.push(new Employee("David","Wilson",455));
        stack.push(new Employee("Bill","End",54));

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.printStack();
    }
}
