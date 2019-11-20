/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/

public class Solution {
    /**
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        if(s==null || s.length()==0) return true; 
        Map<Character,Character> map =new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack = new Stack<>();
        char[] input = s.toCharArray();
        for(char c:input){
            if(c=='(' || c=='{' || c== '[') stack.push(map.get(c));
            else{
                if(!stack.isEmpty() && c != stack.peek()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
