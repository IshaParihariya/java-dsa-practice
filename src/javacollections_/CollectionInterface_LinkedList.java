/*
LinkedList : similar to ArrayList 

syntax : LinkedList<> name = new LinkedList<>();

in ArrayList adding from end is efficient ( can add from both sides but will shift the elements so SLOWER) 
but in LinkedList as no shifting of eleememts happens so you can add from both sides (FASTER)


*/
package javacollections_;

import java.util.LinkedList;
public class CollectionInterface_LinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Character> ll=new LinkedList<>();
        // add integer
        ll.add('s');
        ll.add('b');
        
        ll.add(2,'d');
       ll.addFirst('j'); // add in the start
       ll.addLast('k'); //add in the last
 
       ll.removeFirst();//remove first
       ll.removeLast();//removes and return the last element
        System.out.println(ll);
        ll.clear();//clear
        
    }
}
