class Solution {
    public int pivotIndex(int[] nums) {
        int index = -1;
        int left = 0;
        int right = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                left += nums[j];
            }
            for (int k = i +1; k<nums.length; k++){
                right += nums[k];
            }
            if(right == left){
                index = i;
                break;
            }
            else{
                right = 0;
                left = 0;
            }
        }
        return index;
    }
}