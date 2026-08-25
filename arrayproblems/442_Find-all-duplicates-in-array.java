class Solution {
    public List<Integer> findDuplicates(int[] nums) {
          int i=0;
        while(i<nums.length)
        {
            int ci=nums[i]-1; // currect index of current element

             if(nums[i]!=nums[ci]) // if the element is not in the correct place,swap
            {
                int temp=nums[ci];
                nums[ci]=nums[i];
                nums[i]=temp;
            }

            else
            {
                i++;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1)    //if index and value at the index are not equal!
             {
                res.add(nums[j]);
            }
        }

        return res;
    }
}