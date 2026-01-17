


// quite confusion go through for loop and if else like where to add else and what over there????



package linearsearch_;
import java.util.*;
public class LinearSearchString 
{
      static String result= "Target not found";
    // search for a character iin the string using functions here
    public static void main(String[] args)
    {
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the str: "); // enter string
    String str=sc.next();
    System.out.println();
    System.out.println("--------------------------"); 
    System.out.print("Enter the char: ");  // enter char
    
    char target=sc.next().charAt(0);// char is taken as i/p like this 
    
    System.out.println();
    System.out.println("--------------------------"); 
    System.out.println();
    
   
    function(str,target);  //function called
    }
    
    static String function(String str,char target)
    {  
      for(int i=0;i<str.length();i++)   /*
                                        -> for each loop can be used as well 
                                   -> for each loop needs an array so convert string to array then use it 
          
                                             for (char element : str.toCharArray())
                                        {
                                            if(element == target)
                                                {
                                                }
                                         }
                                        */
      {
          char element=str.charAt(i);
          if (element==target)
          {
              System.out.println(target+ " found at index "
                      + ": "+ i);
          }
      }
        return result;
       }
     }    
