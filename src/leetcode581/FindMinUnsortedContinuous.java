package leetcode581;

public class FindMinUnsortedContinuous {
    public int findUnsortedSubarray(int[] nums) {
        int start = -1;
        int end = -2;
        
        int max = Integer.MIN_VALUE;
    
        // Get last element that is smaller than last seen max
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            
            if(nums[i] < max){
                end = i;
            }
        }
        
        int min = Integer.MAX_VALUE;
        
        // Get last element that is bigger than last seen min
        for(int j = nums.length - 1; j >= 0; j--){
            min = Math.min(min, nums[j]);
            
            if(nums[j] > min){
                start = j;
            }
        }
        
        
        return end - start + 1;
    }
}
