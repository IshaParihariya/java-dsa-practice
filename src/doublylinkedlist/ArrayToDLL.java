// array to doubly linked list

package doublylinkedlist;

class Node
{
    // data members
    int data;
    Node next;
    Node back;
    
    //constructor
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.back=null;
    }
    
    Node(int data,Node next,Node back)
    {
        this.data=data;
        this.next=next;
        this.back=back;
    }
}

class Array2DLL
{
    public Node array2dll(int[] arr)
    {
        Node head=new Node(arr[0]); // head fixed
        Node mover=head;
        // for loop as its an array initially
        for(int i=1;i<arr.length;i++)
        {
            Node temp=new Node(arr[i]);
            mover.next=temp;
            temp.back=mover;
            mover=temp;
        }
        return head;
    }
}

public class ArrayToDLL
{
    public static void main(String[] args)
    {
        Array2DLL a=new Array2DLL();
        Node n=a.array2dll(new int[]{1,2,3,4,5});
        
        // while loop to print the DLL
        Node temp=n;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
        // here as temp becomes NULL so we need to 
        // move temp to last node again
    temp = n;
    
    while(temp.next != null)
    {
        temp = temp.next;
    } // now here temp becomes the last one
    
    
    // reverse print
    while(temp != null)
    {
        System.out.print(temp.data+" -> ");
        temp=temp.back;
    }
    
    System.out.println("NULL");
    }
}
