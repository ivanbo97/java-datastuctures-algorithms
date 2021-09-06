package com.ivanboyukliev.hashtable.arrayimpl;

import com.ivanboyukliev.lists.arraylist.Employee;

public class StoredEmployee {
    // raw key
    public String key;
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}
