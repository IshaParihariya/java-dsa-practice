
package string.questions.easy;

import java.util.Stack;

class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(!stack.isEmpty() )
            {
                            if(s.charAt(i)=='}' && stack.peek()=='{' || s.charAt(i)==']' && stack.peek()=='[' || s.charAt(i)==')' && stack.peek()=='(')
            {
                stack.pop();
            }
            else
            {
                 stack.push(s.charAt(i));
            }
            }
            else
            {
                 stack.push(s.charAt(i));
            }

                //stack.push(s.charAt(i)); //else push it into the stack
            


        }  
         return stack.isEmpty();    
    }
}
public class ValidParanthesis {
    
}
