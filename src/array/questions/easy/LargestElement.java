/*
Given an array of integers nums, return the value of the largest element in the array
*/
package array.questions.easy;

class LargestElement_
{
    public int largestElement(int[] arr)//method
    {
        int l=arr[0];
        int n=arr.length;
        for(int i=0;i<=n-1;i++)
        {
            if(l<arr[i])
            {
                l=arr[i];
            }
        }
       return l; 
    }
}
public class LargestElement 
{
    public static void main(String[] args)//main
    {
        LargestElement_ l=new LargestElement_();
        int largestElement=l.largestElement(new int[]{1,20,11,30,45,17,48,0});
        System.out.println("largestElement : " +largestElement);
    }
}
