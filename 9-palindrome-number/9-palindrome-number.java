class Solution {
    public boolean isPalindrome(int x) {
        char[] check = String.valueOf(x).toCharArray();
        int start = 0;
        int end = check.length-1;
        while(start < end){
            if(check[start] != check[end]){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}