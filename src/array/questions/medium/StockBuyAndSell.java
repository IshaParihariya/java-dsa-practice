/*
Best time to buy and sell stock

Given an array arr of n integers, where arr[i] represents price of the stock on the ith day. Determine the maximum profit achievable by buying and selling the stock at most once. 

The stock should be purchased before selling it, and both actions cannot occur on the same day.


Example 1

Input: arr = [10, 7, 5, 8, 11, 9]

Output: 6

Explanation: Buy on day 3 (price = 5) and sell on day 5 (price = 11), profit = 11 - 5 = 6.

Example 2

Input: arr = [5, 4, 3, 2, 1]

Output: 0

Explanation: In this case, no transactions are made. Therefore, the maximum profit remains 0.

Now your turn!

Input: arr = [3, 8, 1, 4, 6, 2]


*/
package array.questions.medium;
/*
arr[i] : price 
i th : day 
max profit acheivable
*/

class Stockbuyandsell_
{
    public void stockbuysell(int[] arr)
    {
        int max=0;
        int temp=0;
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr.length;j++)
           {
               if(arr[j]>arr.length-1)
               {
                   break;
               }
               max=arr[arr[j]]-arr[j];  
           }
           if(max<temp)
               {
                   max=temp;
               }
           temp=max;
           max=0;
       }
       System.out.println(max);
    }
}
public class StockBuyAndSell 
{
    public static void main(String[] args)
    {
        Stockbuyandsell_ s=new Stockbuyandsell_();
        s.stockbuysell(new int[]{10, 7, 5, 8, 11, 9});
    }
}
