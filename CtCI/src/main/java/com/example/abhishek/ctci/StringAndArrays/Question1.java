package com.example.abhishek.ctci.StringAndArrays;


import java.util.BitSet;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 */
public class Question1 {

    public static void main(String args[]) {
        String unique = "alunikchrs";
        String notUnique = "notsounique";

        System.out.println(unique + " is unique? "+ hasUniqueCharactersOptimized(unique));
        System.out.println(notUnique + " is unique? "+ hasUniqueCharactersOptimized(notUnique));
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

    private static boolean hasUniqueCharactersOptimized(String string){
        int  checker = 0;
        for(int i = 0; i < string.length(); i++){
            int val = string.charAt(i) - 'a';
            if((checker & (1 << val))> 0){
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

}
