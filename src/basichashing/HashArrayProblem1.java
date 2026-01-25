/*
find the maximum frquency of the elements in the array n 
if there are same frequencies of different elements the return the smallest element
*/
package basichashing;

public class HashArrayProblem1
{
    public static int hashing(int n[]) // given n[] array
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
        int max1=freq[0];
        int i;
        int index=0;
        for( i=1;i<freq.length;i++) // finding max freq
        {
            
            if(max1<freq[i]||(max1==freq[i]&&i<index)) //**
            {
                max1=freq[i];
                 index =i; // this is the element with max frequency    
            }
            else return -1;
        }  
       
        return index;
    }
    public static void main(String[] args)
    {
        int n=hashing(new int []{12,12,12,3,3,4,4,5,5});
        System.out.println(n);
    }
}
