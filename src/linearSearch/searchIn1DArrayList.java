
package linearSearch;
import java.util.*;
public class searchIn1DArrayList
{
   static ArrayList<Integer> arr=new ArrayList<>(5);  // array list initialised and declared
   static int target;
   public static void main(String[] args)
   {
           arr.add(1);
           arr.add(3);
           arr.add(5);
           arr.add(0);
           arr.add(7);
           arr.add(67);
           arr.add(89);
           arr.add(143);
           arr.add(17);
           arr.add(12);
           arr.add(12);
           arr.add(11);
           
           System.out.println("ArrayList : "+ arr);  // NOTE: arrayList is printed directly nothing needed
           
           target=143;
           search(arr);
    }
   static void search(ArrayList<Integer> arr)
   { int i;
   
       for(i=0;i<arr.size();i++)   // ** NOTE : for arrayList size function is used not length
       {
          if(arr.get(i)==target)
          {
              System.out.println( target+" found at index : " + i);
          }
          
       }
   }
}
