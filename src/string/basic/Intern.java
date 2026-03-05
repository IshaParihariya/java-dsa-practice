/*
intern() method returns the reference of a string from the String Pool.

If the string already exists in the pool, its reference is returned.
If not, the string is added to the pool and the reference is returned.

Ex 1 :
String a = "Hello";
String b = new String("Hello").intern();

a == b → true
because both refer to the same object in the String Pool.



ex 2 :
/*
s1 = "Java" → stored in String Pool
s2 = new String("Java") → new object in heap
s3 = s2.intern() → returns reference from String Pool

s1 == s2 → false
s1 == s3 → true

*/
package string.basic;

public class Intern 
{
    public static void main(String[] args)
    {
        String s1 = "Java"; // in String pool
String s2 = new String("Java"); // heap
String s3 = s2.intern(); // string pool

System.out.println(s1 == s2); // false
System.out.println(s1 == s3); // true
    }
}
