class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxsum=0;
        for(int[] c: accounts){
            int sum=0;
            for(int m: c){
                sum+=m;
            }
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}