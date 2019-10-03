
package collectionsFrameWork;

import java.util.*;


public class Main {
    
    public static void main (String [] args){
       //list:
        List<String> arrayList = new ArrayList<String>();// create a list. Either a ArrayList or LinkedList they are the same mainipulation.
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        //arrayList.so
        //access the list using for each
        for (String string : arrayList)
            System.out.println(string);
        
        arrayList.remove(1);
        System.out.println("list after remove:");
        //accessing the list using iterator
        Iterator listIterator = arrayList.listIterator();
        while(listIterator.hasNext())
            System.out.println(listIterator.next());
        
    //******************************************************************************************************        
        //HashMap: Does NOT make any sort order        
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();//create hash map
       
        hashmap.put(1, "one");
        hashmap.put(2, "two");
        hashmap.put(3, "three");
        hashmap.put(3, "three");//when element with same value key/value added -> ok, if same key but different value -> consider the last added element
        
        System.out.println("Using HashMap:");
        for (Map.Entry entry : hashmap.entrySet()) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
        
        /* or using iterator
        Iterator mapIterator = hashmap.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry entry = (Map.Entry)mapIterator.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
        
        */
        
    //******************************************************************************************************        
      //TreeMap: Sort the elements ascendingly based on key
       TreeMap<String, Double> tm = new TreeMap<String, Double>();  //map of name-balance
       tm.put("Mosheer", 1.1);//automatially Double object created
       tm.put("Basheer", 3.4); //the map still sorted (based on the key) when add new element (so this entry will be the first entry, see that when print)
       tm.put("Basheer", 3.4); //try to insert an entry that its key already exist -> don't allow that. If same key and different value -> consider that last added entry (same as hashMap)
       
       //get the elements from the map. in the same way of hash map
       System.out.println("Using TreeMaps:");
       for(Map.Entry entry : tm.entrySet())
           System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
       
       System.out.println(tm.get("Mosheer"));//get the value of the key Mosheer
        
    }
    
}
