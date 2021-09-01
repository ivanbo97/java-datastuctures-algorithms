package com.ivanboyukliev.sortalgorithms.lists.singlelinkedlist;

import com.ivanboyukliev.sortalgorithms.lists.arraylist.Employee;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 55);
        Employee johnDoes = new Employee("John", "Doe", 65);
        Employee marySmith = new Employee("Mary", "Smith", 88);
        Employee jackWilson = new Employee("Jack", "Wilson", 88);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();

        System.out.println(employeeLinkedList.isEmpty());
        employeeLinkedList.addToFront(janeJones);
        employeeLinkedList.addToFront(johnDoes);
        employeeLinkedList.addToFront(marySmith);
        employeeLinkedList.addToFront(jackWilson);
        System.out.println(employeeLinkedList.isEmpty());
        employeeLinkedList.printList();
        employeeLinkedList.removeFromFront();
        System.out.println(employeeLinkedList.getSize());
    }
}
