/*

First and last occurrence

Given an array of integers nums sorted in non-decreasing order,
find the starting and ending position of a given target value. If the target is not found in the array,
return [-1, -1].

Example 1

Input: nums = [5, 7, 7, 8, 8, 10], target = 8

Output: [3, 4]

Explanation:The target is 8, and it appears in the array at indices 3 and 4, so the output is [3,4]

Example 2

Input: nums = [5, 7, 7, 8, 8, 10], target = 6

Output: [-1, -1]

Expalantion: The target is 6, which is not present in the array. Therefore, the output is [-1, -1].
*/
package binarySearchAlgorithm.questions.easy;

import java.util.Arrays;

class FirstandLastOcurrence_
{
    public int[] firstlastocc(int[] num,int target)
    {
        // sorted array so using binary search again
        int start=0;
       int end=num.length-1;
       int mid;
       
       int first;
       int last;
       // while loop for first occ
       while(start<=end)
       {
           mid=start+(end-start)/2;
          
           if(num[mid]>=target)
           {// if taking this one then start or end is returning the first occ position
               
               end=mid-1; 
           }
           if(num[mid]<target)
           {
               start=mid+1;
           } 
       }
        first=start;//or end
       
       
        // Check if target exists
        if (first >= num.length || num[first] != target)
        {
            return new int[]{-1, -1};
        }
        
        
       // while loop for last occ
       start=0;
       end=num.length-1;
       while(start<=end)
       {
            mid=start+(end-start)/2;
           if(num[mid]<=target)
           {// if taking this mid returning the last occ
               start=mid+1;
           }
           if(num[mid]>target)
           {
               end=mid-1;
           }
       }
        last=start-1;
       
       
        
        return new int[]{first,last};
    }  
}   
    public class FirstAndLastOcurrence
            {
              public static void main(String[] args)
              {
                  FirstandLastOcurrence_ f=new FirstandLastOcurrence_();
                  int[] A=f.firstlastocc(new int[]{5, 7, 7, 8, 8, 10}, 8);
                  System.out.println(Arrays.toString(A));
              }
            }

    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       return new int[]{first,last};
    }
}
public class FirstAndLastOcurrence
{
    public static void main(String[] args)
    {
       FirstandLastOcurrence_ f=new FirstandLastOcurrence_();
       int A[]=f.firstlastocc(new int[]{5, 7, 7, 8, 8, 10}, 8);
       System.out.println(Arrays.toString(A));
    }
}
