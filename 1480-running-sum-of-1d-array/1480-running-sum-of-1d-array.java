class Solution {
    public int[] runningSum(int[] nums) {
        int result[]= new int [nums.length];
            for(int i = nums.length-1; 0 <= i; i--){
                for(int j = 0; j<=i; j++){
                    result[i]+=nums[j];
                }
            }
        return result;
    }
}