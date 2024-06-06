class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr=new int[101];
        for(int[] log: logs){
            int birth=log[0];
            int death=log[1];
            arr[birth-1950]++;
            arr[death-1950]--;
        }
        int maxindex=arr[0];
        int maxyear=1950;
        for(int i=1;i<101;i++){
            arr[i]+=arr[i-1];
            if(maxindex<arr[i]){
                maxindex=arr[i];
                maxyear=i+1950;
            }
        }
        return maxyear;
    }
}