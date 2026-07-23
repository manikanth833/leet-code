class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            int even=0;
            while(n!=0)
            {
                even++;
                n/=10;
            }
            if(even%2==0)
            {
                count++;
            }
        }
        return count;
    }
}