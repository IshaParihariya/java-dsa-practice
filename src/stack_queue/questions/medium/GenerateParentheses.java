/*
22. Generate Parentheses

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

Constraints:

1 <= n <= 8
*/
package stack_queue.questions.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution22
{
    public List<String> generateParenthesis(int n) 
    {
        // brute force 
        // finding all cases and getting the gud ones outta it
        // there could be 2^2n cases 
        // how?? 
        // each case could be ( or ) => 2 * 2 * 2...=> 2^2n
        // eg: n=3
        // ( or ) ( or ) ( or ) ( or ) ( or ) ( or ) 
        // => 2*2*2*2*2*2 => 2^2n
        /*
        Math.pow(a, b) means:
        a^b
        Math.pow() returns a double, even when the answer is a whole number so.. (int) typecasting
        */
        int totalCases= (int) Math.pow(2,2*n);

        //Stack<String> stack=new Stack<>(); //stack to store data (all cases)

        List<Stack<Character>> list=new ArrayList<>();

        for(int i=0;i<totalCases;i++) 
        {
            // i different cases
            // for n=2
            // eg: i = 0 -> 15  => 16 cases
            // 0 => 0000
            // 1 => 0001
            // ...
            // 15 => 1111
            
            String binary =Integer.toBinaryString(i);
             // i ko binary me convert kara yaha parr

            Stack<Character> stack=new Stack<>();
            
            // there will be this thing
            // that for i=5
            // Integer.toBinaryString(5) will return us 101 but we need 0101
            // so the leading zereos problem here 
            // so we pushing zeroes first 
              // leading zeros
              int zerosNeeded=(2 * n) - binary.length();
              // we always need 2 * n characters so this minus this..

            for(int j = 0; j < zerosNeeded; j++)
            {
               stack.push('(');
            }

            for(int j=0 ; j<binary.length() ; j++)
            {
                if(binary.charAt(j) == '0')
                {
                    stack.push('(');
                }
                else
                {
                    stack.push(')');
                }
            }

            //adding into the list
            list.add(stack);

        }


        //now getting gud cases outta this..

        List<String> resultList=new ArrayList<>();

        
        for(Stack<Character> cases : list)
    {
        Stack<Character> temp=new Stack<>();
         boolean valid = true;

        for(Character bracket:cases)
        {
            if(bracket=='(')
            {
                temp.push(bracket);
            }
            else
            {
                if(temp.isEmpty())
                {
                    valid=false;
                    break;//as invalid case
                }
                else
                {
                    temp.pop();
                }
            }
        }

        if(valid==true && temp.isEmpty())
        {
            //means gud one case so store in some list
            StringBuilder result=new StringBuilder();

            for(Character bracs:cases)
            {
                result.append(bracs);
            }

            resultList.add(result.toString());
        }

    }

    return resultList;
        
    }
}
public class GenerateParentheses {
    
}
