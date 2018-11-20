package com.example.abhishek.ctci.StringAndArrays;

/**
 * There are three types of edits that can be performed on a string: insert a character, remove a character, or replace a character.
 * Given two strings, write a function if they are one edit (or zero edits) away.
 */
public class Question5 {

    public static void main(String[] args){
        System.out.println(oneEditAway("PALE", "ALE"));
        System.out.println(oneEditAway("PALE", "BALE"));
        System.out.println(oneEditAway("PALE", "ALP"));
    }

    private static  boolean oneEditAway(String string1, String string2){
        if(string1.length() == string2.length()){
            return onEditReplace(string1, string2);
        }else if(string1.length() == string2.length() -1){
            return oneEditInsert(string1, string2);
        }else if(string2.length() == string1.length() -1){
            return oneEditInsert(string2, string1);
        }
        return false;
    }

    private static  boolean onEditReplace(String string1, String string2){
        boolean diffFound = false;
        for(int i = 0; i < string1.length(); i++){
            if(string1.charAt(i) != string2.charAt(i)){
                if(diffFound){
                    return false;
                }
                diffFound = true;
            }
        }
        return true;
    }

    private static boolean oneEditInsert(String string1, String string2){
        int index1 = 0;
        int index2 = 0;
        while (index1 < string1.length() && index2 < string2.length()){
            if(string1.charAt(index1) != string2.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            }else {
                index1++;
                index2++;
            }
        }
        return true;

    }
}
