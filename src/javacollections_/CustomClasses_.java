
package javacollections_;

class data  //data class
{
  private int n;
    private String str; // diff types of data members
   private float f;
   
   //constructor with diff typa parameters => no garbage value
   data(int n,String str,float f)
   {
       this.n=n;
       this.str=str;
       this.f=f;
   }
   //setter : set values
   public void setn(int num)
   {
       this.n=num;
      
   }
   
   public void setstr(String name)
   {
       this.str=name; 
   }
   
   //getter : get the values
   public int getn()
   {
       return n;
      
   }
   public String getstr()
   {
       return str;
      
   }
   
   
}
public class CustomClasses_ 
{
    public static void main(String[] args)
    {
      //object of the class 
        data dataobj1=new data(1,"isha",23.45f);
        data dataobj2=new data(2,"Naman", 23.45f);
        data dataobj3=new data(2,"Vibhor", 23.45f);
        //setting and getting the values
        dataobj1.setn(10);
        System.out.println(dataobj1.getn());
    }
}
