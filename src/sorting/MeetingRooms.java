//Leetcode 253
package sorting;

import java.util.Arrays;

public class MeetingRooms 
{
    class Solution 
{
    public int minMeetingRooms(int[][] intervals) 
    {
        int n = intervals.length;

        int[] starts = new int[n];
        int[] ends = new int[n];

        // Store start and end times separately
        for(int i = 0; i < n; i++)
        {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }

        // Sort both arrays
        Arrays.sort(starts);
        Arrays.sort(ends);

        int i = 0;  // start pointer
        int j = 0;  // end pointer

        int rooms = 0;
        int maxRooms = 0;

        while(i < n)
        {
            if(starts[i] < ends[j])
            {
                // Meeting starts before the earliest meeting ends
                rooms++;
                i++;

                maxRooms = Math.max(maxRooms, rooms);
            }
            else
            {
                // A meeting has ended, so reuse its room
                rooms--;
                j++;
            }
        }

        return maxRooms;
    }
}
    
}
