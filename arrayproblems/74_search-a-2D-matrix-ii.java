class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start=0;  
        int end=matrix.length * matrix[0].length - 1;   // from last column
        int rs=matrix.length;
        int cs=matrix[0].length;
        while(start<=end)
        { 
            int mid=start+(end-start)/2;
            int r=mid/cs;
            int c=mid%cs;
            if(target==matrix[r][c])
            {
                return true;
            }
            if(target < matrix[r][c])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}