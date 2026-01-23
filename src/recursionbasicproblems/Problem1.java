/*
print a name n times

*/
package recursionbasicproblems;
import java.util.Scanner;
public class Problem1 
{
    // here n = 5
   
    public static void f(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println("Isha Parihariya");
        f(i+1,n);
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt(); // taking n i/p its the number of ties the name needs to be printed
        f(1,n);
    }
}
/*
Enter n : 9
Isha Parihariya
Isha Parihariya
Isha Parihariya
Isha Parihariya
Isha Parihariya
Isha Parihariya
Isha Parihariya
Isha Parihariya
Isha Parihariya
*/
