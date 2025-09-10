package leet_code_problems_in_java;

import java.util.Stack;

public class Palindrome_Number {
    public static void main(String[] args){
        
    }
    static public boolean isPalindrome(int x) {
        String s = String.valueOf(x); 

        for(int i = 0, k = s.length()-1; i < k; i++, k--){
            if(s.charAt(i) != s.charAt(k)){
                return false; 
            }
        } 
        return true; 
    }

}

