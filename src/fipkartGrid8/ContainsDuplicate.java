/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fipkartGrid8;

import java.util.HashSet;

class CDS {
    public boolean containsDuplicate(int[] arr) 
    {
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {

            if(set.contains(arr[i]))
            {
                return true;
            }
            set.add(arr[i]);
        }

        return false;

    }
}
public class ContainsDuplicate {
    
}
