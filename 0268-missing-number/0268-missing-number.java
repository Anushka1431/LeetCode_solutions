class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        
        while(i<nums.length){
            int ci=nums[i];
            if(nums[i] < nums.length && nums[i]!=nums[ci]){
                int temp=nums[ci];
                nums[ci]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        for( i=0;i<nums.length;i++){
            if(nums[i]!=i){
               return i;
            }
        }
        return nums.length;
        
    
    } 
}