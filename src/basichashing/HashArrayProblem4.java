/*
Given an array nums of size n which may contain duplicate elements.



Rreturn a list of pairs where each pair contains a unique element from the array and its frequency in the array.



You may return the result in any order, but each element must appear exactly once in the output.


Example 1

Input: nums = [1, 2, 2, 1, 3]

Output: [[1, 2], [2, 2], [3, 1]]

Explanation:

- 1 appears 2 times

- 2 appears 2 times

- 3 appears 1 time

Order of output can vary.

Example 2

Input: nums = [5, 5, 5, 5]

Output: [[5, 4]]

Explanation:

- 5 appears 4 times.
*/
package basichashing;

public class HashArrayProblem4 
{
    public static void method(int n[])
    {
      // maximum element in the n array
        int max =n[0];
        for(int i=0;i<n.length;i++)
        {
            if(max<n[i])
            {
                max=n[i];
            }
        }
      // size = max elememt + 1
         int size=max+1;
     // array for frequency
        int freq[]=new int[size];
        // for frequency count 
        for(int x:n) // for each loop
        {
            freq[x]++;
        }
        
        // for printing except the duplicate values
        for(int i=0;i<n.length;i++)
        {
            boolean isDuplicate=false;
            for(int j=0;j<i;j++)
            {    
            if(n[i]==n[j])
            {
              isDuplicate=true; 
              break;
            }
            }
            if(!isDuplicate) // if not duplicate then print
            {
               System.out.println(n[i]+ "            "+ freq[n[i]]); 
               
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println("value"+"      "+"frequency");
       method(new int[]{1,2,3,1,1,2,3,4,5,5,6,7}); 
    }
}
