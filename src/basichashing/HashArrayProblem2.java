/*
Find the secound most occuring element from the array n
*/
package basichashing;

public class HashArrayProblem2
{
     public static int secoundMostOccuringNumber(int n[]) // given n[] array
     {
         int max=n[0]; // finding max element of the n array
        for(int i=1;i<n.length;i++)
        {
          if(max<n[i])
          {
              max=n[i];   
          }
        }
        int freq[] =new int[max+1];
        
        for(int a:n) // finding freuency of each element 
        {
            freq[a]++;
        }
        int max1=freq[0]; // first largest element frequency
        int i;
        
        int index=0;
        
        for( i=0;i<freq.length;i++)
        {
            if(max1<freq[i])
            {
                max1=freq[i];
                index=i;
               
            }
        }
        
        int max2=freq[0]; // secound largest element freuency
        for(i=0;i<freq.length;i++)
        {
           if(max1>freq[i]&&max2<freq[i])
           {
               max2=freq[i];
               index=i;
               
           }
        }
        
        // for smallest element with secound largest occurence or frequency
        for(i=0;i<freq.length;i++)
        {
            if(freq[i]==max2)
            {
               index=i; 
               break;
            }
        }
        return index;
     }
    public static void main(String[] args)
    {
        int n=secoundMostOccuringNumber(new int []{12,12,12,3,3,4,4,5,5});
        System.out.println(n);
    }
}
