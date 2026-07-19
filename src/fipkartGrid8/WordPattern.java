
package fipkartGrid8;

import java.util.HashMap;

/// can use two hashmaps as well as containsVlaue() => O(n)
/*
One thing to remember

Whenever you hear

One-to-One Mapping

Immediately think

HashMap A -> B

HashMap B -> A

instead of

containsValue()

This trick appears in many OA questions.
*/

class Solution1234 {
    public boolean wordPattern(String pattern, String s) 
    {
        //hash map
        HashMap<Character,String> map=new HashMap<>();


        String[] arr=s.split(" "); //string arr from s

         if (pattern.length() != arr.length) {
            return false;
        }


        int l=0; //for character and string


        

        while(l<pattern.length())
        {
            if(map.containsKey(pattern.charAt(l)) && !map.get(pattern.charAt(l)).equals(arr[l]))
            {
                return false;
            }
            if(map.containsValue(arr[l]) && !map.containsKey(pattern.charAt(l)))
            {
                return false;
            }
            map.put(pattern.charAt(l),arr[l]); //put into the map
            l++;
        }

        return true;
    }
}
public class WordPattern {
    
}
