/*
Hashing is a technique to store and retrieve data in O(1) average time using a key.
Instead of searching linearly, we use a hash function to directly jump to the location.


Example: Hashing using Array (Frequency Counting)

Array:
arr = {2, 3, 2, 5, 3}

Step 1: Find maximum value
max = 5

Step 2: Create frequency array (boxes)
Each index is a "box" that counts how many times the number appears.

size of frequency array = max. element in the array + 1  

Initial freq array:
0   0   0   0   0   0

Step 3: Traverse the array and count

Read 2 → freq[2]++
0   0   1   0   0   0

Read 3 → freq[3]++
0   0   1   1   0   0

Read 2 → freq[2]++
0   0   2   1   0   0

Read 5 → freq[5]++
0   0   2   1   0   1

Read 3 → freq[3]++
0   0   2   2   0   1

Final Result:
Number → Frequency
2 → 2 times
3 → 2 times
5 → 1 time

Key Idea:
- Index represents the number (hash)
- Value at index represents frequency
- Direct indexing gives O(1) access

This is called ARRAY HASHING.
Used when maximum value is small (≤ 10^6).


*/
package basichashing;

public class HashingArray
{
    public static void main(String[] args)
{
//        int arr[]=new int['a']; // array needs a int index but as ive given character over here so it will
                                // convert it to its ASCII value and will take it as the int in it 
    
    
    int[] arr = {3, 1, 2, 3, 2};

        int[] hash = new int[4]; // max value = 3 → size = 4

        for (int x : arr) {
            hash[x]++; //go to index = x
                       //increase value by 1
            // hash[3]++ → 1
          // hash[1]++ → 1
          //hash[2]++ → 1
          //hash[3]++ → 2
          //hash[2]++ → 2
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                System.out.println(i + " -> " + hash[i]);
            }
    }
}
}