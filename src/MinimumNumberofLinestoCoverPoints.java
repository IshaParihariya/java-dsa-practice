
import java.util.HashSet;
import java.util.Set;


class Soln
{
    public int numberOfLines(int[][] points)
    {
        // slope = (y2 - y1) / (x2 - x1)
        //line equation => y=mx+c
        
            Set<Integer> set=new HashSet<>();
            int slope=0;
            int line=0; //count of line
        
        for(int i=0;i<points.length;i++)
        {
            int x1=points[i][0];
            int y1=points[i][1];
            
            
            //int x2=0;
            //int y2=0;
            
            for(int j=0;j<points.length;j++)
            {
                if(i!=j)
                {
                 int x2=points[j][0];
            
                 int y2=points[j][1];
                 
                slope = (y2 - y1) / (x2 - x1);
                 
                }
            }
            
            if(!set.contains(slope))
            {
                line++;
                set.add(slope);
            }
            
                        
        }
        return 0;
    }
}
public class MinimumNumberofLinestoCoverPoints 
{
    
}
