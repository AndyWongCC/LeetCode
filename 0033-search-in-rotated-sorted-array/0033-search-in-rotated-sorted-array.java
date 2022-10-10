class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while(left+1 < right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            //67812
            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target <= nums[mid]){
                    right = mid;
                }
                else{
                    left = mid;
                }
            }
            // 78012
            else{
                if(nums[mid] <= target && target <= nums[right]){
                    left = mid;
                }
                else{
                    right = mid;
                }
            }
        }
        if(nums[left] == target){
            return left;
        }
        else if(nums[right] == target){
            return right;
        }
        else{
            return -1;
        }
    }
}