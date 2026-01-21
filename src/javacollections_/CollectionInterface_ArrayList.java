/*
ArrayList : 

        ArrayList prints elements using toString()**
        Default toString() prints memory reference
        Override toString() for readable output
        */
package javacollections_;
import java.util.*;
class Data //class
    {
        public int n;
       public String str;
        
        Data(int n,String str) //constructor
        {
           this.n=n;
           this.str=str;
        }
        /*
        ArrayList prints elements using toString()
        Default toString() prints memory reference
        Override toString() for readable output
        */
        @Override
public String toString()
{
    return n + " " + str;
}

}
public class CollectionInterface_ArrayList 
{ 
   public static void main(String[] args)
   {
       // adding any type of data in the array list not any particular one
     ArrayList<Data> data=new ArrayList<>();  // array list object  
     
    data.add(new Data(1,"Isha")); // adding data in the arraylist 
    data.add(new Data(2,"Kunal"));
    
    
    //printing directly
    System.out.println(data);
    
    System.out.println(data.size()); //size of arraylist
     
    System.out.println(data.get(1));//print the element at index : 1
    
    System.out.println(data.remove(0)); // to remove element from index 0
    
   // System.out.println(data.contains(12)); : returns boolean if the elemnt is present in the arraylist or not
    
   data.clear();//clears the entire list
  
//    for (Data d : data) //printing
//        {
//            System.out.println(d.n + " " + d.str);
//        }
   }
}

