class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String check = strs[0];
        if(strs.length == 0){
            return "";
        }
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(check) != 0){
                check = check.substring(0, check.length()-1);
            }
        }
        return check;
    }
}