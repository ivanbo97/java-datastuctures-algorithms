package com.ivanboyukliev.sortalgorithms.stacks.stackschallenge;

import com.ivanboyukliev.sortalgorithms.stacks.stackschallenge.util.StringChecks;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        //String checkedStr = string.toLowerCase();
        Deque<Character> stack = new ArrayDeque<>();
        String clearString = StringChecks.getClearString(string);

        for (int i = 0; i < clearString.length(); i++) {
            stack.push(clearString.charAt(i));
        }

        StringBuilder reverseString = new StringBuilder();

        while (stack.size() > 0) {
            reverseString.append(stack.pop());
        }
        return clearString.equalsIgnoreCase(reverseString.toString());
    }


}
