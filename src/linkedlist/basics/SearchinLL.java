/*
seach an element in the LL

*/
package linkedlist.basics;

class Node
{
    int data;
    Node next;
    
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}

class Search
{
    public void searchinLL(Node head,int search)
    {
       Node temp=head; // NOTE : NEVER MOVE THE HEAD
       
       int position=1;// for the position
       
       boolean found=false;
       
       while(temp!=null)
       {
           // searching 3
           if(temp.data==search)
           {
               
               found=true;
               System.out.println("search found in the LL at "+position);
           }           
           temp=temp.next;
           position++;
       }
       
       if(found==false)
       System.out.println("Not found");
    }
}
public class SearchinLL 
{
    public static void main(String[] args)
    {
        Node n5= new Node(5,null);
        Node n4= new Node(4,n5);
        Node n3= new Node(3,n4);
        Node n2= new Node(2,n3);
        Node n1= new Node(1,n2);
        
        Search n=new Search();
        
        n.searchinLL(n1,3);
        
    }
}
