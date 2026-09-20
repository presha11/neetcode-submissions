class Solution {
    public int trap(int[] height) {
        int leftMax = 0;
       
        int n = height.length -1;
 int rightMax = 0;
        int l = 0 ; int r = n;
int area =0;
        while(l<r)
        {



          leftMax = Math.max(leftMax , height[l]);
          rightMax = Math.max(rightMax , height[r]);

          if(leftMax <= rightMax)
          {
            area += (leftMax - height[l]);
            l++;
          }

          else
          {
             
            area += (rightMax - height[r]);
            r--;
          }
          }
        
        return area;
    }
}
