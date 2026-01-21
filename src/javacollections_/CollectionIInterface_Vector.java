/*
Vector : (similar to ArrayList just Thread SAFE**)
syntax : Vector<> name = new Vector<>();
*/
package javacollections_;

import java.util.Vector;
public class CollectionIInterface_Vector 
{
    public static void main(String[] args)
    {
        Vector<Integer> v = new Vector<Integer>();
        
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        System.out.println(v);
        
        Vector<Character> a = new Vector<Character>();
        
        a.add('a');
        a.add('a');
        a.add('a');
        a.add('a');
        System.out.println(a);
        
    }
}
