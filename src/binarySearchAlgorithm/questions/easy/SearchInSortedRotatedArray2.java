/*

NOT SOLVED TRY AGAIN MANY MISTAKES!!
eg : [0,2,2,2,2,2,2] => [2,2,2,2,0,2,2]
?????

Search in rotated sorted array-II

Given an integer array nums, sorted in ascending order (may contain duplicate values) and a target value k.
Now the array is rotated at some pivot point unknown to you.
Return True if k is present and otherwise, return False.

Example 1

Input : nums = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 3

Output: True

Explanation: The element 3 is present in the array. So, the answer is True.

Example 2

Input : nums = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 10

Output: False

Explanation:The element 10 is not present in the array. So, the answer is False.

*/
package binarySearchAlgorithm.questions.easy;

class SearchinSortedArray2
{
    public boolean searchinsortedarray(int[] arr,int k)
    {
        // if length ==0 
        if(arr.length==0)
        {
            return false;
        }
        // if length is <=2
        if(arr.length<=2 && arr.length>1)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==k)
                    return true;
            } 
                    return false;
        }
        
        //loop for finding pivot index
        boolean arrrotated=false;
        int pivotindex=-1;
        for(int i=0;i<arr.length-1;i++)
        {
           if(arr[i]>arr[i+1])
           {
               arrrotated=true;
               pivotindex=i+1;
           }  
        }
        if(arrrotated==false)
             System.out.println("Array not rotated");  
        
        // binary search for LHS : [7, 8,
        int start=0;
        int end=pivotindex-1;
        int mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            
            if(arr[mid]==k)
            {
                return true;
            }
            if(arr[mid]>k)
            {
               end=mid-1; // end = -1 ??  
            }
            if(arr[mid]<k)
            {
                start=mid+1;
            }
        }
        
        // for RHS : 1, 2, 3, 3, 3, 4, 5, 6]
        
        start=pivotindex;
        end=arr.length-1;
         while(start<=end)
        {
            mid=start+(end-start)/2;
            
            if(arr[mid]==k)
            {
                return true;
            }
            if(arr[mid]>k)
            {
               end=mid-1; 
            }
            if(arr[mid]<k)
            {
                start=mid+1;
            }
        }
        return false;
    }
}
public class SearchInSortedRotatedArray2
{
    public static void main(String[] args)
    {
        SearchinSortedArray2 s=new SearchinSortedArray2();
        boolean a=s.searchinsortedarray(new int[]{7, 8, 1, 2, 3, 3, 3, 4, 5, 6}, 3);
        System.out.println(a);
    }
    
}
