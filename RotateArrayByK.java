/*
Given an array, rotate the array to the right by k steps, where k is non-negative.
*/


public class Solution1 {
    /**
     * @param nums: an array
     * @param k: an integer
     * @return: rotate the array to the right by k steps
     */
    public int[] rotate(int[] nums, int k) {
        if(nums==null || nums.length==0||(k%nums.length)==0) return nums;
        int[] copy = new int[nums.length];
        int n = nums.length;
        k=k%n;
        for(int i=0;i<n;i++){
            copy[i]=nums[(i+n-k)%n];
        }
        return copy;
    }
}
