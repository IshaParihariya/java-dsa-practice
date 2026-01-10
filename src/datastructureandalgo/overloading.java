
// NOTE :-> SHADOWING AND SCOPE LERAN IT THEORETICALLY AS WELL
//overloading

package datastructureandalgo;

import java.util.Arrays;

public class overloading 
{
     public static void main(String[] args)
    {
        fun("Isha"
                + "Mohit"
                + "Kunal"
                + "Harshal"
                + "Hitansh"
                + "Trisha"
                + "Vibhor");
        
        fun(1,2,3,4,5,6,7,8,9,10); //in function overloading at compile time will automatically decide which function to run
    }
    
     static void fun(int... a)
     {
         System.out.println(Arrays.toString(a));   /* OUTPUT ->> [Ljava.lang.String;@28a418fc [I@5305068a
                                                        if Arrays.toString() not added        */                                                           
     } 
     
     static void fun(String... a)
     {
         System.out.println(Arrays.toString(a));
     }
}
