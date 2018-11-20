package com.example.abhishek.ctci.StringAndArrays;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 */
public class Question2 {

    private static boolean isPermutation(String string1, String string2){
        if(string1.length() != string2.length()){
            return false;
        }
        return true;
    }
}
