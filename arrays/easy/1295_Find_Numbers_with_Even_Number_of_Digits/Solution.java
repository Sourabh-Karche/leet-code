//1295. Find Numbers with Even Number of Digits
class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int digitCount = 0;
            
            while(num > 0) {
                num = num / 10;
                digitCount++;
            }
            
            if(digitCount%2 == 0)
                result++;
        }
        
        return result;
    }
}