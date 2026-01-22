/*
A TreeMap stores data in key–value pairs like HashMap,
but it maintains keys in SORTED order.**
NO NULL keys allowed
multiple NULL values allowed
slower than HashMap

Syntax : 
TreeMap<keyType , valueType> name = new TreeMap<>();


*/
package javacollections_;

import java.util.TreeMap;

public class Map_TreeMap 
{
    public static void main(String[] args)
    {
         TreeMap<Integer , String> ts= new TreeMap<>();
        ts.put(4,"Isha");
        ts.put(2,"Mohit");
        ts.put(3,"Kunal"); //  sorted**
        ts.put(1,"Isha"); // no duplicate keys allowed
        // no NULL key allowed
        System.out.println(ts); // {1=Isha, 2=Mohit, 3=Kunal, 4=Isha}
        //System.out.println(ts.remove(2));//removes key and value
         System.out.println(ts.get(1)); // gets value of the key
         System.out.println("first entry : "+ts.firstEntry()); // 1 = Isha
          System.out.println("first key : "+ts.firstKey()); // 1
           System.out.println("last entry : "+ts.lastEntry()); // 4 = Isha
           System.out.println("last key : "+ts.lastKey()); // 4
           // ceiling and floor keys and entries
           System.out.println("ceiling key : "+ts.ceilingKey(2)); 
           System.out.println("floor key : "+ts.floorKey(3)); 
           System.out.println("ceiling entry : "+ts.ceilingEntry(2)); 
            System.out.println("floor entry : "+ts.floorEntry(2));
            // subMap();
             System.out.println("subMap from 1 to 2 key : "+ts.subMap(1,2)); 
            
           
    }
}
