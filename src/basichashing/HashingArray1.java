/*
using char
*/
package basichashing;

public class HashingArray1 
{
    public static void main(String[] args)
    {
        char c[]={'a','b','a','c','d','a','b','c','c','a','d'};
        
        int freq[]=new int['d'+1]; // highest char here is d so size = d+1 in ASCII value ofc
        /*
        as here we took d+1 size so it will be 101 as d=100 in ASCII so much space its not even needed**
        */
        for(char x:c)
        {
            freq[x]++;
        }
        
        for(int i=0;i<=freq.length-1;i++)
        {
            if(freq[i]>0)
           System.out.println((char)i+" -> "+freq[i]);
        }
    }
}
/*
a -> 4
b -> 2
c -> 3
d -> 2
*/