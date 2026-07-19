/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fipkartGrid8;

import java.util.HashMap;

class TWS
{
    public int[] twoSum(int[] arr, int target) 
    {
        // key , value
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(arr[0],0);

        int result[] =new int[2]; //result array

        for(int i=1;i<arr.length;i++)
        //containsKey() is much faster than containsValue()
        {
            int diff=target-arr[i];

            if(map.containsKey(diff))
            {
                return new int[]{map.get(diff),i};
            }
            else
            {
                map.put(arr[i],i);
            }
        }

        return result;
    }
}
public class TwoSum {
    
}
