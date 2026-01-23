/*
palindrom : 
A palindrome number is a number that reads the same forward and backward.

131
242
363
 */
package recursionbasicproblems;
public class Problem5Palindrom
{
    public static void palindrom(int start,int last,String n)
    {
      if(start>=last)
      {
          System.out.println("its a palindrom");
          return;
      }
      if(n.charAt(start)!=n.charAt(last))
      {
          System.out.println("its not a palindrom");
          return;
      }
      palindrom(start+1,last-1,n);
    }
    public static void main(String[] args)
    {
        
        String n="MADAM";
        palindrom(0,4,n);    
    }
}
