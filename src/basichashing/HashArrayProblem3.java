/*
sum of highest and lowest frequency
*/
package basichashing;

public class HashArrayProblem3 
{
    public static int SHLF(int arr[]) // method
    {
        // size of the frequency array
        int max=arr[0];
        for(int i=0;i<arr.length;i++) 
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        // frequency array 
        int freq[]=new int[max+1]; // size = max+1
        
        // for the frquency of each element 
        for(int x:arr)
        {
            freq[x]++;
        }
        
        // for max. frequency
        int maxfreq=freq[0];
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>0)
            {
            if(maxfreq<freq[i])
            {
                maxfreq=freq[i];
            }
            }
        }
        // for min. freq
        int minfreq=Integer.MAX_VALUE;// Integer.MIN_VALUE = -2147483648
                                      //Integer.MAX_VALUE = 2147483647
        //
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>0)
            {
            if(minfreq>freq[i])
            {
                minfreq=freq[i];
            }
            }
        }
        
        // sum of max and min frequency
        int sum = minfreq+maxfreq;
        
        return sum;
    }
    
    public static void main(String[] args) // main method
    {
        int sum=SHLF(new int[]{1,2,3,1,4,5,6,7,2,3,2,3,3,4}); // method call
        
        System.out.println("sum of max and min frequency : "+sum);
    }
}
