class Solution {
    public int lengthOfLongestSubstring(String s) {
      Map<Character , Integer> map1 = new HashMap<>();
      int left =0 , maxLen =0;

      for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            if(map1.containsKey(c) && map1.get(c) >= left){
                left = map1.get(c) + 1;
            }
            map1.put(c,right);
            maxLen = Math.max(maxLen ,right-left + 1);
      }
      return maxLen;
    }
}