/*

5. Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
 */
package string.questions.medium;

/*
TIME LIMIT EXCEEDED ON LEETCODE
O(n³)
because:
O(n²) substrings
O(n) reverse/comparison
*/
class SolutionLPS {
    public String longestPalindrome(String s) 
    {
        //if empty case
        if(s.isEmpty())
        {
            return "";
        }


        //not empty case
        int l=0;
        int r=0;
        StringBuilder str=new StringBuilder();

        String result="";
        int length=0;


        //while loop
        while(l<s.length())
        {
            //adding each character in str
            str.append(s.charAt(r));

            StringBuilder current=new StringBuilder(str);
            //checking the reverse of str
            String rev=current.reverse().toString(); //here the change of revrse is in str itself
            //getting length of str each time and comparing

            if(rev.equals(str.toString()) &&  length < str.length())
            {
                result = str.toString();
                length=str.length();
            }
            else
            {
                //do nothing
            }

            r++;
            if(r==s.length())
            {
                str.setLength(0); // starting the string again 
                l++;
                r=l;
            }
        }   
        //end of while loop
        return result; 
        }
}
public class LongestPalindromeString {
    
}
