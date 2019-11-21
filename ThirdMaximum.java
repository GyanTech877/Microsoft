/*
Given a non-empty array of integers, return the third maximum number in this array.
If it does not exist, return the maximum number. The time complexity must be in O(n).
*/


public class Solution {
    /**
     * @param nums: the array
     * @return: the third maximum number in this array
     */
    public int thirdMax(int[] nums) {
        Integer max=nums[0];
        Integer secondMax = null;
        Integer thirdMax = null;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==max || (secondMax!=null && nums[i]==secondMax) || (thirdMax!=null && nums[i]==thirdMax)) continue;
            if(nums[i]>max){
                thirdMax=secondMax;
                secondMax=max;
                max=nums[i];
            }
            else if(secondMax ==null || nums[i]> secondMax){
                thirdMax=secondMax;
                secondMax=nums[i];
            }
            else if(thirdMax ==null || nums[i]> thirdMax){
                thirdMax = nums[i];
            }
        }
        return (thirdMax==null)?max:thirdMax;
    }
}
