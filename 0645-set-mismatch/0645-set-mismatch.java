class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int i=0;
        while(i<nums.length){
            int ci=nums[i]-1;
            if(nums[i]!=nums[ci]){
                swap(nums,i,ci);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return new int[]{nums[index],index+1};
            }
        }
        return new int[] {-1, -1};
    }
    static void swap(int[] arr, int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
}
    