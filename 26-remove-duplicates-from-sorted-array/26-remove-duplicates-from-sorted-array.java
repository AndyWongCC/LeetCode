class Solution {
    public int removeDuplicates(int[] nums) {
        int insertIndex = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[insertIndex] != nums[i]) {
                nums[++insertIndex] = nums[i];     
            }
        }
        return insertIndex+1;
    }
}