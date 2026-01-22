/*
Iterator : ( traversing = go through elements one by one )**
Iterator is a tool that helps us go through collection elements one by one safely.
It points to elements one by one in a collection
It helps you move forward and read each element
It works for all Collection classes**
(List, Set, Queue — NOT Map directly)
Safer than for-each**
Allows removal during traversal**

hasNext() = Is next element present? = returns boolean value 
next() = Return next element

ConcurrentModificationException : **
You are looping through a collection
At the same time, you change (add/remove) it directly
Java gets confused → Exception
SO WE USE ITERATOR FOR REMOVAL NOT THE FOR LOOP DIRECTLY **

while (it.hasNext()) {
    int x = it.next();
    if (x == 20) {
        it.remove(); // safe removal
    }

*/
package javacollections_;

import java.util.*;


public class Iterator_ListIterator
{
    public static void main(String[] args)
    {
        // iterator for diff collections 
        //ArrayList<Integer> list = new ArrayList<>();
        // List<Integer> list = new Stack<>();
        // List<Integer> list = new QueueList<>();
        List<Integer> list = new ArrayList<>();
        
list.add(10);
list.add(20);
list.add(30);

//iterator
Iterator<Integer> it = list.iterator(); // ^   ->   ->   end 
                                        // 10      20      30


// if next element present then loop will continue
while (it.hasNext()) // hasNext() = Is next element present? = returns boolean value 
{
    System.out.println(it.next()); // next() = Return next element
}
    }
}
