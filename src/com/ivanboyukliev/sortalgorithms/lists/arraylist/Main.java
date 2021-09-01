package com.ivanboyukliev.sortalgorithms.lists.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 12344));
        employeeList.add(new Employee("John", "Doe", 4412344));
        employeeList.add(new Employee("Mary", "Smith", 5465));
        employeeList.add(new Employee("Mike", "Wilson", 2344));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(1));

        employeeList.set(1,new Employee("John","Adams",5451));
        System.out.println("================================================");
        employeeList.forEach(employee -> System.out.println(employee));
        employeeList.add(0,new Employee("Maria","Petrova",6060));
        System.out.println("================================================");
        employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee : employeeArray){
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary","Smith",5465)));

        System.out.println(employeeList.indexOf(new Employee("John","Adams",5451)));

        employeeList.remove(2);
    }
}
