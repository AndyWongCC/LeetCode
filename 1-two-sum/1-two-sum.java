class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        HashMap<Integer, Integer> passValue = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int ans = target - nums[i];
            if(passValue.containsKey(ans)){
                return new int[] {passValue.get(ans), i};
            }
            passValue.put(nums[i], i);
        }
        return null;
    }
}