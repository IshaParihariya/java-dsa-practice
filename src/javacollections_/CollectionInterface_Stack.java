
/*
stack  :

syntax : Stack<> name = new Stack<>();
LIFO
push : add
pop : remove 
peek : peeking the last element 

Note:
stack , linked list , array list and vector all need to override the toString() if prinitng dircetly**
also all can have user defined data types**
*/
package javacollections_;
import java.util.Stack;
/**
 *
 * @author ishh1
 */
public class CollectionInterface_Stack 
{
    public static void main(String[] args)
    {
        //stack
        //LIFO : Last In First Out
        Stack<Integer> st=new Stack<Integer>();
        st.push(1);//adding int in the stack 
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);//printing the stack direclty
        System.out.println("before poping : "+st.peek()); // peek the last element
        st.pop(); //removes last element 
        System.out.println("after poping : "+st.peek()); // peek the last element
    }
}
