class Solution {
    public boolean checkValidString(String s) {
        int leftSum = 0 , starSum =0 ;

        for(char ch : s.toCharArray())
        {
            if(ch =='(')
            leftSum++;

            else if(ch==')')
            leftSum--;

            else 
            starSum++;
if(leftSum <0 && Math.abs(leftSum) > starSum )
        {
            return false;
        }
        }

        
         int rightSum = 0;
        starSum = 0;
        for(int i = s.length() -1 ; i >=0 ; i--)
        {
            if(s.charAt(i) == ')')
            rightSum++;

            else 
            if(s.charAt(i) =='(')
            rightSum--;

            else
            starSum++;
             if(rightSum <0 && Math.abs(rightSum) > starSum )
        {
            return false;
        }
        }

        

        return true;
    }
}