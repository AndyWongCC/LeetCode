class Solution {
    public static boolean canJump(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > max){
                return false;
            }
            else{
                max = Math.max(max, nums[i] + i);
            }
        }
        return max >= nums.length-1;
    }
}