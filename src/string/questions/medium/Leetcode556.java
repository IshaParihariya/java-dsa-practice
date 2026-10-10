
package string.questions.medium;

class Solution556 
{
    public int nextGreaterElement(int n) 
    {
        //tc is too high for this one solution
        // //ye phle hi likh diya bro
        // if(n==Integer.MAX_VALUE)
        // {
        //     return -1;
        // }

        // String str= Integer.toString(n);   //converted to string

        // List<Integer> list=new ArrayList<>();

        // for(int i=0;i<str.length();i++) //storing in the list in Integer form only
        // {
        //     Character ch=str.charAt(i);
        //     Integer a=Character.getNumericValue(ch);
        //     list.add(a);
        // }

        // //will start from n+1 and will check each number which could be have both the digits in it
        // for(int i=n+1;i<Integer.MAX_VALUE;i++)
        // {
        //     String res= Integer.toString(i);
        //     List<Integer> temp = new ArrayList<>(list);
        //     boolean failed=false;
        

        //     for(int j=0;j<res.length();j++)
        //     {
        //         Character c=res.charAt(j);
        //         Integer b=Character.getNumericValue(c);
                

        //         if(!temp.contains(b))
        //         {
        //             failed=true;
        //             break;

        //         }
        //         else
        //         {
        //             temp.remove(Integer.valueOf(b));  //as one of em idetified so remove it 
        //             //as there can be more than one similar ones..so
        //             //Integer.valueOf(b): this ensures Java removes the digit by value, rather than interpreting it as an index
        //         }
        //     }

        //     if(temp.isEmpty() && !failed)
        //     {
        //         return i;
        //     }

        // }
        // return -1;

        //lets try something else

        //lets take n and convert it to string and add each chacter in the character array
        String str=Integer.toString(n); 

        int[] vals=new int[str.length()];

        for(int i=0;i<str.length();i++)
        {
            vals[i]=Character.getNumericValue(str.charAt(i));
        }

        int pivot=vals[0];

        int reverseStart=0;
        boolean pivotFound=false;
           

        //now lets try comparing values and try to find our result
        for(int i=vals.length-1;i>=1;i--)
        {
           if(vals[i]>vals[i-1])
           {
           //dont swap immediatley

           pivot=vals[i-1];

           pivotFound=true;
           
           //as we found the pivot elem here
           //so we will find the just greater elem than pivot 
           int j = vals.length - 1;
reverseStart = i;

int smallest = Integer.MAX_VALUE; //HERE I WERE HAVING ISSUES!!
int smallestIndex = -1;

for (; j >= reverseStart; j--) {
    if (vals[j] > pivot && vals[j] < smallest) {
        smallest = vals[j];
        smallestIndex = j;
    }
}
           //swap this elem with that smalles elem
           int temp=vals[i-1]; //pivot
           vals[i-1]=smallest;
           vals[smallestIndex]=temp;
           //swapped


           //so once pivot is found and all swapping shit is done break the loop
           break;

           }


        }

        if (!pivotFound) {
    return -1;
}

        StringBuilder s1=new StringBuilder();

        for(int i=0;i<reverseStart;i++)
        {
            s1.append(vals[i]);
        }

        StringBuilder s2=new StringBuilder();

        for(int i=vals.length-1;i>=reverseStart;i--)
        {
            s2.append(vals[i]);
        }

        s1.append(s2); //string builder doesnt have concate
        //here s1 is modified

        String str1=s1.toString();

        if(pivotFound )
        {
        long ans= Long.parseLong(str1); //string to int

         if (ans > n && ans <= Integer.MAX_VALUE) {
        return (int) ans;
    }
        }
       
       return -1;

        //return our vals array value

    }
}
public class Leetcode556 {
    
}
