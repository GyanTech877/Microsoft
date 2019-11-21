/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
*/

public class Solution {
    /**
     * @param num: a non-negative integer
     * @return: one digit
     */
    public int addDigits(int num) {
        return (num-1)%9 + 1;
    }
}
