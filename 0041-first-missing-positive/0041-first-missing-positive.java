class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        
        while(i<nums.length){
            int ci=nums[i]-1;
            if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[ci]){
                swap(nums,i,ci);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return index+1;
            }
            
        }
        return nums.length + 1;
    }
    static void swap(int[] arr, int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
}
    