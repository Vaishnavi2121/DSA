class Solution {
    public String addSpaces(String s, int[] spaces) {
       int length = s.length() + spaces.length;
       StringBuilder result = new StringBuilder(length);
       int pointer=0;
       for(int i=0;i<s.length();i++){
        if(pointer<spaces.length && i == spaces[pointer]){
            result.append(" ");
            pointer++;
        }
        result.append(s.charAt(i));
       } 
       return result.toString();
    }
}