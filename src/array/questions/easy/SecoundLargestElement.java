// incomplete couldnt solve 
/*
Given an array of integers nums, return the second-largest element in the array.
If the second-largest element does not exist, return -1.
*/
package array.questions.easy;

class SecoundLargestElement_
{
    public void secoundLargestElement(int[] arr)
    {
        int n=arr.length;
        int l=arr[0];
        for(int i=0;i<n;i++) //largest element
        {
             if(l<arr[i])
            {
                l=arr[i];
            }
        }
    }
}
public class SecoundLargestElement 
{
    public static void main(String[] args)
    {
        SecoundLargestElement_ l=new SecoundLargestElement_();
        l.secoundLargestElement(new int[]{1,20,11,30,45,17,48,0});
     
    }
}
