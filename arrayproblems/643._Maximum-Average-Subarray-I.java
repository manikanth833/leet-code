class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max1;
        double sum=0;
        double avg=0;
        for (int i=0;i<k;i++)
        {
            sum+=nums[i];
            avg=sum/k;
        }
        max1=avg;
        for (int i=k;i<nums.length;i++)
        {
            sum+=nums[i];
            sum-=nums[i-k];
            avg=sum/k;
            max1=Math.max(max1,avg);
        }
    return max1;
    }
}