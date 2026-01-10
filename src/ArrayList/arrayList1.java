
package ArrayList;

import java.util.*;


public class arrayList1 
{
    public static void main(String[] args)
    {
        // if the size of the array is not fixed it can be anything then use arrayList
        // it will take care of the size itself so no fixed rows or columns now!
        // ArrayList is a class
        // and on the RHS with new [ ArrayList<>(); ] is a constructor
        
        /* SYNTAX : 
        ->>  ArrayList<DataType> name = new ArrayList<>();
        ->> ArrayList<DataType> name = new ArrayList<>(Capacity);   capacity can be
                                                                  added but doesnt matter it  
                                                                  can take as many values as u want
        OR
        ->>  ArrayList<DataType> name = new ArrayList<DataType>();
        ->>  DataType = Integer , String ,etc ( Wrapper classes not the primitive ones like int , etc)
        */
        
        ArrayList<Integer> list= new ArrayList<>();
        
        list.add(1);   // to give i/p in the array
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println("1. Actaul ArrayList : "+list);   // to print the whole ArrayList 
        
        list.remove(1);  // to remove a number at INDEX = 1
        
        System.out.println("2. After removal of int at index 1 ArrayList : "+list);
        
        list.set(0, 25);  // to change at 0 INDEX and set 25 value
        
        System.out.println("3. After setting at index 0 of 25 ArrayList "+list);
        
        System.out.println("number at index 2 : "+list.get(2));  // to get value at index = 2
        
        System.out.println(list.contains(3));
   
    }
}
