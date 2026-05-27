/*


**IPORTANCE OF USING ELSE IF INSTEAD OF IF

860. Lemonade Change
Solved
Easy
Topics
premium lock icon
Companies
At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order one at a time (in the order specified by bills). Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill. You must provide the correct change to each customer so that the net transaction is that the customer pays $5.

Note that you do not have any change in hand at first.

Given an integer array bills where bills[i] is the bill the ith customer pays, return true if you can provide every customer with the correct change, or false otherwise.

 

Example 1:

Input: bills = [5,5,5,10,20]
Output: true
Explanation: 
From the first 3 customers, we collect three $5 bills in order.
From the fourth customer, we collect a $10 bill and give back a $5.
From the fifth customer, we give a $10 bill and a $5 bill.
Since all customers got correct change, we output true.
Example 2:

Input: bills = [5,5,10,10,20]
Output: false
Explanation: 
From the first two customers in order, we collect two $5 bills.
For the next two customers in order, we collect a $10 bill and give back a $5 bill.
For the last customer, we can not give the change of $15 back because we only have two $10 bills.
Since not every customer received the correct change, the answer is false.
*/
package greedyAlgo;

// **IPORTANCE OF USING ELSE IF INSTEAD OF IF
class Solution 
{
    public boolean lemonadeChange(int[] bills)
    {
        // boolean 
        // counts
        int c5=0;
        int c10=0;
        int c20=0;

        int l=0;
        //while loop
        while(l<bills.length)
        {
            // 5$ case
            if(bills[l]==5)
            {
                c5++;
            }
            //10$ case
           else if(bills[l]==10)
            {
                if(c5==0)
                {
                    return false;
                }
                c5--;
                c10++;
            }
            //20$ case
            else if(bills[l]==20)
            {
                if(c5==0 && c10==0)
                {
                    return false;
                }
            if(c10>=1 && c5>=1)
            {
                c20++;
                c10--;
                c5--;
            }
           else if(c5>=3)
            {
                c20++;
                c5=c5-3;
            }
            else
            {
                return false;
            }
            }
            l=l+1;
        }
        return true;

    }
}
public class LemonadeChange {
    
}
