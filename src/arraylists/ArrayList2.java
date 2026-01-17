
package arraylists;

import java.util.*;

public class ArrayList2 
{
    public static void main(String[] args)
    {
        //IMPORTANT:
        /* HOW IT WORKS INTERNALLY ??
        ->> the size is fixed lets say capacity = 5 
        ->> when it is full it might double the size i.e., new capacity = 10
        ->> it keeps being like this so fixed size but it keep increasing
        */
        
        ArrayList<Integer> arr=new ArrayList<>();  //array declared and initialised
        
        System.out.print("Enter the i/p: ");
        
        Scanner sc =new Scanner(System.in);
        
        
        // using arr.add
        for(int i=0;i<5;i++)   // size = 5  
        {
            arr.add(sc.nextInt());  // taking i/p
            
        }
        System.out.println("ArrayList : "+ arr);  // printing arrayList
        // using arr.get
        for(int i=0;i<5;i++)   // size = 5  
        {
              System.out.print(arr.get(i)+" ");  // taking i/p and printing at the same time
            
        }
        
    }
    
}
