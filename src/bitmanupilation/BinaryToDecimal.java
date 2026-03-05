// conversion from binary to decimal
package bitmanupilation;

import java.math.*;
class BinaryToDecimalConversion
{
    
    public String binaryToDecimal(String binary)
    {
        String result="";
        double sum=0;
        for(int i=binary.length()-1;i>-1;i--)
        {
            int power = binary.length() - 1 - i;
            
                int bit =binary.charAt(i)-'0'; 
                /*
In ASCII:
'1' = 49
'0' = 48

So:
'1' - '0' = 49 - 48 = 1
'0' - '0' = 48 - 48 = 0
*/
               sum = sum+ bit* Math.pow(2, power);
          
        }
        
         return result=String.valueOf(sum);
        //return result;
    }
}
public class BinaryToDecimal 
{
    public static void main(String[] args)
    {
        BinaryToDecimalConversion obj=new BinaryToDecimalConversion();
        String result=obj.binaryToDecimal("1101");// 13
        System.out.println(result);
    }
}
