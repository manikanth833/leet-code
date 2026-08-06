class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;         
        if(nums.length==1)
            return nums[0];
       
        while(start<end)
        {
            int mid=start+(end-start)/2;
           
            if(nums[start]<nums[end])
            return nums[start]; 
            if(mid<end && nums[mid]>nums[mid+1])
            {
                return nums[mid+1];
            }
            if(mid>start && nums[mid]<nums[mid-1])  //checking mid itself the target (smallest element)
            {
                return nums[mid];
            }
            if(nums[start]==nums[mid])   // most important block, if there were duplicates then mmove farword
            {
            start++;
            }
            else if( nums[mid]>nums[start])
            {
                start=mid+1;
            }
           
            else{
                end=mid;                      //note:every itration of the BS should shrink the array
            }
        }
        return nums[start];
    }
}