 class Solution {
    public boolean divisorGame(int n) {

        //chatgpt showed me the pattern thing 
        // here that n is odd the alice losses and n is even then alice wins so we can directly do..
        // return n%2==0; 
        //but here i solved it as per me..

        //odd count => alice turn so return true
        //else false

        int count=0; 

        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
                n=n-i;
                i--;
            }
        }

        if(count%2==0)
        {
            return false;
        }
        

        return true;
        
    }
}
public class DivisorGame {
    
}
