class Solution {
    public static int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int answer = nums[0];
        for(int i = 1; i < nums.length; i++){
            int temp = min;
            int current = nums[i];
            if(nums[i] == 0){
                max = 1;
                min = 1;
            }
            min = Math.min(current, Math.min(current * temp, current * max));
            max = Math.max(current, Math.max(current * temp, current * max));
            answer = Math.max(max, answer);
        }
        return answer;
    }
}