class Solution {
    public int search(int[] nums, int target) {
        

        int left = 0 ; 
        int right = nums.length -1 ;

        return binarySearch(left , right , target , nums);


    }

    public int binarySearch(int left , int right , int target , int[] nums)
    {   if(left > right)
    return -1;
        int mid = left+ (right  - left) /2;

        while(left <= right)
        {

            if(nums[mid]==target)
            return mid;

            else
            if(nums[mid] < target)
            {
                return binarySearch(mid+1 , right , target ,nums);
            }

            else
            return binarySearch(left , mid -1 , target , nums);
        }

        return -1;
    }
}
