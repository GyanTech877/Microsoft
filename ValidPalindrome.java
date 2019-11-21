/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
*/

public class Solution {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // write your code here
        int start=0;
        int end=s.length()-1;
        s=s.toLowerCase();
        while(start<end){
            while(start<end && !Character.isLetterOrDigit(s.charAt(start))) start++;
            while(start<end && !Character.isLetterOrDigit(s.charAt(end))) end--;
            if(start<end && s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
