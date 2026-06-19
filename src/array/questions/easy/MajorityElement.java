/*
Majority Element-I

Given an integer array nums of size n, return the majority element of the array.

The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.

Example 1

Input: nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]

Output: 7

Explanation:

The number 7 appears 5 times in the 9 sized array

Example 2

Input: nums = [1, 1, 1, 2, 1, 2]

Output: 1

Explanation:

The number 1 appears 4 times in the 6 sized array
*/
package array.questions.easy;

import java.util.HashMap;

class MajorityElement_
{
    public void majorityelement(int[] arr)
    {
        int n=arr.length; // n is the length of the array
        int m=n/2; // count > m => majority element 
        int majority=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=0; // count of the element
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                majority=arr[i];
            }
        }
        if(max>m)
            System.out.println(majority);
    }
}
//another approach added
class SolutionME 
{
    public int majorityElement(int[] arr) 
    {
        int n=arr.length;
        //hashmap => element and freq
        HashMap<Integer,Integer> map=new HashMap<>();

        //frquency
        int freq=0;

        //for loop
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                freq=1;
                map.put(arr[i],freq); 
            }
            //if it contains
            /*
            -> map.get(arr[i]) finds the current frequency of that element.
            -> +1 increments it.
            -> put() replaces the old value with the new frequency. 
            */
            else
            {
                map.put(arr[i],map.get(arr[i])+1); // note No new entry is created.
                /* map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

This means:

"Give me the current frequency of arr[i]; if it doesn't exist, assume it's 0, then add 1 and store it */
            }

            
        }
        //end of for loop

        for(int key : map.keySet())
        {
            if(map.get(key)>(n/2))
            {
                return key;
            }
        }

        return -1;
    }
    //end of method

}
public class MajorityElement 
{
    public static void main(String[] args)
    {
         MajorityElement_ m=new  MajorityElement_();
         m.majorityelement(new int[]{1, 1, 1, 2, 1, 2});
    }
}
