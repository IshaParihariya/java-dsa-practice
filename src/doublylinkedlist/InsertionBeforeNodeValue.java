// insert this before Node value

package doublylinkedlist;

class InsertBeforeValue
{
    public Node insert(Node head, int value, Node insert)
    {
        // if DLL is empty
        if(head == null)
        {
            System.out.println("DLL is empty");
            return head;
        }

        Node temp = head;
        boolean found = false;

        // search for the given value
        while(temp != null)
        {
            if(temp.data == value)
            {
                found = true;
                break;
            }
            temp = temp.next;
        }

        // if value not found
        if(found == false)
        {
            System.out.println("Value not found");
            return head;
        }

        // if inserting before head
        if(temp.prev == null)
        {
            insert.next = head;
            insert.prev = null;
            head.prev = insert;
            return insert;
        }

        // general case
        insert.next = temp;
        insert.prev = temp.prev;

        temp.prev.next = insert;
        temp.prev = insert;

        return head;
    }
}

public class InsertionBeforeNodeValue
{
    public static void main(String[] args)
    {
        InsertBeforeValue obj = new InsertBeforeValue();

        // creating nodes
        Node end = new Node(5);
        Node d = new Node(4);
        Node c = new Node(3);
        Node b = new Node(2);
        Node head = new Node(1);

        // insert node
        Node insert = new Node(0);

        // next pointers
        head.next = b;
        b.next = c;
        c.next = d;
        d.next = end;

        // prev pointers
        b.prev = head;
        c.prev = b;
        d.prev = c;
        end.prev = d;

        // insert before value 3
        head = obj.insert(head, 3, insert);

        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}