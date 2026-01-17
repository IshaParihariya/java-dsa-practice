/*
Question link : 

https://leetcode.com/problems/find-smallest-letter-greater-than-target/

check later again 
*/
package binarySearchAlgorithm.queations;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) 
    {
        //increasing order array 
        //similar to ceiling of the number
        //atleast 2 diff characters in the letter array {a,b,....}
        //Lexicographically means dictionary order — the way words are arranged in a dictionary.

        

        int start=0; //start index
        int end=letters.length-1; //end index
        int mid; //mid index


        //binary search as array is sorted in ascending order 
        while(start<=end)//loop condition
        {
            mid=start+(end-start)/2;

            if(letters[mid]>target) //left side search
            {
                end=mid-1;
            }
            else  //right side search
            {
                start=mid+1;
            }
        }
         //but if z is target then???
            //no letter greater than the target z 
            //so now 
             if (start == letters.length) {
            return letters[0];
        }
        return letters[start];
    }
}
public class Leetcode744
{
    public static void main(String[] args)
    {
        Solution s=new Solution(); //obj of class Solution 
        char c=s.nextGreatestLetter(new char[]{'a','c','d','u','x'},'c');
        System.out.println(c);
    }
}
