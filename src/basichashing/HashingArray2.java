
package basichashing;

public class HashingArray2 
{
    public static void main(String[] args)
    {
        char c[]={'a','b','a','c','d','a','b','c','c','a','d'};
        
        int h[]=new int[26]; // as al small chars so can take 26 size as there r 26 chars small ones
        
        for(char x:c)
        {
            h[x-'a']++;
        }
         for(int i=0;i<=h.length-1;i++)
        {
            if(h[i]>0)
           System.out.println((char)(i+'a')+" -> "+h[i]);
        }
    }
}
/*
a -> 4
b -> 2
c -> 3
d -> 2
*/