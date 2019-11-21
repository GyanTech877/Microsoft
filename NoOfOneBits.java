/*
Write a function that takes an unsigned integer and returns the number of ’1' bits the corresponding binary number has 
(also known as the Hamming weight).
*/

public class Solution {
    /**
     * @param n: an unsigned integer
     * @return: the number of â€™1' bits
     */
    public int hammingWeight(int n) {
       int result = 0;
       while(n!=0){
           result++;
           n=n&n-1;
       }
       return result;
    }
}
