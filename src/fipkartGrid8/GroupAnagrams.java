/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fipkartGrid8;

//pretty gud problem 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GAS 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        //we can try doing the sorting thing first then will see...

       // String[] str=new String[strs.length];

        HashMap<String,List<String>> map=new HashMap<>();


        //sorting each string in strs
        for(int i=0;i<strs.length;i++)
        {
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            String s=new String(c);
           // str[i]=s;
           // key => String sotrted one , value => list of all the strings

        if(!map.containsKey(s))
        {
            map.put(s,new ArrayList<>()); //emplty list
            map.get(s).add(strs[i]);
        }
        else
        {
            map.get(s).add(strs[i]);  //already existing list
        }

        //another shorter way fro this if ele part
        //map.putIfAbsent(s,new ArrayList<>());
        //map.get(s).add(strs[i]);

        }

List<List<String>> result=new ArrayList<>();
//traversing hash map for values or lists*****
for(List<String> values: map.values())
{
    result.add(values);
}
return result; // or return new ArrayList<>(map.values());
    }
}
public class GroupAnagrams {
    
}
