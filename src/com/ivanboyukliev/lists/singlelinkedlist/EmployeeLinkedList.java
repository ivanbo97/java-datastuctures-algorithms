package com.ivanboyukliev.lists.singlelinkedlist;

import com.ivanboyukliev.lists.arraylist.Employee;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode oldHead = head;
        head = head.getNext();
        size--;
        oldHead.setNext(null);
        return oldHead;
    }

    public void printList() {
        EmployeeNode temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }
}
