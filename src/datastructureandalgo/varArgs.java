

//variable length arguments
// String ...v ->> should come at last its a rule kinda stuff
package datastructureandalgo;

import java.util.Arrays; //for Arrays.toString(v)

public class varArgs 
{
    public static void main(String[] args)
    {
        fun(1,2,3,4,6,7,90);
        multiple(1,2,"isha","mohit","kunal");  
    }
    
    static void fun(int ...v)  //can give as many i/p as u want 
    {
        System.out.println(Arrays.toString(v));
    }
    
    static void multiple(int a,int b,String ...v)    //fixed two plus more
    {
        System.out.println(Arrays.toString(v));
    }
}
