
package string.questions.easy;
class Solution 
{
    public int percentageLetter(String s, char letter) 
    {
        int count=0;
        //this will get us the count of the letter in the string s
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==letter)
            {
                count++;
            }
        }

        Integer perc=(Integer) ((count*100)/s.length());

        return perc;
    }
}
public class PercentageOfLetter {
    
}
