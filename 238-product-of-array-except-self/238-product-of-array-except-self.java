class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        int[] res = new int[nums.length];
        int right = 1;

        for(int i = 1; i < nums.length; i++){
            left[i] = nums[i-1] * left[i-1];
        }
        for(int j = nums.length-1; 0 <= j; j--){
            res[j] = right * left[j];
            right = right * nums[j];
        }
        return res;
    }
}