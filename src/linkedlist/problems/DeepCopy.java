
package linkedlist.problems;

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution 
{
    // Deep copy = same values and same pointer structure, but completely new Node objects with no pointers back into the original list.
    public Node copyRandomList(Node head) 
    {
        //this were just doing the refernce thing not a whole diff node being a copy
        /*   
        Node temp=head;
        Node headNew=new Node(temp.val);
        int count=1;

        while(temp!=null)
        {
            if(count==1)
            {
                //this is only for the head part
                headNew.next=temp.next;
                headNew.random=temp.random;
                count++;
            }

            Node nodeNew=new Node(temp.val);
            nodeNew.next=temp.next;
            nodeNew.random=temp.random;

            temp=temp.next;
        }

        return headNew;*/

        //okay then we will create new Nodes first with values 
        //then we will connect them...

        if(head==null)
        {
            return null;
        }

        Node temp=head;

        Map<Node,Node> map=new HashMap<>();

        //creating new nodes storing em in the map with the old node...

        while(temp!=null)
        {
            map.put(temp,new Node(temp.val));  
            temp=temp.next;
        }

        //now we need to connect each new nodes with each others..
        temp=head;
       // Node newHead=new Node(temp.val);
       Node newHead=map.get(head);
       newHead.next=map.get(temp.next);
       newHead.random=map.get(temp.random);
        //int count=0;

        while(temp!=null)
        {

           /* if(count==1)
            {
                //newHead
                Node newHead=map.remove(temp);
                newHead.next=temp.next;
                newHead.random=temp.random;
                count++;
                
            }*/

            //MOST IMPORTANT PART IS HERE BRO!!!
            //not refernec but copying actually DEEP COPY

            Node newNode=map.get(temp); //this will return the associated value with the key
            newNode.next=map.get(temp.next);
            newNode.random=map.get(temp.random);

            temp=temp.next;
        }

 return newHead;
    }
}
public class DeepCopy {
    
}
