class Solution {
    public int firstUniqChar(String s) {
        HashSet<Character>map = new HashSet<>();
        HashSet<Character>check = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            if(!map.contains(s.charAt(i))){
                map.add(s.charAt(i));
            }
            else{
                check.add(s.charAt(i));
            }
        }
        for(int j = 0; j < s.length(); j++){
            if(!check.contains(s.charAt(j))){
                return j;
            }
        }
        return -1;
    }
}