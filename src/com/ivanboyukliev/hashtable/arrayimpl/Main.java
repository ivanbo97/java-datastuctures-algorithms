package com.ivanboyukliev.hashtable.arrayimpl;

import com.ivanboyukliev.lists.arraylist.Employee;

public class Main {
    public static void main(String[] args) {
        ArrayHashTable hashTable = new ArrayHashTable();
        hashTable.put("Jones",new Employee("Jane","Jones",55));
        hashTable.put("Poppins",new Employee("Mary","Poppins",95));
        hashTable.put("Hardy",new Employee("Matt","Hardy",85));
        hashTable.put("Scholes",new Employee("Paul","Scholes",25));
        hashTable.put("Miller",new Employee("Foster","Miller",545));
        hashTable.put("Wilson",new Employee("David","Wilson",455));
        hashTable.put("End",new Employee("Bill","End",54));

        hashTable.remove("End");
        hashTable.remove("Wilson");
        hashTable.printHashTable();

        //System.out.println(hashTable.get("Wilson"));
    }
}
