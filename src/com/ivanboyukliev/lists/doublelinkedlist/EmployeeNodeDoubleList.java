package com.ivanboyukliev.lists.doublelinkedlist;

import com.ivanboyukliev.lists.arraylist.Employee;

public class EmployeeNodeDoubleList {
    private Employee employee;
    private EmployeeNodeDoubleList next;
    private EmployeeNodeDoubleList previous;

    public EmployeeNodeDoubleList(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNodeDoubleList getNext() {
        return next;
    }

    public void setNext(EmployeeNodeDoubleList next) {
        this.next = next;
    }

    public String toString() {
        return employee.toString();
    }

    public EmployeeNodeDoubleList getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNodeDoubleList previous) {
        this.previous = previous;
    }
}
