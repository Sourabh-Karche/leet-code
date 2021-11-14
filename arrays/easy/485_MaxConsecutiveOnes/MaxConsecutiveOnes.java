//485. Max Consecutive Ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countConsOnes = 0;
        int maxOnes = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1)
                countConsOnes++;
            else {
                if(maxOnes < countConsOnes) 
                    maxOnes = countConsOnes;
                
                countConsOnes = 0;
            }
        }
        
        if(maxOnes < countConsOnes) 
             maxOnes = countConsOnes;
        
        return maxOnes;
    }
}