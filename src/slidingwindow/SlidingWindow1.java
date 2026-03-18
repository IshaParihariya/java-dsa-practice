
package slidingwindow;

class hello
{
    public void sw(int[] arr)
    {
        
        int sum=0;
        int len=3;
        // arr for storing the sum
        int[] sumarr=new int[arr.length-1];
        
      
        for(int i=0;i<arr.length-2;i++)
        {
           for(int j=i;j<i+3;j++)
           {
               sum=sum+arr[j];
           }
           sumarr[i]=sum;
           sum=0;
        }
        
        // printing the sumarr
        System.out.print("sum array :");
        // average of each sum in the sumarr
        int[] sumavg=new int[arr.length-1];
       for(int i=0;i<sumarr.length-1;i++)
       {
           System.out.print(sumarr[i]+" ");
           sumavg[i]=sumarr[i]/3;
       }
       System.out.println();
       System.out.print("sum average array : ");
       // printing the avg of sumavg
       for(int i=0;i<sumavg.length-1;i++)
       {
           System.out.print(sumavg[i]+" ");
       }
       // max element int the sumavg arr
       int max=sumavg[0];
       for(int i=0,j=1;i<sumavg.length-2&&j<sumavg.length-1;i++,j++)
       {
           if(sumavg[i]<sumavg[j]&&sumavg[j]>max)
           {
               max=sumavg[j];
           }
       }
        System.out.println();
       System.out.println("max : "+max);
       
    }
}
public class SlidingWindow1 
{
    public static void main(String[] args)
    {
       
        hello h=new hello(); 
        int[] arr=new int[7];
       arr[0]=100;
       arr[1]=90;
       arr[2]=80;
       arr[3]=120;
       arr[4]=70;
       arr[5]=110;
       arr[6]=60;
        h.sw(arr);
}
}
