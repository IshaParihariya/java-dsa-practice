
package greedyAlgo;

import java.util.Arrays;
import java.util.HashMap;

// time exceeded for this solution on leetcode
class Solution1 {
    public int findContentChildren(int[] g, int[] s)
    {
        // g => children
        // s => cookies

        // sorting array g
        Arrays.sort(g);                                                   // O(n log n)
        // sorting array s
        Arrays.sort(s);   // dual-pivot quick sort ( O(n log n) )         // O(m log m)
        
        // hash map to store both child and cookie assgined to it
        HashMap<Integer,Integer> map=new HashMap<>();
        
        // for children loop
        for(int i=0 ; i<g.length ;i++)                                    // O(n)
        {
            // for cookies loop
            inner:
            for(int j=0;j<s.length;j++)                                   // O(m)
            {
                if(s[j]>=g[i])
                {
                    if(map.containsKey(j))                                  // O(1)
                    {
                        continue inner;
                    }
                    map.put(j,s[j]); // store the cookie which got assigned with index
                    break; // break the loop if this is done
                }
            }
            // end of loop inner 
        }
        // outer loop end

        return map.size(); // returning size of the 
    }
    // over all :
    
    //  O(n log n + m log m + n × m) ==> as nested loop dominates so for larger inputs ==> O(n*m)
}

// this one beats 74.55% solutions on leetcode
class Solution2 {
    public int findContentChildren(int[] g, int[] s)
    {
        Arrays.sort(g);
        Arrays.sort(s);


 int l=0;
int r=0;

// while loop
// l==>> cookies traversing
// r==>> childrens traversing
while(l<s.length && r<g.length)
{
    if(s[l]>=g[r])
    {
        r=r+1;  // next children
    }
    // next cookie
    l=l+1;
}
return r; // cuz this will be the number of childrens who have been assigned a cookie


}

}
public class AssignCookieProblem 
{
    // main method
    public static void main(String[] args)
    {
        
    }
}
