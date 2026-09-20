class Solution {
      int count = 0;
    public int countSubstrings(String s) {
        
      

        for( int i = 0 ; i < s.length() ; i++)
        {
           expand( s , i , i );
           expand(s , i , i+1);



        }

        return count;
    }

    public void expand(String str , int i , int j)
    {
        while(i>=0 && j< str.length() && str.charAt(i) == str.charAt(j))
        {  
            count++;
            i--;
            j++;
            
        }
    }
}
