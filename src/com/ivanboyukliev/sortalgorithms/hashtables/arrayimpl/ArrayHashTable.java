package com.ivanboyukliev.sortalgorithms.hashtables.arrayimpl;

import com.ivanboyukliev.sortalgorithms.lists.arraylist.Employee;

public class ArrayHashTable {
    private Employee[] hashtable;
    private static final int HASHTABLE_CAPACITY = 10;

    public ArrayHashTable() {
        hashtable = new Employee[HASHTABLE_CAPACITY];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void put(String key, Employee value) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] == null) {
            hashtable[hashedKey] = value;
            return;
        }
        System.out.println("There is already an employee at position: " + hashedKey);
    }

    public Employee get(String key) {
        return hashtable[hashKey(key)];
    }

    public void printHashTable(){
        for(Employee employee : hashtable){
            System.out.println(employee);
        }
    }
}
