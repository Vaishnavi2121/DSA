class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] answer = new boolean[queries.length];
        int n = nums.length;
        int[] preSum = new int[n];
        int count =0;

        for(int i=1;i<n;i++){
            if(nums[i-1]%2 != nums[i]%2){
                    count++;
              }
              preSum[i]=count;
        }

        for(int i=0;i<queries.length;i++){
            answer[i]=true;
            if(preSum[queries[i][1]]-preSum[queries[i][0]]!= 
               queries[i][1]-queries[i][0]){
                answer[i]=false;
               }
            }
        return answer;
    }
}