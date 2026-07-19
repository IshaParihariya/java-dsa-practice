/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fipkartGrid8;

//imp hint : "pwwkew"

import java.util.HashSet;
import java.util.Set;


  // If current character is already in the window,
            // shrink the window from the left until it's removed. IMPORTANT PROBLEM REVISE

            /*
            Whenever you see

"Longest/Maximum/Minimum ... without duplicates"

think:

Expand using r

↓

Duplicate?

↓

Shrink using l

↓

Repeat

That's the sliding window template.
            */

class LSSWRCS
{
    public int lengthOfLongestSubstring(String s) 
    {
        Set<Character> set=new HashSet<>();

       

       
        int l=0;
        int maxLength=0;

        for(int r=0;r<s.length();r++)
        {
        
            //window CONTAINS current element 
            while(set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l));
                l++;
            }
            // DOES NOT CONTAINS current element 
             set.add(s.charAt(r));

            maxLength=Math.max(maxLength,set.size());
            
        }

        return maxLength;
        
    }
}
public class LongestSubStringWithoutRepeatingCharcters {
    
}
