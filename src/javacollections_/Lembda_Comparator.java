/*
What does num1 - num2 mean?
If result is negative → num1 comes first
If result is positive → num2 comes first
If 0 → equal
So:
num1 - num2 → Ascending order
num2 - num1 → Descending order
*/
package javacollections_;

import java.util.*;
public class Lembda_Comparator
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<Integer>(); // array list
        al.add(11);
        al.add(10);
        al.add(41);
        al.add(21);
        al.add(13);
        al.add(13);
        al.add(81);
        Collections.sort(al, (num1,num2) -> num2- num1); // for descemdimg order
        System.out.println("sorted in descending order using a lembda and comparator : "+al);
    }
}
