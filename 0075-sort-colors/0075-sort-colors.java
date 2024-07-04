//use 3 pointers left right and i to parse.put all the 0s to left and 2s to right

class Solution {
    public void sortColors(int[] nums) {
        
        int l=0;
        int r=nums.length-1;
        int i=0;
        while(i<=r){
            if(nums[i]==0){
                swap(nums,l,i);
                l++;
                i++;
            }
            else if (nums[i]==2){
                swap(nums,r,i);
                r--;
            }
            else{
                i++;
            }

        }
       

    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
    }