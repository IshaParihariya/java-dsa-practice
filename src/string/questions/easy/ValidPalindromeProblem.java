/*
 NOTE : IN ASCII
            a = 97 -> z = 122
            A = 65 -> Z = 90
'0' = 48
'9' = 57
            
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters
*/
package string.questions.easy;

// A StringBuilder is an object used to build and modify strings efficiently.
// The reason it exists is that Strings are immutable.
//Time: O(n)
//Extra Space: O(n)
class SolutionVPP{
    public boolean isPalindrome(String s)
    {
        if(s.isEmpty())
        {
            return true;
        }

        int l=0;

        StringBuilder str=new StringBuilder();

        while(l<s.length())
        {
            //char at each l
            Character ch=s.charAt(l);

            //condition 
            /*
            as the aphanumeric charscters include letters and numbers
            so we need to keep a -> z
            A -> Z
            and 0 -> 9 numbers 

            NOTE : IN ASCII
            a = 97 -> z = 122
            A = 65 -> Z = 90
            */

            /*
            if((ch >= 'A' && ch <= 'Z') ||
             (ch >= 'a' && ch <= 'z') ||
              (ch >= '0' && ch <= '9'))
            */

            if((ch >= 65 && ch <= 90 )|| // uppercase characters A -> Z
               (ch >= 97 && ch <= 122) || //lowercase
               (ch >=48 && ch<=57 )) // for numbers 
               /*
               But '0' to '9' in ASCII are:
               '0' = 48
               '9' = 57
               */
               
               {
                // keep this character
                str.append(ch);
               }
               //else dont keep the character

               
               l++; // increment in l

        } //end of while loop

        String str1=str.toString().toLowerCase(); // str is a StringBuilder.
                                                  // StringBuilder does not have toLowerCase(). so convert to string then use the method
        String rev=new StringBuilder(str1).reverse().toString();

        if(str1.equals(rev))
        {
            return true;
        }
        else
        return false;

    }
}
public class ValidPalindromeProblem {
    
}
