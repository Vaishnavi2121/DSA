class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
      HashMap<Integer,String> hash = new HashMap<>();
      for(int i=0;i<names.length;i++){
        hash.put(heights[i],names[i]);
      }
      Arrays.sort(heights);
      int j=0;
      for(int i=names.length-1;i>=0;i--){
        names[j++] = hash.get(heights[i]);
      }
      return names;
    }
}