/*
reversing an array with recursion
*/
package recursionbasicproblems;
import java.util.*;
public class Problem4 
{
        
         // reversing using while loop
    public static void whileloop()
    {
        
       int temp;
          int a[]={1,2,3,4,5,6,7,8,9};
        
          int start=0;
         int last=a.length-1;
         int mid=start+(last-start)/2;
        while(start<=last) // when this conditions happens loop will continue or else not
        {
               temp=a[start];
               a[start]=a[last];
               a[last]=temp;
               start++;
               last--;
                
        }
        System.out.println("reversing with while loop : "+Arrays.toString(a));
        
    }
    
     // reversing using for loop
       public static void forloop()
       {
           
       int temp;
          int a[]={1,2,3,4,5,6,7,8,9};
        
          int start=0;
         int last=a.length-1;
         int mid=start+(last-start)/2;
        for(int i=start;i<mid;i++)
        {
            int j=last-i;
            
            
               temp=a[i];
               a[i]=a[j];
               a[j]=temp;
           
        }
        System.out.println("reversing with for loop : "+Arrays.toString(a));
       }
       
       static int temp;
          static int a[]={1,2,3,4,5,6,7,8,9};

       // reversing with recursion
       public static void recursion(int start,int last)
       {
                 
         // base condition
         if(start>=last)
         {
             return ;
         }
         temp=a[start];
         a[start]=a[last];
         a[last]=temp;
         //calling the method again
         recursion(start+1,last-1);
       }
       
    public static void main(String[] args)
    {
         int b[]={1,2,3,4,5,6,7,8,9};
         
         System.out.println("array before reversing : "+ Arrays.toString(a));
        //while loop
        whileloop();
        //for loop
        forloop();
        //recursion
       
        
        recursion(0,b.length-1);
        System.out.println("reversing with recursion : "+Arrays.toString(a));
    
    }
}
