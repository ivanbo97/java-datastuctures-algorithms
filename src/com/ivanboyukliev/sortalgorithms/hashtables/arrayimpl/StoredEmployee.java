package com.ivanboyukliev.sortalgorithms.hashtables.arrayimpl;

import com.ivanboyukliev.sortalgorithms.lists.arraylist.Employee;

public class StoredEmployee {
    // raw key
    public String key;
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}
