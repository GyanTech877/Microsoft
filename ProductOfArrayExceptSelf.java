/*
Product of Array Except Self
Given an array of n integers where n > 1, nums, 
return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
*/

public class Solution {
    /**
     * @param nums: an array of integers
     * @return: the product of all the elements of nums except nums[i].
     */
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length <=1) return nums;
       int[] result =new int[nums.length];
       int leftResultExcludingSelf = 1;
       for(int i=0;i<nums.length;i++){
       result[i]=leftResultExcludingSelf;
       leftResultExcludingSelf*=nums[i];
       }
       int rightResultExcludingSelf =1;
       for(int i=nums.length-1;i>=0;i--){
           result[i]*=rightResultExcludingSelf;
           rightResultExcludingSelf=rightResultExcludingSelf*nums[i];
       }
       return result;
    }
}
