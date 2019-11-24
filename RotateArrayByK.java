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

public class Solution2 {
    /**
     * @param nums: an array
     * @param k: an integer
     * @return: rotate the array to the right by k steps
     */
    public int[] rotate(int[] nums, int k) {
        if(nums==null || nums.length==0||(k%nums.length)==0) return nums;
        int n = nums.length;
        k=k%n;
        while(k-->0){
        int last = nums[n-1];
        for(int i=n-1;i>0;i--){
            nums[i]=nums[i-1];
         }
        nums[0] = last;
        }
        return nums;
    }
}

public class Solution3 {
    /**
     * @param nums: an array
     * @param k: an integer
     * @return: rotate the array to the right by k steps
     */
    public int[] rotate(int[] nums, int k) {
        if(nums==null || nums.length==0||(k%nums.length)==0) return nums;
        int n = nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
        return nums;
    }
    
    private void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end] =temp;
            start++;
            end--;
        }
    }
}

public class Solution4 {
    /**
     * @param nums: an array
     * @param k: an integer
     * @return: rotate the array to the right by k steps
     */
    public int[] rotate(int[] nums, int k) {
        if(nums==null || nums.length==0||(k%nums.length)==0) return nums;
        int n = nums.length;
        k=k%n;
        int count = 0;
        for(int i=0;i<n && count<n;i++){
            int start=i;
            int current =i;
            int prevValue = nums[i];
            while(true){
                int next = (current + k)%n;
                int currentValue = nums[next];
                nums[next] = prevValue;
                prevValue = currentValue;
                current = next;
                count++;
                if(current==start || count == n) break;
            }
        }
        return nums;
    }
}
