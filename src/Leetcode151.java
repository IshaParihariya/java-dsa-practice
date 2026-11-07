
import java.util.ArrayList;
import java.util.List;


//we got to know some stuff in this question regarding something 
//so we need to write 'em in the notes
//write these down tom!

class Solution 
{
    public String reverseWords(String s) 
    {
        //string array to store each word from the string s

        List<String> list=new ArrayList<>();
        //arraylist maintains the insertion order bro

        StringBuilder str=new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ') //if space is there means a new string
            {
                if(!str.toString().trim().isEmpty()) //or if (str.length() > 0)
                {
                    //means add in tho the list
                    list.add(str.toString());
                    str.setLength(0);//clear sb 
                } 
                //else just do not do anything bro!!
            }
            else
            {
                //keep adding it in string builder str
                str.append(s.charAt(i));
                //this is wrong here
                //if in last we dont have space 
                //then that string will not be added into the list so
                if(i==s.length()-1)
                {
                    //and as its in here so
                    //means we need to add it 
                    list.add(str.toString());
                }
            }
        }

        //now we done with the use of sb 
        //so we gonn' reuse it 
        str.setLength(0);//clear sb for reusing same one

        for(int i=list.size()-1;i>-1;i--)
        {
            str.append(list.get(i));
            str.append(" "); //space here
        }

        return str.toString().trim();
    }
}
public class Leetcode151 {
    
}
