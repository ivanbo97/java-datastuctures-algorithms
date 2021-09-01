package com.ivanboyukliev.sortalgorithms.queue;

import com.ivanboyukliev.sortalgorithms.lists.arraylist.Employee;

public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.add(new Employee("Jane", "Jones", 55));
        arrayQueue.add(new Employee("Mary", "Poppins", 95));

        arrayQueue.remove();

        arrayQueue.add(new Employee("Matt", "Hardy", 85));
        arrayQueue.remove();
        arrayQueue.add(new Employee("Paul", "Scholes", 25));
        arrayQueue.remove();
        arrayQueue.add(new Employee("Foster", "Miller", 545));
        arrayQueue.remove();
        arrayQueue.add(new Employee("David", "Wilson", 455));
        arrayQueue.add(new Employee("Bill", "End", 54));

        arrayQueue.printQueue();
    }
}
