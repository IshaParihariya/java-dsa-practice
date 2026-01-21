/*

-------------------- COMPLEXITY ANALYSIS --------------------

Time Complexity:
Time complexity represents how the execution time of an algorithm
grows with respect to input size (n).

Space Complexity:
Space complexity represents the amount of extra memory used by
an algorithm apart from the input.

-------------------------------------------------------------
Time Complexity: O(1)
Explanation:
The statement executes only once, regardless of input size.

Space Complexity: O(1)
Only a constant amount of memory is used.

int a = 10;
System.out.println(a);

-------------------------------------------------------------
Time Complexity: O(n)
Explanation:
The loop runs n times where n is the size of the array.

Space Complexity: O(1)
No extra space is used apart from loop variable.


for(int i = 0; i < n; i++)
{
    System.out.println(arr[i]);
}

-------------------------------------------------------------
Time Complexity: O(n^2)
Explanation:
Two nested loops cause n * n operations.

Space Complexity: O(1)
Only loop variables are used.


for(int i = 0; i < n; i++)
{
    for(int j = 0; j < n; j++)
    {
        System.out.println(i + " " + j);
    }
}

-------------------------------------------------------------
Time Complexity: O(log n)
Explanation:
The value of n is divided by 2 in each iteration.
Used in binary search.

Space Complexity: O(1)
No extra memory is used.


while(n > 1)
{
    n = n / 2;
}

--------------------------------------------------------------

Time Complexity: O(n)
Explanation:
O(1) + O(n) → Dominant term is O(n).

Space Complexity: O(1)


int x = 5;   // O(1)

for(int i = 0; i < n; i++)
{
    System.out.println(i);
}
----------------------------------------------------------------

Time Complexity: O(n)
Explanation:
The function is called once and the loop runs n times.

Space Complexity: O(1)


void print(int n)
{
    for(int i = 0; i < n; i++)
    {
        System.out.println(i);
    }
}
----------------------------------------------------------------

Time Complexity: O(n)
Explanation:
The function calls itself n times.

Space Complexity: O(n)
Due to recursive call stack.


void fun(int n)
{
    if(n == 0)
        return;

    System.out.println(n);
    fun(n - 1);
}

*/


package complexity;

public class Complexity1
{
    public static void main(String[] args)
    {
        
    }
}
