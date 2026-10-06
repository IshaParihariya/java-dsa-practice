
package array.questions.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solutionmksse
{
    public long makeSubKSumEqual(int[] arr, int k) 
    {
        List<List<Integer>> list = new ArrayList<>();

        int n = arr.length;

        boolean[] vis = new boolean[n];

        // Find all groups
        for(int i = 0; i < n; i++)
        {
            if(!vis[i])
            {
                List<Integer> group = new ArrayList<>();

                int current = i;

                while(!vis[current])
                {
                    group.add(arr[current]);

                    vis[current] = true;

                    current = (current + k) % n;
                }

                list.add(group);
            }
        }

        // Calculate minimum operations
        long result = 0;

        for(List<Integer> group : list)
        {
            Collections.sort(group);

            int median = group.get(group.size() / 2);

            for(int value : group)
            {
                result += Math.abs(value - median);
            }
        }

        return result;
    }
}
public class MakeKSubarraySumsEqual {
    
}
