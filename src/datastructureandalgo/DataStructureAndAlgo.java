 
// Do again its incorrect!!!!!!!!!

// ARMSTRONG NUMBER ->> ( 153 => 1^3 + 5^3 + 3^3 =>> 153 hence an armstrong number )
// NOTE : for 3 digit no. degree is 3 (cube)
// for 2 digit no. it will be (sqaure)
package datastructureandalgo;

import java.util.*;

public class DataStructureAndAlgo 
{
   static int length;
   static String string; // to store the int in string form
    public static void main(String[] args)
    {
  
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        
        //int length= a.length();   int is a primitive data type so it doesnt have methods but strings have so convert to string first
        
         length=String.valueOf(a).length();  // converted to string then method is used
         string=String.valueOf(a);
 
       //  int length = String.valueOf(Math.abs(a)).length();   Math.abs(a) changes -ve to +ve 

        
        armstrong(a);
      
    }
    
     static void armstrong(int a)
{ int num1=0; // to store the multiplication of the num for length's time
//NOTE : gave it value 0 because if loop doesnt run then its unsafe so java needs u to do this 
 char num;     //storing each character of the string
 int sum=0;
     if(a<0)
    {
      System.out.println("Number is negative so it is not an armstrong number");
    }
     else 
     {
         if(length==1)
         {
             System.out.println(a +" is an armstrong number");  
         }
         
         else if(length>1)
         {
             for(int i=0;i<length;i++) //for accesing and storing each char of the string
             {
                num = string.charAt(i);
                   
                for(int j=1;j<=length;j++) //for sqaure or cube etc of the char
                {
                    int digit = Character.getNumericValue(num);

                     num1 =num*digit;  
                     System.out.println(num1);
                     
                }
                
               
                System.out.println(" + ");
                 sum=sum+num1;
              }
             
             if(sum==a)
            {
                System.out.println(a +"is an Armstrong number");
            }
             else
             {
                 System.out.println("It isnt an Armstrong number");
             }
         }
     }
    
    
    
        
}
    
}
