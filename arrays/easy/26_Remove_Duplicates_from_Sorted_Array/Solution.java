// 26. Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        
        for(int i: nums) {
            if(i > nums[idx]) {
                nums[++idx] = i;
            }
        }
        
        return ++idx;
    }
}