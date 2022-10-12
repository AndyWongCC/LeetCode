class Solution {
    public int lengthOfLongestSubstring(String s) {
        int aPointer = 0;
        int bPointer = 0;
        int ans = 0;
        HashSet<Character>map = new HashSet();
        
        while(aPointer < s.length()){
            if(!map.contains(s.charAt(aPointer))){
                map.add(s.charAt(aPointer));
                ans = Math.max(ans, map.size());
                aPointer++;
            }
            else{
                map.remove(s.charAt(bPointer));
                bPointer++;
            }
        }
        return ans;
    }   
}