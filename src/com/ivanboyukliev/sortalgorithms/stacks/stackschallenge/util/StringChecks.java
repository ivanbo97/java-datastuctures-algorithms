package com.ivanboyukliev.sortalgorithms.stacks.stackschallenge.util;

public class StringChecks {
    private static char[] ignoredSymbols = {' ', '?', ',', '\''};

    public static String getClearString(String string) {
        StringBuilder clearString = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char currentSymbol = string.charAt(i);
            if (isSymbolIgnored(currentSymbol)) {
                continue;
            }
            clearString.append(currentSymbol);
        }
        return clearString.toString();
    }

    private static boolean isSymbolIgnored(char checkedSymbol) {
        for (int i = 0; i < ignoredSymbols.length; i++) {
            if (checkedSymbol == ignoredSymbols[i]) {
                return true;
            }
        }
        return false;
    }
}
