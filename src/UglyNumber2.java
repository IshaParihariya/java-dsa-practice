
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class Solution 
{
    public int nthUglyNumber(int n) 
    {

        //NOTE HERE I TOOK LONG INSTEAD OF INTEGER
        //REMEMBER THIS Java can produce an incorrect, negative value.
        //IF THE LIMIT HAS BEEN REACHED IT CAN LEAD TO NEGATIVE ASWERS SO ALWAYS TAKE CARE OF THIS ONE THING!
        //lets try with priority queue and hash set
        PriorityQueue<Long> pq=new PriorityQueue<>(); 
        Set<Long> set=new HashSet<>(); 

        //start with 1 
        pq.offer(1L);
        set.add(1L);

        //we will get 1 outta pq and will do 1*2
        // 1*3
        // 1*5
        // then will add 2, 3, 5 into the pq and will keep doing this 
        //min. ones will be taken first thats why i took priority queue here


        int m=0;
        boolean found=false;

        while(!found)
        {
            Long uglyNumber=pq.poll(); //removing that 1
            //we will later get the smallest number first then rest ones uk

            //checking before generating numbers unncessarily
            m++;

            //the moment m==n
            //we got the answer
            if(m==n)
            {
                found=true;
                return  uglyNumber.intValue();
            }

            Long a=uglyNumber*2;
            Long b=uglyNumber*3;
            Long c=uglyNumber*5;

            //hash set here we taking 
            //cuz we don't need duplicates 2*3 or 3*2
            //so only add if set does not contain that value..
            if(set.add(a))
            {
                //set.add(a) will return true only if it were added in the set
                //and it will be added only if its not present in the set earlier
                pq.offer(a);
            }
            if(set.add(b))
            {
                //add b as well then
                pq.offer(b);
            }
            if(set.add(c))
            {
                pq.offer(c);
                //for c as well done!
            }

            
        }

        return -1;

//return -1; //if nothing found
//that couldn't be a case i assume here 


    //     //TLE 
    //     //we going for brute force here 
    //     //lets try this out

    //     //one already counted here as we cannot think of a way rn to handle 1 so..
    //     int i=2;
    //     int m=1;

    //     if(m==n)
    //     {
    //         //1 case
    //         return 1;
    //     }

    //     //rest can be handled here uk
    //     boolean found=false;
    //     while(!found)
    //     {
    //         int j=i;

    //         while(j%2==0)
    //         {
    //             j=j/2;
    //         }

    //         while(j%3==0)
    //         {
    //             j=j/3;
    //         }

    //         while(j%5==0)
    //         {
    //             j=j/5;
    //         }

    //         if(j==1)
    //         {
    //             m++; //yes we found then 
    //             //so increasing this here
    //         }
    //         //return this one i if m is equal to n now
    //         if(m==n)
    //         {
    //             found=true;
    //             return i;
    //         }

    //         i++; //fixed to change
    //     }

    //     //if in the end we didnt get anything i might return -1
    //     return -1;
    }
}
public class UglyNumber2 {
    
}
