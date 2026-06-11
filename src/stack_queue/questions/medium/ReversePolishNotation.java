/*

You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

Note that:

The valid operators are '+', '-', '*', and '/'.
Each operand may be an integer or another expression.
The division between two integers always truncates toward zero.
There will not be any division by zero.
The input represents a valid arithmetic expression in a reverse polish notation.
The answer and all the intermediate calculations can be represented in a 32-bit integer.
 

Example 1:

Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
Example 2:

Input: tokens = ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6
Example 3:

Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
Output: 22
Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22
 

Constraints:

1 <= tokens.length <= 104
tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].
 */
package stack_queue.questions.medium;

import java.util.Stack;

/*
NOTE : Every element is a String, but the stack doesn't have to store the same type as the input. 
here we having an array containing strings but its not necessary that the 
stack has to contain strings only the type can be anything else
//if we would have taken  Stack<Integer> stack=new Stack<>();  instead of  Stack<String> stack=new Stack<>();
the solution would have been easier!!
*/
class SolutionRPN {
    public int evalRPN(String[] str) 
    {    
        Stack<String> stack=new Stack<>();

        for(int i=0;i<str.length;i++)
        {
            if(str[i].equals("+"))
            {
                //as operation so pop two elements and perform operation
                Integer a=Integer.parseInt(stack.pop());
                Integer b=Integer.parseInt(stack.pop());
                Integer r=a+b;
                //now push this r into the stack
               stack.push(String.valueOf(r));
            }
            else if(str[i].equals("-"))
            {
                //as operation so pop two elements and perform operation
                Integer a=Integer.parseInt(stack.pop());
                Integer b=Integer.parseInt(stack.pop());
                Integer r=b-a; //here as well
                //now push this r into the stack
                 stack.push(String.valueOf(r));
            }
            else if(str[i].equals("*"))
            {
                //as operation so pop two elements and perform operation
                Integer a=Integer.parseInt(stack.pop());
                Integer b=Integer.parseInt(stack.pop());
                Integer r=a*b;
                //now push this r into the stack
                stack.push(String.valueOf(r));
            }
            else if(str[i].equals("/"))
            {
                //as operation so pop two elements and perform operation
                Integer a=Integer.parseInt(stack.pop());
                Integer b=Integer.parseInt(stack.pop());
                if(a!=0)
                {
                Integer r=b/a; //here what we doing with a and b
                 //now push this r into the stack
                stack.push(String.valueOf(r));
                }
            }
            //for numbers
            else
            {
                stack.push(str[i]);
            }
        } //end of for loop

        //as in the end the stack will be having the result so we will be returning that
        Integer result=0;
        if(!stack.isEmpty())
        {
        result=Integer.parseInt(stack.pop());
        }


        //then
        return result;
    }
}
public class ReversePolishNotation {
    
}
