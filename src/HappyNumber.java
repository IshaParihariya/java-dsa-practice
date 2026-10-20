class Solution 
{
//     If the sequence reaches 1, the number is happy. We stop.



// If the sequence reaches 4, it enters a repeating cycle and will never reach 1. We stop.



// If the sequence reaches any other number, we keep calculating.
    public boolean isHappy(int n) 
    {
        int sum=n;
        while(sum!=1 && sum!=4)
        {
            String str=Integer.toString(sum);
            sum=0;
            for(int i=0;i<str.length();i++)
            {
                char c=str.charAt(i);
                int sqaure= (c-'0') * (c-'0'); 
                sum=sum+sqaure;
            }
        }

        return sum==1; //return true if sum==1 else false
    }
}
public class HappyNumber {
    
}
