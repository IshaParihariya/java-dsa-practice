package linkedlist.operations.insertion;

class Node {
    int data;
    Node next;
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class InsertionAtKthPositionHelper {
    public Node insert(Node head, int position, int value) {

        // Case 1: empty list
        if(head == null) {
            if(position == 1) return new Node(value, null);
            else {
                System.out.println("Invalid position");
                return null;
            }
        }

        Node insert = new Node(value, null);

        // Case 2: insert at head
        if(position == 1) {
            insert.next = head;
            return insert;
        }

        // Case 3: insert in middle or end
        Node del = null;
        Node temp = head;
        int count = 1;

        while(temp != null) {
            if(count == position) {
                // insert between del and temp
                del.next = insert;
                insert.next = temp;
                return head;
            }
            del = temp;
            temp = temp.next;
            count++;
        }

        // Case 4: insert at end (position = length + 1)
        if(count == position) {
            del.next = insert;
        } else {
            System.out.println("Invalid position");
        }

        return head;
    }
}

public class InsertionAtKthPosition {
    public static void main(String[] args) {
        InsertionAtKthPositionHelper helper = new InsertionAtKthPositionHelper();

        Node tail = new Node(4, null);
        Node n3 = new Node(3, tail);
        Node n2 = new Node(2, n3);
        Node head = new Node(1, n2);

        head = helper.insert(head, 2, 0); // insert 0 at 2nd position

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
