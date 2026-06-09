/*
205. Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "f11", t = "b23"

Output: false

Explanation:

The strings s and t can not be made identical as '1' needs to be mapped to both '2' and '3'.

Example 3:

Input: s = "paper", t = "title"

Output: true

Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
*/
package string.questions.easy;

import java.util.HashMap;

/*
Time Complexity: O(n²)
because containsValue() is O(n) and is called inside a loop.

Space Complexity: O(n)
because the HashMap can store up to n mappings.
*/
//not optimal solution
class SolutionIS 
{
    public boolean isIsomorphic(String s, String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        //else part

        int l=0;
        int r=0;


        //O(n)
        HashMap<Character,Character> map=new HashMap<>();

        //O(n)
        StringBuilder str=new StringBuilder(s); //string builder with content of s

        //l==r as both strings length is same
        while(l<s.length())
        {
            //tc for getting the key ==> O(1)
            if(map.containsKey(s.charAt(l)) && map.get(s.charAt(l))!=t.charAt(l))
            {
                return false;
            }

            //tc for getting value ==> O(N) ***
            if(map.containsValue(t.charAt(l)) && !map.containsKey(s.charAt(l)))
            {
                return false;
            }
            //set the char in the str 
            str.setCharAt(l, t.charAt(l));
            //put in map what we are replacing with waht
            //O(1) to put
            map.put(s.charAt(l),t.charAt(l));

            //increment in l
            l++;

        }
        return true;
    }
}
//standard optimal solution
/*
Use two HashMaps.

One map stores:

s -> t

Another stores:

t -> s

This lets you use only containsKey() and get(), both of which are O(1) on average. ***
*/
class SolutionIS1 {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(mapST.containsKey(c1) && mapST.get(c1) != c2) {
                return false;
            }

            if(mapTS.containsKey(c2) && mapTS.get(c2) != c1) {
                return false;
            }

            mapST.put(c1, c2);
            mapTS.put(c2, c1);
        }

        return true;
    }
}
public class IsomorphicStrings {
    
}
