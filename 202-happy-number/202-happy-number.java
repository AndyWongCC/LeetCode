class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            int total = 0;
            while(n!=0){
                int digit = n%10;
                total += digit * digit;
                n /= 10;
            }
            if(!set.add(total)){
                return false;
            }
            n = total;
        }
        return true;
    }
}