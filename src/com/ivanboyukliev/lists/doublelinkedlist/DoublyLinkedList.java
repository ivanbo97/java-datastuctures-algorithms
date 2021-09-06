package com.ivanboyukliev.lists.doublelinkedlist;

import com.ivanboyukliev.lists.arraylist.Employee;

public class DoublyLinkedList {
    private EmployeeNodeDoubleList head;
    private EmployeeNodeDoubleList tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNodeDoubleList newNode = new EmployeeNodeDoubleList(employee);
        newNode.setNext(head);
        if (head == null) {
            tail = newNode;
        } else {
            head.setPrevious(newNode);
        }
        head = newNode;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNodeDoubleList newNode = new EmployeeNodeDoubleList(employee);
        if (tail == null) {
            tail = newNode;
            head = tail;
            return;
        }
        tail.setNext(newNode);
        newNode.setPrevious(tail);
        tail = newNode;
        size++;
    }

    public EmployeeNodeDoubleList removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNodeDoubleList oldHead = head;

        // Removing the only one element
        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        oldHead.setNext(null);
        return oldHead;
    }

    public EmployeeNodeDoubleList removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNodeDoubleList oldTail = tail;
        if (tail.getPrevious() == null) {
            head = null;
        } else {
            oldTail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        oldTail.setPrevious(null);
        size--;
        return oldTail;
    }

    public void printList() {
        EmployeeNodeDoubleList temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
