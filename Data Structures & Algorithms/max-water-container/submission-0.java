class Solution {
    public int maxArea(int[] heights) {
 int i = 0 ; 
 int j = heights.length -1 ; 
 int max =Integer.MIN_VALUE;
 while(i<j)
 {
    int prod = Math.min(heights[i], heights[j]) * (j-i );
     
     max = Math.max(max, prod);

     if(heights[i]<heights[j])
     {i++;}
    else 
    j--;

 }

 return max;
    }
}
