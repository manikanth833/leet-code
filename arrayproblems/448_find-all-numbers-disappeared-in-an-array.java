class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        
       int i=0;
        List<Integer> miss= new ArrayList<>();
        while(i<nums.length)
        {
            int ci=nums[i]-1;  //current index of current value
            if(nums[i]>nums.length || nums[i]<1)
                i++;
            else if(nums[i]!=nums[ci])
            {
                int temp=nums[i];
                nums[i]=nums[ci];
                nums[ci]=temp;
            }
            else{
                i++;
            }
        }

        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                miss.add(j+1);
            }
        }


        return miss;
        
    }
}