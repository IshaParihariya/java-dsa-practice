/*
linked list is dynamic
A linked has nodes and each node has data and the address of the next data
so it cannot be stored like that as two diff data types
so we take seld-defined data type 
Struct but as struct cannot have the oops concepts 
so instead we take class as a self-defined data 
*/
package linkedlist;

// self-defined data 
class Node
{
    int data; // data 
    Node next; // address of next data
    
    Node(int data1,Node next1) // constructor
    {
        this.data=data1;
        this.next=next1;
    }
    
    // there can be many constructors 
    
    Node(int data1) // constructor
    {
        this.data=data1;
        this.next=null; // null so end here 
    }
}
public class LinkedList
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4};
        Node m=new Node(6,null);  // secound one 
        Node n=new Node(6,m); // first one
        System.out.println(n.data); // **
        System.out.println(n.next); // **
    }
}
