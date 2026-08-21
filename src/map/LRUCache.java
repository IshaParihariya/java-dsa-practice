
package map;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache1
{
    int cap=0;
    Map<Integer,Integer> map;

    public LRUCache1(int capacity) 
    {
        cap=capacity;
        map=new LinkedHashMap<>(cap,0.75f,true); //NEW STUFF
        // ACCESS ORDER INSTEAD OF INSERTION ORDER
        

        
    }
    
    public int get(int key) 
    {
        if(map.containsKey(key))
        {
            return map.get(key);
        }
        else
        {
            //doesnt exists
            return -1;
        }
        
    }
    
    public void put(int key, int value) 
    {
        //if key already exists in the map
        //and diff value so we need to simply 
        //update the value
        if(map.containsKey(key))
{
    map.put(key, value);
    return;
}

        else if(cap>map.size())
        {
            map.put(key,value);
        }
        else if(cap==map.size())
        {
            //need to remove one from it
            //not used recently or which is older one..
            int k=map.keySet().iterator().next();
            map.remove(k);
            map.put(key,value);

        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
public class LRUCache {
    
}
