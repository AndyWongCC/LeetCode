class Solution {
    public boolean isIsomorphic (String s, String t) {
            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();
            int n = s.length();
            for (int i = 0; i < n; i++) {
                if (!(map1.containsKey(s.charAt(i)) || map2.containsKey(t.charAt(i)))){
                    map1.put(s.charAt(i), i);
                    map2.put(t.charAt(i), i);
                }
                else if(map1.get(s.charAt(i)) != map2.get(t.charAt(i))){
                    return false;
                }
            }
            return true;
        }
}