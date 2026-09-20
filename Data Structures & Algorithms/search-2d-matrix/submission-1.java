class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i = 0 ; i < matrix.length ; i++)
        {     // Skip rows where target cannot exist
            if (target < matrix[i][0] || target > matrix[i][matrix[i].length - 1]) {
                continue;
            }
           
           int left = 0 ; 
           int right = matrix[i].length -1 ;
           while(left <= right)
           {
            int mid = left + ( right - left) /2;
             int nums = matrix[i][mid];
            if(nums < target)
            {
                left = mid +1;

            }
            else if(nums > target)
            {
                right = mid -1;
            }

            else
            {
                return true;
            }
           }
        }
        return false;
    }
}
