package com.ivanboyukliev.hashtable.arrayimpl;

import com.ivanboyukliev.lists.arraylist.Employee;

public class ChainedHashTableMain {
    public static void main(String[] args) {
        ChainedHashTable hashTable = new ChainedHashTable();
        hashTable.put("Jones",new Employee("Jane","Jones",55));
        hashTable.put("Poppins",new Employee("Mary","Poppins",95));
        hashTable.put("Hardy",new Employee("Matt","Hardy",85));
        hashTable.put("Scholes",new Employee("Paul","Scholes",25));
        hashTable.put("Miller",new Employee("Foster","Miller",545));
        hashTable.put("Wilson",new Employee("David","Wilson",455));
        hashTable.put("End",new Employee("Bill","End",54));

        //hashTable.printHashTable();

       // System.out.println("Retrieve key Wilson: " + hashTable.get("Wilson"));

        hashTable.removeEmployee("Poppins");
        hashTable.removeEmployee("End");

        hashTable.printHashTable();
    }
}
