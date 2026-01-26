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
    public static void Hashing(int arr[])
    {
        // find max element
        int max = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }

        // frequency array
        int freq[] = new int[max + 1];

        // count frequency
        for(int x : arr)
        {
            freq[x]++;
        }

        // print element-frequency pairs
        System.out.println("Element  Frequency");

        for(int i = 0; i < arr.length; i++)
        {
            boolean isDuplicate = false;

            // check if already printed
            for(int j = 0; j < i; j++)
            {
                if(arr[i] == arr[j])
                {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate)
            {
                System.out.println(arr[i] + "        " + freq[arr[i]]);
            }
        }
    }

    public static void main(String[] args)
    {
        Hashing(new int[]{1,2,3,1,4,5,6,7,2,3,2,3,3,4});
    }
}
