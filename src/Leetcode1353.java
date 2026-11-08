class Solution 
{
    public int maxEvents(int[][] events) 
    {

    }
    //could not solve bro!!

   // {
        //if events array length is 1
    //     if(events.length==1)
    //     {
    //         return 1; //this is fixed
    //     }

    //     //we making changes in the array itself
    //     //ascending order for 1st column
    //     //also like we doing this sorting on basis of the start day

    //     Arrays.sort(events,(a,b)-> Integer.compare(a[0],b[0]));


    //     //lets try sorting here
    //     PriorityQueue<Integer> pq=new PriorityQueue<>();

    //     //we have sorted the array 
    //     //noe we will add the end days for some start day
    //     //and get the peek means minimum one outta that
    //     //like this we can get maximum count of the events attended
        
    //     int start=-1;
    //     int end=-1;

    //     List<List<Integer>> list=new ArrayList<>();

    //     List<Integer> arr=new ArrayList<>();
        
    //     for(int i=0;i<events.length;i++)
    //     {
    //         if(start!=events[i][0])//means a new start day
    //         {
    //             if(!pq.isEmpty())
    //             {
    //             end=pq.peek(); //thats the end of the last event

    //             arr.add(start);
    //             arr.add(end);

    //             list.add(arr);

    //             pq.clear(); //clear all end days from it
                
    //             //we shoud store these somewhere or waht
    //             }
    //             //new start day is here
    //             start=events[i][0];
    //         }
    //         //add end into the pq
    //         pq.offer(events[i][1]);
    //     }

    //     //here last one isnt compared 
    //     //we need to get it done separately
    //     end=pq.peek();
    //      arr.add(start);
    //             arr.add(end);

    //             list.add(arr);
    //     pq.clear();
        


    //     return list.size();

    
    // }
    // {
    //     //if events array length is 1
    //     if(events.length==1)
    //     {
    //         return 1; //this is fixed
    //     }

    //     //for start
    //     List<Integer> s=new ArrayList<>();
    //     //for end
    //     List<Integer> e=new ArrayList<>();

    //     // //start and end day for the event 
    //     // //there might be case where we need to skip 1ist one inordeer to get max
    //     // int start=events[0][0];
    //     // int end=events[0][1];

    //     // //add these into the list
    //     // s.add(start);
    //     // e.add(end);

    //     //adding all into the lists
    //     //then we will think of doing something regarding the conditions

    //     for(int i=0;i<events.length;i++)
    //     {
    //     //     int start=events[i][0];
    //     //     int end=events[i][1];

    //         //we need to check the event we went to ends 
    //         //on the same or after start of next event
    //         //in arraylist insertion order is maintained
            
    //             //as we inserting only if we attending that event
    //             //then insert into the list
    //             s.add(events[i][0]);
    //             e.add(events[i][1]); //i think we need to add some condition for end as well
    //             //cuz it could be the case that start > end
               
    //         //else just do not add it into the list       
    //     }   

    //     //after adding these into the lists
    //     //we can actually check if the ends smaller than this one exists
    //     for(int i=0;i<events.length;i++)
    //     {
    //         int start=events[i][0];
    //         int end=events[i][1];


    //     }     
    //}
}
public class Leetcode1353 {
    
}
