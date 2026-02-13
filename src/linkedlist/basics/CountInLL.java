/*
counting the number of elements in the Linked List 
or 
length of the LL
*/
package linkedlist.basics;

// Node class
class Node
{
    int data;
    Node next;
    
    // constructor
   Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}

// for counting
class Count_
{
    // method and giving parameter head here
    public int count(Node head)
    {
        int count=0;
        
        Node temp=head;
        while(temp!=null)
        {
            // add count
         count++;
         // now temp = temp.next i.e., the address of the next one 
         temp=temp.next;
        }
        
        return count;
    }
}
public class CountInLL 
{
    public static void main(String[] args)
    {
        Node n5= new Node(2,null);
        Node n4= new Node(2,n5);
        Node n3= new Node(2,n4);
        Node n2= new Node(2,n3);
        Node n1= new Node(2,n2);
        
        Count_ n=new Count_();
        int count=n.count(n1);
        System.out.println(count);
    }
}
