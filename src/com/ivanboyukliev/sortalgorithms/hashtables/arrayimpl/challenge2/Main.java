package com.ivanboyukliev.sortalgorithms.hashtables.arrayimpl.challenge2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.BiConsumer;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        Map<Integer,Employee> uniqueEmployees = new HashMap<>();

        employees.forEach(employee -> uniqueEmployees.put(employee.getId(),employee));
        //employees.forEach(e -> System.out.println(e));
        employees.clear();
        uniqueEmployees.forEach(new BiConsumer<Integer, Employee>() {
            @Override
            public void accept(Integer integer, Employee employee) {
                employees.add(employee);
            }
        });

        employees.forEach(employee -> System.out.println(employee));

        

//        int[] nums = new int[10];
//        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
//        for (int i = 0; i < numsToAdd.length; i++) {
//            nums[hash(numsToAdd[i])] = numsToAdd[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
