/*
Single Number :

Given an array of nums of n integers. Every integer in the array appears twice except one integer.
Find the number that appeared once in the array.

Example 1

Input : nums = [1, 2, 2, 4, 3, 1, 4]

Output : 3

Explanation : The integer 3 has appeared only once.

Example 2

Input : nums = [5]

Output : 5

Explanation : The integer 5 has appeared only once.
*/
package array.questions.easy.medium;

class Singleno
{
    public void singlenumber(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
             count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    if(count==2)
                    {
                        break;// this only stops the nearest loop
                    }
                }
            }
          if(count==1)
          {
              System.out.println(arr[i]);
              return;// this stops the whole method and goes to main()
          }
                
        }
    }
}
public class SingleNumber 
{
    public static void main(String[] args)
    {
        Singleno s=new Singleno();
        s.singlenumber(new int[]{1, 2, 2, 4, 3, 1, 4});
    } 
}
