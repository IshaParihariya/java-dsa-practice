/*
Hash Map : 
stores data in key-value pairs

Syntax : 
HashMap<keyType , valueType> name = new HashMap<>();

one null key allowed
multiple null values allowed
not sorted
internally uses hashing
*/
package javacollections_;

import java.util.HashMap;

public class Map_HashMap
{
    public static void main(String[] args)
    {
        HashMap<Integer , String> hs= new HashMap<>();
        hs.put(4,"Isha");
        hs.put(2,"Mohit");
        hs.put(3,"Kunal"); // not sorted**
        hs.put(1,"Isha"); // no duplicate keys allowed
        System.out.println(hs); //{1=Isha, 2=Mohit, 3=Kunal, 4=Isha}
        System.out.println(hs.remove(2));//removes key and value
        System.out.println(hs); // after removal of key 2 and value
        System.out.println(hs.get(1)); // gets value of the key
    }
}
