class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        int high=nums.length;
        while(i<high)
        {
            int ci=nums[i]-1;
            if(ci>=high || nums[i]<=0)
            {
                i++;
            }
            else if (nums[ci]!=nums[i])
            {
                int temp=nums[ci];
                nums[ci]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        for(int j = 0; j <high; j++)
        {
            if(nums[j]!= j +1)
            {
                return j+1;
            }

        }
        return high+1;
    }
}