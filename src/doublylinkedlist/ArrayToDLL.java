// array to doubly linked list

package doublylinkedlist;


class Array_to_DLL
{
    public Node array2dll(int[] arr)
    {
        // if null DLL
        if(arr.length == 0)
        return null;
        
        
        Node head=new Node(arr[0]); // head fixed
        Node mover=head;
        // for loop as its an array initially
        for(int i=1;i<arr.length;i++)
        {
            Node temp=new Node(arr[i]);
            mover.next=temp;
            temp.prev=mover;
            mover=temp;
        }
        return head;
    }
}

public class ArrayToDLL
{
    public static void main(String[] args)
    {
        Array_to_DLL a=new Array_to_DLL();
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
        temp=temp.prev;
    }
    
    System.out.println("NULL");
    }
}
