/*
Tree Set : A data structure that stores the elements in AN SORTED ORDER 

syntax : TreeSet<> name= new TreeSet<>();

TreeSet does not allow null because it needs to compare elements for sorting, and null cannot be compared.**

1. higher(x)

Returns the smallest element that is STRICTLY greater than x

2. lower(x)

Returns the largest element that is STRICTLY less than x

## higher / lower ≠ ceiling / floor

The key difference is whether the value x itself is allowed.

*/
package javacollections_;
import java.util.TreeSet;
public class Set_TreeSet 
{
    public static void main(String[] args)
            
    {
        TreeSet<Character> ts= new TreeSet<Character>();
        ts.add('a');
        ts.add('b');
        ts.add('c');
        ts.add('d');
        ts.add('e');
        for (var hi: ts)
        {
            System.out.print(hi+" ");
        }
        System.out.println();
        //ceiling : greater than n and lesser than others
        System.out.println("ceiling of c : "+ts.ceiling('z')); // < n
        //floor : lesser than n and greter than others
        System.out.println("floor of d : "+ts.floor('z')); // > n
    }
}
