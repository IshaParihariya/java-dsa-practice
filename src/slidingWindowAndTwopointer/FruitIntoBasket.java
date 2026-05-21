/*
Test Result
904. Fruit Into Baskets
Medium
Topics
premium lock icon
Companies
You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.

 
*/
package slidingWindowAndTwopointer;

import java.util.HashMap;


// time limit exceeded for this one leetcode
//***
// as r = l-1 
// so it goes back to some indeces 
// so overall the time complexity becomes O(N^2)-ish

 class Solution 
{
    public int totalFruit(int[] arr) 
    {
        //pointer
        int l=0;

        //hashmap to store the fruit type and the index
        // key=> type of fruit
        // value=> index
        HashMap<Integer,Integer> map=new HashMap<>();

        //max length and length
        int length=0;
        int maxlength=0;
        

        // for loop
        for(int r=0;r<arr.length;r++)
    {
            map.put(arr[r],r);

        //if size of map > 2 as max two unique numbers 
        if(map.size()>2)
        { 
            // restart properly
                map.clear();
            l++;
            r=l-1;
           
        }
        length=r-l+1;

      maxlength=Math.max(length,maxlength);
          
    }

return maxlength;
   }
 }

// this solution beats 91.63% solutions on leetcode 
class Solution1 
{
    public int totalFruit(int[] arr) 
    {
        //hashmap 
        HashMap<Integer,Integer> map=new HashMap<>();

        // pointer 
        int l=0;

        //length
        int length=0;
        int maxlength=0;

        //for loop
        for(int r=0;r<arr.length;r++)
        {
            if(map.containsKey(arr[r]))
            {
                //dont do anything
            }
            map.put(arr[r],r);
        
            //size>2 as two baskets max
            if(map.size()>2)
            {
                //while loop
                while(map.size()>2)
                {
                    map.remove(arr[l],l);
                    l++; // shrinking window from left
                }
            }
            length=r-l+1;
            maxlength=Math.max(length,maxlength);

        }

        return maxlength;
    }
}
public class FruitIntoBasket 
{
   public static void main(String[] args)
   {
       Solution1 s=new Solution1();
       int arr[]={1,2,3,2,2};
       int result=s.totalFruit(arr);
        System.out.println(result);
   }
}

