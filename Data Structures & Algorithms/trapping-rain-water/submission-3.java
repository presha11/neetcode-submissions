class Solution {
    public int trap(int[] height) {
        
        int n = height.length -1;
        int ans = 0 ;
        int leftMax  = 0 , rightMax = 0;
        int l  = 0 , r = n;

        while(l<r)
        {

          leftMax = Math.max(leftMax , height[l]);
          rightMax = Math.max(rightMax , height[r]);

       if(leftMax < rightMax)
       {
          ans = ans + leftMax - height[l];
          l++;

        }

        else
        {
             ans = ans + rightMax - height[r];
          r--;
        }
    }
    return ans;
}
}
