// conversion : decimal to binary

/*
Primitive Type vs Wrapper Class (int vs Integer)

int (Primitive Data Type)

int is a primitive data type in Java.

It stores the actual numeric value.

It is faster and uses less memory.

It cannot store null.

It does not have methods.

Example:
int a = 10;

Integer (Wrapper Class)

Integer is a wrapper class for the primitive type int.

It stores the value inside an object.

It belongs to the java.lang package.

It can store null.

It provides many useful methods.

Example:
Integer a = 10;

Why Wrapper Classes are Needed

Java collections (like ArrayList, HashMap) store objects, not primitives.

Example (Valid):
ArrayList list = new ArrayList<>();

Example (Invalid):
ArrayList list = new ArrayList<>(); // Not allowed

Autoboxing

Automatic conversion from primitive to wrapper class.

Example:
int a = 5;
Integer b = a; // Autoboxing

Unboxing

Automatic conversion from wrapper class to primitive.

Example:
Integer a = 5;
int b = a; // Unboxing

Common Wrapper Classes

Primitive Wrapper Class
int Integer
double Double
char Character
boolean Boolean
long Long
float Float
short Short
byte Byte

Useful Integer Class Methods

Integer.parseInt("123") // Converts String to int
Integer.toBinaryString(10) // Converts number to binary
Integer.max(5,10) // Returns maximum value

Performance Difference

Primitive types (int) are faster and use less memory.
Wrapper classes (Integer) are objects, so they are slightly slower.

Primitive → faster
Wrapper → more features
*/
package bitmanupilation;

import java.util.ArrayList;


class DecimaltobinaryConversion
{
    // with arraylist
    public void decimaltobinary(Integer a)
    {
        // string to store the modulo
       // String str="";
        
        
        // arraylist to store the modulo
         ArrayList<Integer> str = new ArrayList<>();
         
        // for the first value 
        Integer modulo1=a%2;
        
        str.add(modulo1);
        
        while(a!=1)
        {
            a=a/2;
            str.add(a%2);
        }
        
        System.out.println(str.reversed());
    }
    
    
    // with string
    
    public String decimaltobinaryconversion(int a)
    {
        String str="";
        
        int modulo1=a%2;
        str=String.valueOf(modulo1);
        
        while(a!=1)
        {
            a=a/2;
            str=str+String.valueOf(a%2);
        }
        
        // reverse the string
        String reversed="";
        for(int i=str.length()-1;i>-1;i--)
        {
         reversed=reversed+str.charAt(i);
        }
        
        // or 
        /*
        ***
        String result = new StringBuilder(str).reverse().toString();
        
        here : Why we do this:
Because StringBuilder can modify strings, while String cannot.
Strings in Java are immutable (cannot be changed).
        
        StringBuilder is a class in Java used to create and modify strings efficiently.
        Unlike String, it is mutable.
        Mutable = its content can change without creating a new object.**
        
        
        String can’t be changed; instead Java changes the reference to a new object.
        
        example: 
        
        public class Test
{
    public static void main(String[] args)
    {
        String str = "Hello";
        System.out.println(str);

        str = str + " World";
        System.out.println(str);
    }
}
        
        
        .toString()
This converts the StringBuilder object back to a String.
        */
        return reversed;
    }
}
public class DecimalToBinary 
{
    public static void main(String[] args)
    {
         DecimaltobinaryConversion obj=new  DecimaltobinaryConversion();
        obj.decimaltobinary(13);
        String str=obj.decimaltobinaryconversion(13);
        System.out.println(str);
    }
}
