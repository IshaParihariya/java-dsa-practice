// stack qestion

// for a balanced string
/*
->> every opening brackket has a matching closing bracket
->> and they are in the correct order

example : ()
[](){}
()[{}()]  same order and all have a closing bracket
*/
package stack_queue.questions.easy;

import java.util.Stack;

class BalancedString
{
    //Stack<String> stack=new Stack<>(); // we are having string type here
    
    Stack<Character> stack=new Stack<>();
    
    public void method(String str)
    {
        char c1;
        char c2;
        // push only the opening brckets 
        for(int i=0;i<str.length();i++)
        {
           c1=str.charAt(i);
         if(c1 == '(' || c1 == '{' || c1 == '[')
        {
            // pushing the char in the stack
            //stack.push(String.valueOf(c1)); // so as string is allowed in the stack as data type is give as string up there so need to
                            // convert to string to push in the stack  => Stack<String> stack=new Stack<>();
            
        stack.push(c1);    
        }// for closing brackets start comparision
         else
         {
           
             // no other char i.e., now empty
             if(stack.empty())
             {
             System.out.println("NOT BALANCED");
                return;
            }
             
            
            c2=stack.peek();
            if(c2=='(' && c1==')' 
                    || c2=='[' && c1==']' 
                    || c2=='{' && c1=='}')
            {
                // LIFO
                stack.pop();
                 // match found 
            }
            
            else
            {
            System.out.println("NOT BALANCED");
                return;
            }
            
         }
        }
        
        // final check
        // after all checks is stack has nothing in it then it is balanced else not
        if(stack.isEmpty()) {
            System.out.println("BALANCED");
        } else {
            System.out.println("NOT BALANCED");
        }
        
    }
}
public class BalancedParanthesis
{
    public static void main(String[] args)
    {
         BalancedString b=new  BalancedString();
         b.method("()[{}()]");
    }
}
