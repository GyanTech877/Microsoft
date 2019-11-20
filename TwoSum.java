/*
Two Sum
Given an array of integers, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
Please note that your returned answers (both index1 and index2) are zero-based.
*/

public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        if(numbers ==null || numbers.length <2) return new int[]{-1,-1};
        map.put(numbers[0],0);
        for(int i=1;i<numbers.length;i++){
            if(map.containsKey(target - numbers[i])) return new int[]{map.get(target-numbers[i]),i};
            map.put(numbers[i],i);
        }
        return new int[]{-1,-1};
    }
}
