
package array.questions.easy;

class Solution 
{
    public int hardestWorker(int n, int[][] logs) 
    {
        int maxId=logs[0][0]; //id of person with maxtime
        int maxLeaveTime=0;  //maxLeaveTime lets say..
        int lastLeaveTime=0;
        

        for(int i=0;i<logs.length;i++)
        {
            int id=logs[i][0]; //id
            int leaveTime=logs[i][1]; //leaveTime

            int diff=leaveTime-lastLeaveTime;

            //maxLeaveTime=Math.max(maxLeaveTime,diff);
            if(maxLeaveTime<diff)
            {
              maxLeaveTime=diff;
              maxId=id; 
            }
            else if(maxLeaveTime==diff)
            {
                maxId=Math.min(id,maxId);
            }
        
            //and update the lastLeaveTime..
            lastLeaveTime=leaveTime;
        }
        return maxId;
    }
}
public class MaxTimeEmployee {
    
}
