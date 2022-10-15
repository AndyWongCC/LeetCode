class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n < 2)return;
        int r = 1;
        int l = 0;
        while(n > r){
            if(nums[l] != 0){
                l++;
                r++;
            }
            else if(nums[r] == 0){
                r++;
            }
            else{
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
        }
        return;
    }
}