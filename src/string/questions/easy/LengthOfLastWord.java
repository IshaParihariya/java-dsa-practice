/*
58. Length of Last Word

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
*/
package string.questions.easy;

// O(N) => here in thsi solution i wnated the last word but started
// from the start position 
// we could have simply went to last and got the word 
class SolutionLOLW {
    public int lengthOfLastWord(String s) 
    {
        int l=0;
    
        String str="";
        String lastWord="";
        
        while(l<s.length())
        {
            if(s.charAt(l)==' ') // space
            {
                if(!str.isEmpty())
                {
                    lastWord=str;
                    str="";
                }
                
            }
            else
            {
            str=str+s.charAt(l);
        
            }
            l++;

        }
    if(str.equals(""))
    {
        return lastWord.length();
    }
    else
    return str.length();
    }
}
// O(N^2)
class SolutionLOLW1{
    public int lengthOfLastWord(String s) 
    {
        if(s.length()==0)
        {
            return 0;
        }
        
        int l=s.length()-1;
        String str="";

        while(l>=0)
        {
            if(s.charAt(l)==' ')
            {
                if(!str.isEmpty())
                {
                    return str.length();
                }
            }
            else
            {
                str=str+s.charAt(l); // bcuz of this line the TC can be O(N^2)
                // cuz each time a new String 
            }
            l--;
        }
        return str.length();
    }
}
//BEST CASE O(N) standard solution => only counting the length no string
// O(N)
//No extra arrays, strings, or collections.
//SC = O(1)
class SolutionLOLW2 {
    public int lengthOfLastWord(String s) 
    {
        if(s.length()==0)
        {
            return 0;
        }
        
        int l=s.length()-1;
        int length=0;

        while(l>=0)
        {
            if(s.charAt(l)==' ')
            {
               if(length>0)
               {
                return length;
               }
            }
            else
            {
                length++;
            }
            l--;
        }
        return length;
    }
}
public class LengthOfLastWord {
    
}
