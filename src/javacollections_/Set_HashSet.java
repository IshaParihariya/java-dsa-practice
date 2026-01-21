/*
Hash Set : its a data structure that stores UNIQUE values in ANY RANDOM ORDER.
- NO DUPLICATE VALUES allowed

var : no need to tell if its an integer or String etc it will automatically know and do 
         for(var num : hs)
         {
             System.out.println(num);
         }
*/
package javacollections_;

import java.util.HashSet;
public class Set_HashSet
{
    public static void main(String[] args)
    {
         HashSet<Integer> hs=new HashSet<Integer>();
         hs.add(1);
         hs.add(9);
         hs.add(2);
         hs.add(1); // this will not be added as no duplicate values allowed
         System.out.println(hs);
         // printing using var 
         // var : no need to tell if its an integer or String etc it will automatically know and do 
         for(var num : hs)
         {
             System.out.println(num);
         }
    }
}
