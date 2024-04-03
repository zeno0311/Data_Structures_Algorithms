package LECTURES;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        // creating a hashmap  // example key=country, value=population
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",120);
        map.put("US",50);
        map.put("china",130);

        // printing map
        System.out.println(map);

        //adding key already that is present
        map.put("china",180);

        System.out.println(map);

        //searching in map contains 2 types // containsKey, contains
        System.out.println(map.containsKey("India")); // returns true if key is present

        // getting value of the key
        System.out.println(map.get("china"));

        //iterating through map
        for(Map.Entry<String, Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        // create a set only for key values
        Set<String> keys=map.keySet();
        for(String Key:keys){
            System.out.println(Key);
        }

        // remove a pair from map
        map.remove("US");


    }
}
