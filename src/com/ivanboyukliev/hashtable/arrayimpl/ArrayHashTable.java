package com.ivanboyukliev.hashtable.arrayimpl;

import com.ivanboyukliev.lists.arraylist.Employee;

public class ArrayHashTable {
    private StoredEmployee[] hashTable;
    private static final int HASHTABLE_CAPACITY = 10;

    public ArrayHashTable() {
        hashTable = new StoredEmployee[HASHTABLE_CAPACITY];
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    public void put(String key, Employee value) {
        int hashedKey = hashKey(key);
        if (isPositionOccupied(hashedKey)) {
            // Linear Probing
            int stopIdx = hashedKey;
            if (hashedKey == hashTable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (isPositionOccupied(hashedKey) && hashedKey != stopIdx) {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }
        if (hashTable[hashedKey] == null) {
            hashTable[hashedKey] = new StoredEmployee(key, value);
            return;
        }
        System.out.println("There is already an employee at position: " + hashedKey);
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        return hashTable[hashedKey].employee;
    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        Employee employee = hashTable[hashedKey].employee;
        hashTable[hashedKey] = null;
        // Rehashing
        StoredEmployee[] oldHashtable = hashTable;
        hashTable = new StoredEmployee[hashTable.length];
        for (int i = 0; i < oldHashtable.length; i++) {
            if (oldHashtable[i] != null) {
                put(oldHashtable[i].key, oldHashtable[i].employee);
            }
        }
        return employee;
    }

    private int findKey(String rawKey) {
        int hashedKey = hashKey(rawKey);
        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(rawKey)) {
            return hashedKey;
        }

        int stopIdx = hashedKey;
        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIdx &&
                hashTable[hashedKey] != null
                && !hashTable[hashedKey].equals(rawKey)) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }

        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(rawKey)) {
            return hashedKey;
        }
        return -1;
    }

    public void printHashTable() {
        for (StoredEmployee storedEmployee : hashTable) {
            if (storedEmployee == null) {
                System.out.println("empty");
            } else {
                System.out.println(storedEmployee.employee);
            }
        }
    }

    private boolean isPositionOccupied(int index) {
        return hashTable[index] != null;
    }
}
