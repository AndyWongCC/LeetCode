class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        int right = 1;

        for(int i = 1; i < nums.length; i++){
            res[i] = nums[i-1] * res[i-1];
        }
        for(int j = nums.length-1; 0 <= j; j--){
            res[j] = right * res[j];
            right = right * nums[j];
        }
        return res;
    }
}