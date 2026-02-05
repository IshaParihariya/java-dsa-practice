/*
Find the missing number in an array

Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. 
Find the number(between 1 to N), that is not present in the given array..

Examples
Example 1:
Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation: In the given array, number 3 is missing. So, 3 is the answer.


Example 2:
Input Format: N = 3, array[] = {1,3}
Result: 2
Explanation: In the given array, number 2 is missing. So, 2 is the answer.

*/
package array.questions.easy;

class MissingNumber
{
  public void missingnumber(int [] num)
  {
     int n=num.length; // length of the array num
     
     // new array having all numbers from 1 to N-1
     int m=n+1;
     int arr[] = new int[m];
     for(int i=0;i<m;i++)// adding the elements from 1 to N in the array arr
     {
         arr[i]=i+1;
     }
     
     for(int i=0;i<m;i++) // loop for getting to the arr elements
     {
         boolean missingelementfound=false;
        for(int j=0;j<n;j++) // for num elements
        {
            if(arr[i]==num[j])// if same element found stop and continue the loop
            {
            missingelementfound=true; 
            break;
            }
        }
        if(missingelementfound==false)
            {
                System.out.println(" missing element in the array is : "+ arr[i]);
            }
     }
  }
}
public class FindMissingNumber
{
    public static void main(String[] args)
    {
        MissingNumber mn=new MissingNumber();
        mn.missingnumber(new int[]{1,3});
    }
}
