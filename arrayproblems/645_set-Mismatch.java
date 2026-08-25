class Solution {
    public int[] findErrorNums(int[] nums) {
      int i=0;
      
        while(i<nums.length)
        {
            int ci=nums[i]-1;
            if(nums[i]!=nums[ci])
            {
                int temp=nums[i];
                nums[i]=nums[ci];
                nums[ci]=temp;
            }
            else{
                i++;
            }
        }
        int[] res={0,0};
        for(int j=0;j< nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                res[0]=nums[j];
                res[1]=j+1;
            }
        }
        return res;
    }
}