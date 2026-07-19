
package fipkartGrid8;

class BTTSABS
{
    public int maxProfit(int[] arr)
    {
        int minPrice=arr[0];
        int maxProfit=0;
        for(int i=0;i<arr.length;i++)
        {
            if(minPrice>arr[i])
            {
                minPrice=arr[i];
            }
            maxProfit=Math.max(maxProfit,arr[i]-minPrice);
        }
    
return maxProfit;
    }
}
public class BestTimeToSellAndBuyStock 
{
    
}
