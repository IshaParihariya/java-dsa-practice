/*
MORE READBLE FORM FOR THE COMPARATOR 
*/
package javacollections_;
import java.util.*;

public class Comparator1_
{
    public static Comparator<Integer> getComparator()
    {
        return new Comparator<Integer>()
     {
         // overriding the compare method in it to change the sorting**
         @Override
         public int compare(Integer num1,Integer num2)// compare mthod overriding
         {
             // if num1<num2 = incorrect as we need descending order
             if(num1<num2)//REVERSE THE Integers
             {
                 return 7; // +ve int return if Reverse
                 
             }
             else if(num1>num2)
             {
                 return -3; // -ve if NO REVERSE
             }
             else 
                 return 0; // for other cases like equal to 
         }
     };
    }
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
        Collections.sort(al, getComparator());
         System.out.println("sorted in descending order using a comparator : "+al); //  [81, 41, 21, 13, 13, 11, 10]
    }
}
