/*
Recursion : 
a function caling itself , until a specified conidtion is met 
*/
package recursion;

public class RecursionBasic 
{
    // basic recursion 
//    public static void fun()
//    {
//        System.out.println("1");
//        fun();
//    }
    
    // recursion with a base condition
    public static int count=0;
    public static void f()
    {
        if(count==10)
        {
           return; 
        }
        else
        {
            System.out.print(count+" "); //
            count++;
            f();
        }
    }
   public static void main(String[] args)
   {
      // fun();
       f();
   }
}
