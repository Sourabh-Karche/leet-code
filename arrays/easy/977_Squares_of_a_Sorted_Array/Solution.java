//977. Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int currentIdx = nums.length - 1;
        int[] result = new int[nums.length];
        
        while(left <= right) {
            int leftSqr = nums[left] * nums[left];
            int rightSqr = nums[right] * nums[right];
            
            if(leftSqr >= rightSqr) {
                result[currentIdx] = leftSqr;
                left++;
                currentIdx--;
            }
            else {
                result[currentIdx] = rightSqr;
                right--;
                currentIdx--;
            }
        }
        
        return result;
    }
}