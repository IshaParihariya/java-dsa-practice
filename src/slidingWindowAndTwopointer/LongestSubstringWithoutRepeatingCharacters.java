
// str = c a d b z a b c d
// c  => c a => c a b => c a b d => c a b d z like this loop
// c a d b z (without repeatition consecutive characters) => length 5 
// a d b z => length 4 

// concept of labelled loop :
/*
A labeled loop is used when you want to control outer loops from inside nested loops.

Normally:

break → exits only current loop
continue → skips current iteration of current loop

But with labels:

break labelName; → exits outer loop
continue labelName; → jumps to next iteration of outer loop

// this will break the labelled loop
labelName:
for(...)
{
    for(...)
    {
        break labelName;
    }
}
// can aslo use continue to continue of the labelled loop from next iteration

*/
package slidingWindowAndTwopointer;

import java.util.ArrayList;

class  LongestSubstringWithoutRepeatingCharacter
{
    // method
    public void  longestSubstringWithoutRepeatingCharacters(String str)
    {
        
        
      
        
        // arraylist to store the sub strings
        ArrayList<String> subStrings=new ArrayList<>();
        
        
        // labelled loop
        outer :
        for(int i=0;i<str.length();i++)
        {
             String sub="";
            for(int j=i;j<str.length();j++)
            {
               // for checking repeatition
                for(int k=0;k<sub.length();k++)
                {
                    if(sub.charAt(k)==str.charAt(j))
                    {
                        // add sub string in the list 
                        subStrings.add(sub); 
                        // breaks j and k loops
                        continue outer;
                    }
                }
                 sub=sub+str.charAt(j);
            }
            // in case of abcd no repetition so 
            subStrings.add(sub);
        }
        
        // now find the size of each sub string from the ArrayList to get the longest one
         Integer lengthOfSubString=0;
         Integer max=0;
         // longest sub string 
         String ss="";
        for(int i=0;i<subStrings.size();i++)
        {
            lengthOfSubString=subStrings.get(i).length();
            if(lengthOfSubString>max)
            {
            max=lengthOfSubString;
            ss=subStrings.get(i);
            }
        }
        
        // printing 
        System.out.println("length of longest sub string : "+ max);
        System.out.println("longest sub string is : "+ss);
    }
}

public class LongestSubstringWithoutRepeatingCharacters
{
     public static void main(String[] args)
     {
         LongestSubstringWithoutRepeatingCharacter obj =new LongestSubstringWithoutRepeatingCharacter();
         obj.longestSubstringWithoutRepeatingCharacters("cadbzabcd");
         
         
     }
}
