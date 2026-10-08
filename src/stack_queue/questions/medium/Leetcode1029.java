package stack_queue.questions.medium;

import java.util.Stack;

class Solution1029 
{
    public String removeDuplicates(String s, int k) 
    {
        if(s.length()==1)
        {
            //cuz k >= 2 always so..
            return s;
        }


        Stack<Integer> counts=new Stack<>(); //for keeping counts of chars

        Stack<Character> chars=new Stack<>(); //for getting chars

        for(int i=0;i<s.length();i++)
        {
            if(!chars.isEmpty() && chars.peek()==s.charAt(i))
            {
            
                    //increase count
                    int increase=counts.pop();

                    counts.push(increase+1);

            }
            else
            {            
                chars.push(s.charAt(i));
            counts.push(1);
            }

            if(counts.peek()==k)
                    {
                        counts.pop(); //count of this one only
                        chars.pop();//last elem was that only
                    }
                
        }

        StringBuilder result=new StringBuilder();

        while(!chars.isEmpty())
        {
            char ch=chars.pop();
            int c=counts.pop();

            while(c>0)
            {
                result.append(ch);
                c--;
            }
        }


        //reverse it now 

        return result.reverse().toString();
    }
}

public class Leetcode1029 {
    
}
