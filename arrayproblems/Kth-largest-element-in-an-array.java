class Solution {
    public int findKthLargest(int[] nums, int k) {

        int target = nums.length - k;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int pivot = nums[left + (right - left) / 2];

            int low = left;
            int mid = left;
            int high = right;

            while (mid <= high) {

                if (nums[mid] < pivot) {

                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;

                    low++;
                    mid++;

                } else if (nums[mid] > pivot) {

                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;

                    high--;

                } else {

                    mid++;
                }
            }

            // target is in the < pivot section
            if (target < low) {
                right = low - 1;
            }

            // target is in the > pivot section
            else if (target > high) {
                left = high + 1;
            }

            // target is inside the == pivot section
            else {
                return nums[target];
            }
        }

        return -1;
    }
}