package com.example.abhishek.ctci.StringAndArrays;


import java.util.BitSet;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 */
public class Question1 {

    public static void main(String args[]) {
        String unique = "alunikchrs";
        String notUnique = "notsounique";

        System.out.println(unique + " is unique? "+ hasUniqueCharacters(unique));
        System.out.println(notUnique + " is unique? "+ hasUniqueCharacters(notUnique));
    }

    private static boolean hasUniqueCharacters(String string) {
        if (string.length() > 256) {
            return false;
        }
        BitSet bitSet = new BitSet(256);
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (bitSet.get(c)) {
                return false;
            } else {
                bitSet.set(c);
            }
        }
        return true;
    }
}
