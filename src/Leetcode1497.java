
import java.util.HashSet;
import java.util.Set;

class Solution 
{
    public boolean canArrange(int[] arr, int k) 
    {
        //n is even so always 2 or greater 
        //so no case of 1 length of arr
        /*
        1 <= n <= 105
        n is even
        both conditions given here in contraints 
        quite confusing but I'll go with even length 
        */
        //we are saving indeces now not the elems 
        //lets go with brute force first 
        int len=arr.length/2;

        //lets store indeces instead of elems
        // Set<List<Integer>> set=new HashSet<>();
        //we need one index to be used just once
        //onlt store indeces individually this time
        Set<Integer> set=new HashSet<>();

        int pairs=0;

        for(int i=0;i<arr.length;i++)
    {
        for(int j=i;j<arr.length;j++)
        {
            if(i!=j && (arr[i]+arr[j])%k==0 )
            {
                    //if sum is divisible 
                    //then stores indeces
                    // List<Integer> list=new ArrayList<>();
                    // list.add(i);
                    // list.add(j);
                    // Collections.sort(list); //sort so we dont add duplicates 
                    //as indeces 1,2 and 2,1 are both same

                    if(!set.contains(i) && !set.contains(j))
                    {
                        set.add(i);
                        set.add(j);
                        pairs++;
                        break;
                        //here from here
                        //as we cannot have same index i for an another pair
                        //but like this we might take cases which are not 
                        //making it to len 
                        //as there can be diff cases for diff indeces 
                        //we need greedy apporach here inorder to choose the best cases
                    }
            }
        }

        if(pairs>=len)
        {
            return true;
        }
    }

    //else 
    return false;
    }
}
//         //BROO HERE THERE COULD BE SAME ELEMS AS DIFF PAIRS 
//         //SO WE CANNOT JUST BE LIKE THIS TO USE SET HERE
//         //THIS WILL REMOVE DUPLICATES 
//         //WE NEED TO TAKE INDECES OF THE ELEMS INTO CONSIDERATION AND NOT THE ELEMS THEMSELVES
//         //lets try with brute force first

//         Set<List<Integer>> set=new HashSet<>();
//         //we are not saving duplicates


//         int pairs=0;

//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i;j<arr.length;j++)
//             {
//                 if(i!=j)
//                 {
//                     //need to take cases into consideration where different pairs are counted but same values
//                     //like pair's each value is same
//                     //like [-1,-2] [-1,-2] these are both same 
//                     int val=arr[i]+arr[j];
//                     //list here so we dont addd duplicates in there
//                     List<Integer> list=new ArrayList<>();
//                     //adding these two elems int he list
//                     list.add(arr[i]);
//                     list.add(arr[j]);

//                     //sort the list
//                     Collections.sort(list);

//                     if(val%k==0 && set.add(list))
//                     {
//                     pairs++;
//                     }
//                 }
//             }

//             if(pairs>=(arr.length)/2)
//             {
//                 return true;
//             }
//         }

//         return false;
//         //one more thing here 
//         //if there are pairs like [1,2,1,2] and k=3
//         //then [1,2] and [1,2] both are valid
//         //we need to work on indeces here
//     }
// }
public class Leetcode1497 {
    
}
