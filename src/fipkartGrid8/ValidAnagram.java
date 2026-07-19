/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fipkartGrid8;

import java.util.Arrays;

class VAS 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        //sorting is the one of the way
        //Strings are immutable so we would need get ech character in the char array..

        char[] sc=s.toCharArray();
        Arrays.sort(sc);
        String sortedS=new String(sc);

        char[] tc=t.toCharArray();
        Arrays.sort(tc);
        String sortedT=new String(tc);

        //comparing 
        if(sortedS.equals(sortedT))
        {
            return true;

        }
        else
        return false;
    }
}
public class ValidAnagram {
    
}
