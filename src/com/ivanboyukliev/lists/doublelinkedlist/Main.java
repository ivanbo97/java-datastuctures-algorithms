package com.ivanboyukliev.lists.doublelinkedlist;

import com.ivanboyukliev.lists.arraylist.Employee;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 55);
        Employee johnDoes = new Employee("John", "Doe", 65);
        Employee marySmith = new Employee("Mary", "Smith", 88);
        Employee jackWilson = new Employee("Jack", "Wilson", 88);

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addToFront(janeJones);
        doublyLinkedList.addToFront(johnDoes);
        doublyLinkedList.addToFront(marySmith);
        doublyLinkedList.addToFront(jackWilson);
        doublyLinkedList.printList();

        doublyLinkedList.addToEnd(new Employee("Bill","End",98));
        System.out.println("===================================");
        doublyLinkedList.printList();
        doublyLinkedList.removeFromFront();
        System.out.println("===================================");
        doublyLinkedList.printList();
        doublyLinkedList.removeFromEnd();
        System.out.println("===================================");
        doublyLinkedList.printList();

    }
}
