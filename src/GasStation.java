class Solution 
{
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int tank=0; //tank initially empty

        int start=0;

        int total=0;

        for(int i=0;i<gas.length;i++)
        {
            int diff=gas[i]-cost[i];

            tank=tank+diff;
            total=total+diff;

            if(tank<0)
            {
                tank=0; //again start 
                start=(i+1); 
            }

        }

        return total >= 0 ? start : -1;

        //this failed in last two test cases
        // outer:
        // for(int i=0;i<gas.length;i++)
        // {
        //     //bro if gas[i]<cost[i] 
        //     //it will not even be able to move to the next elem
        //     //so it will not even be able to start uk
        //     if(gas[i]<cost[i])
        //     {
        //         continue outer;
        //     }
        //     //for 0 cases case 35 here for tle
        //     if(i<gas.length-1 && gas[i]==cost[i] && gas[i+1]==0)
        //     {
        //         continue outer;
        //     }

        //     int tank=0; //initially no gas in the tank

        // //     //int gasToTravelToNextOne=cost[i]; //initially this

        //   int steps=0; //for loop

        //   while(steps<gas.length)
        //   {
        //      int j=(i+steps)%gas.length;

        //      tank=tank-cost[j]+gas[j];

                
        //         if (tank < 0) //tank value can be -ve as well
        //         {
        //             break;
        //         }

        //         steps++;
        //     }
        //     if (steps == gas.length) 
        //     {
        //         return i;
        //     }
        // }
        // return -1;


        // time limit exceeded fo this one
        //brut force check each one
        // for(int i=0;i<gas.length;i++)
        // {
        //     int tank=0; //initially no gas in the tank

        //     //int gasToTravelToNextOne=cost[i]; //initially this

        //     int steps=0; //for loop

        //     while(steps<gas.length)
        //     {
        //         int j=(i+steps)%gas.length;

        //         tank=tank-cost[j]+gas[j];

                
        //         if (tank < 0) //tank value can be -ve as well
        //         {
        //             break;
        //         }

        //         steps++;
        //     }
        //     if (steps == gas.length) 
        //     {
        //         return i;
        //     }
        // }
        // return -1; 

    }
}
public class GasStation {
    
}
