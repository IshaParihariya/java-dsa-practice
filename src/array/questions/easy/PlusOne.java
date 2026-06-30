/*
66. Plus One

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
*/
package array.questions.easy;

// this solution okay till we dont reach int's limit 
// SO OVERALL CAN BE SAID INCORRECT SOLUTION 
class SolutionPO {
    public int[] plusOne(int[] arr)
    {
        String digits="";

        //for loop to get the array in the string
        for(int i=0;i<arr.length;i++)
        {
            digits=digits+arr[i];
        }

        //converting string to integer
        /*
        ****
        The constraint says:
        1 <= digits.length <= 100

        A 100-digit number cannot fit into:
        int    // ~10 digits
        long   // ~19 digits

        So we should never convert the array to an int.
        */
        int num = Integer.parseInt(digits);

        // increment in int 
        num=num+1;

        // converting into string
        String resultDigits=String.valueOf(num); 

        // array to store the result
        int[] result=new int[resultDigits.length()];
        //getting the String in the array index by index
        for(int i=0;i<result.length;i++)
        {
            
            result[i]=resultDigits.charAt(i)-'0';
        }

        return result;

    }
}
//COREECT SOLUTION **
class SolutionPO1 {
    public int[] plusOne(int[] arr)
    {
        //result array
        int[] result=new int[arr.length+1];
        
        // for loop
        for(int i=arr.length-1;i>-1;i--)
        { 
        // if last element is less than 9 than we will simply make an increment by 1
        if(arr[i]<9)
        {
            arr[i]=arr[i]+1;
            // return the array itself as increment is done
            return arr;
        }
        // for element == 9
        // else part
        else
        {
            arr[i]=0;
            result[i]=arr[i];
        }
        }
        result[0]=1; 
        return result;  
    }
}
class SolutionPO2 
{
    public int[] plusOne(int[] digits)
     {

        for (int i = digits.length - 1; i >= 0; i--) 
        {

            if (digits[i] < 9) 
            {
                digits[i]++;
                return digits;
            }
//else part
            digits[i] = 0;
        }

        // If all digits were 9
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }
}
public class PlusOne
{
    
}
