/*
comparator : 
Comparator is an interface used to define custom sorting logic externally.
compare(); is overridden **
- for swapping the numbers return +ve int 
- for no swapping return -ve int 
- for equal case return 0 


Collections.sort(al, Collections.reverseOrder());

*/
package javacollections_;
import java.util.*;
public class Comparator_ 
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
     // Collections.sort(al); // Collections.sort() : sorts in ascending order 
     
     // in descending order
     // comparator
     
     // OTHER WAY : Collections.sort(al, Collections.reverseOrder());***
     
     // ALSO ANOTHER ONE LEMBDA : Collections.sort(al, (num1,num2) -> num2 - num1 )*** for descending order

     Collections.sort(al, new Comparator<Integer>()
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
     });
        System.out.println("sorted in descending order using a comparator : "+al); //  [81, 41, 21, 13, 13, 11, 10]
        
        
        
    }
}
