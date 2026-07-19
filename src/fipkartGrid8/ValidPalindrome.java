/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fipkartGrid8;

//try with two pointer approach next time...
class VPS 
{
    public boolean isPalindrome(String s) 
    {
        //to lowercase
        s=s.toLowerCase(); // O(n)

        String str="";

        for(int i=0;i<s.length();i++) //O(n)
        {
            char ch=s.charAt(i);

            if(ch>=97 && ch<=122 || ch>=48 && ch<=57) // 97=> a ===> 122=> z in ASCII
            // 48==> 0 and 57 ==> 9 INTEGERS
            {
                str=str+ch;
            }
            /*
            this could have done as well.....
if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))
{
    str = str + ch;
}
        */    
            //else dont concate in new string str

        }

        String rev="";

        for(int i=str.length()-1;i>=0;i--)
        {
            char a=str.charAt(i);
            rev=rev+a;
        }

        return str.equals(rev);
        

    }
}
public class ValidPalindrome {
    
}
