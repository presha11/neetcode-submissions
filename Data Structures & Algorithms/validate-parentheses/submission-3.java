class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];

       int top = -1;
for(int i = 0 ; i< s.length() ;i++)
{
    if(s.charAt(i) == '{' || s.charAt(i) == '[' ||s.charAt(i) == '('  )
    {top++;
        stack[top] = s.charAt(i);
    }

    else
    {

            // Important check
                if (top == -1) {
                    return false;
                }

        if(s.charAt(i) == '}'   )
        {

          if(stack[top] =='{')
         { 
          top--;}
          else {return false;}
         }

        

        if( s.charAt(i) == ']')
        {
             if(stack[top] =='[')
         { 
          top--;}
          else {return false ;}
         }
        
        
        if( s.charAt(i) == ')')
        {
             if(stack[top] =='(')
         { top--;}
       
          else {return false ;}
         }
        

    }
}
return top == -1 ? true :false;
    }
}
