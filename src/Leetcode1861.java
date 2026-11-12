
import java.util.LinkedList;
import java.util.Queue;

class Solution 
{
    public char[][] rotateTheBox(char[][] boxGrid) 
    {
        //real initial box's rows becomes new ones columns
        //same columns becomes rows

        char[][] result=new char[boxGrid[0].length][boxGrid.length];

        //this is just rotating by 90 degree

        int k = boxGrid.length - 1;

        for(int i=0;i<boxGrid.length;i++)
        {
            for(int j=0;j<boxGrid[i].length;j++)
            {
                //till row same row keep the new ones column same
                if(k>-1)
                {
                result[j][k]=boxGrid[i][j];
                }
            }

            k--; //and keep decreasing k 
        }

        for(int i=0;i<result[0].length;i++) //column wise downward to upwards traversing
        {
            // char lastOne=result[i][result[i].length-1]; //to remember what was the last one
            //this will not be enough i think i should take a queue to store the pst ones unless 
            //we get stone we will keep adding these into it
            Queue<int[]> queue=new LinkedList<>();

            for(int j=result.length-1;j>-1;j--)
            {
                //we are here only storing indeces of empty space in the queue
                if(result[j][i]=='#') //STONE 
                {
                    //check in queue
                    if(!queue.isEmpty())
                    {
                        //if queue is not empty then we need to check at what index there is empty space at those indeces we will store this stone
                        int[] indeces=queue.poll();
                        
                        result[indeces[0]][indeces[1]]='#';//make this happen
                        //and at the current index there should be empty space
                        result[j][i]='.';
                        //AND DO NOT FORGET TO ADD IT INTO THE QUEUE
                        queue.add(new int[]{j,i});
                    }

                }//if empty space is there then store the indeces
                else if(result[j][i]=='.') //EMPTY SPACE
                {
                    queue.offer(new int[]{j,i});
                }//if obstacle came remove all 
                else if(result[j][i]=='*') //OBSTACLE CAME
                {
                    //clear whole queue
                    queue.clear();
                }
            }
        }

        return result;
    }
}
public class Leetcode1861 {
    
}
