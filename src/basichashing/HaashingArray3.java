
package basichashing;

public class HaashingArray3 
{
    public static void main(String[] args)
    {
        char c[]={'a','b','a','c','d','a','b','c','c','a','d'};
        
        char min='a';  // d - a+ 1 = 100 - 97 + 1 = 4 
        char max='d';
        int h[]=new int[max-min+1];
        
        for(char x:c)
        {
            h[x-'a']++; 
            // indeces :
            // 'a' -'a' =0
            // 'b' -'a' =1
            // 'c'- 'a' =2
            // 'd' -'a' =3
        }
        for(int i=0;i<h.length;i++)
        {
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