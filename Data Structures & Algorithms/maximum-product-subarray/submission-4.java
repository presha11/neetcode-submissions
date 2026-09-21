public class Solution {
    public int maxProduct(int[] nums) {
      

       int maxProd =  Integer.MIN_VALUE;
int prefix =1 , suffix = 1;
int n = nums.length ;
       for(int i = 0 ; i < nums.length ; i++)
       {
        if(prefix == 0)
        prefix = 1;
        if(suffix ==0 )
        suffix = 1;

        prefix = prefix * nums[i];
        suffix = suffix * nums[n-i-1];

        maxProd = Math.max(maxProd , Math.max( prefix , suffix));
       }

       return maxProd;
    }
}