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
        int max=arr[0];
        int secoundmax=arr[1];
        // if the array is having only one or lesser than one element then return -1
        if(arr.length<2)
        {
            System.out.println("-1");
            return;
        }
        for(int  i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                secoundmax=max;
                max=arr[i];
            }
            else if(arr[i]>secoundmax && max!=arr[i])
            {
                secoundmax=max;
            }
        }
        System.out.println(secoundmax);
    }
}
public class SecoundLargestElement 
{
    public static void main(String[] args)
    {
        SecoundLargestElement_ l=new SecoundLargestElement_();
        l.secoundLargestElement(new int[]{1,20});
     
    }
}
