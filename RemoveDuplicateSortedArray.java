/*
Given a sorted array, 'remove' the duplicates in place such that each element appear only once and return the 'new' length.
Do not allocate extra space for another array, you must do this in place with constant memory.
*/

public class Solution {
    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        int start = 0;
        int current = start+1;
        while(current< nums.length){
         if(nums[start]==nums[current])current++;
         else{
         if(current<nums.length){
             start++;
             nums[start]=nums[current];
             current++;
         }
         }
        }
        return start+1;
        
        // write your code here
    }
}
