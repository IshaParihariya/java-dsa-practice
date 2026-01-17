

 // array :->> int[] A=new int[size]; 

 // array :->> int[] A =[1,2,3,4,5};
 
// refernce are stored in stack and objects in heap memory!
 
/* NOTE: MEMORY:
1.  array objects are in heap
2.  heap objects are not continous
3.  dynamic memory allocation 
hence : array objects in java may not be continous (jagah in between the dabba)  ->> it depends on JVM 
(in c and cpp it is continous)
-> new keyword is used to create an object
*/

package array;


public class Arrays 
{
    public static void main(String[] args)
    {
      int[] A;      // declaration of array A is getting defined in the stack 
      //         ->> declaration happens at compile time (LHS) 
      A= new int[5]; //initialisation:  here the object is being created in the memory ( HEAP ).
      //         ->> initialisation happens at run time (RHS)
      
      /* NULL : 
      -> it is a special literal 
      -> by default value of what refernce variaable point to 
      
      int num= null; ->>  primitives cannot have null like this 
      String str= null;  ->> non-primitives can have null like that
      
      */
    }
}
