class Solution 
{
    public boolean isPowerOfThree(int n) 
    {
        /*
        // method 1 
        // n =3^x 
        // keep dividing n by 3 
        // if u get 1 at last then return true
        // else false

        // for negative number cases
        if(n<=0)
        {
            return false;
        }

        //for n>0
        while(n%3==0) //iske baad divide ni hoyega
        {
            n=(n/3);
        }

        if(n==1)
        {
            return true;
        }
        else
        return false;

        */



        // method 2
        // logarithamic
        // n = 3^x
        // log n = x log 3
        // x = (log n/log 3)

       

       // method 3
       // intervoiew and leetcode fav!!
       /*
       1162261467 is the largest power of 3 that fits in a 32-bit integer (3^19). Since it has only one prime factor (3), any positive divisor of this number must also be a power of 3. Therefore, if n is positive and divides 1162261467 exactly, then n must be a power of 3
       */

       return n > 0 && 1162261467 % n == 0;

    }
}
public class PowerOF3 {
    
}
