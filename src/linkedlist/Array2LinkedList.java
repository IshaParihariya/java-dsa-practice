/*
converting an array to a linked list
*/
package linkedlist;

class ArrayToLL
{
   public Node array2ll(int[] arr) // will return Node
           {
               Node head=new Node(arr[0]); // head of the ll will be arr[0]
               Node mover=head; // initially mover will be the head pointing to the null
               for(int i=1;i<arr.length;i++)
               {
                   Node temp=new Node(arr[i]); // temp 
                   mover.next=temp;
                   mover=temp;
               }
               return head;
           }
}
public class Array2LinkedList
{
   public static void main(String[] args)
   {
      int arr[]={1,2,3,4};
       ArrayToLL a=new ArrayToLL();
       Node n=a.array2ll(arr); // retuens Node*
       System.out.println(n.data);
   }
}
