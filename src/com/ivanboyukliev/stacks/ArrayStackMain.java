package com.ivanboyukliev.stacks;

import com.ivanboyukliev.lists.arraylist.Employee;

public class ArrayStackMain {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);

        arrayStack.push(new Employee("Jane","Jones",55));
        arrayStack.push(new Employee("Mary","Poppins",95));
        arrayStack.push(new Employee("Matt","Hardy",85));
        arrayStack.push(new Employee("Paul","Scholes",25));
        arrayStack.push(new Employee("Foster","Miller",545));
        arrayStack.push(new Employee("David","Wilson",455));
        arrayStack.push(new Employee("Bill","End",54));

        arrayStack.printStack();
        System.out.println("===============================");
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println("==============================");
        arrayStack.printStack();
    }
}
