package LECTURES;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        // creating an hashset
        HashSet<Integer> set=new HashSet<>();

        //adding elements to set
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(15);
        
        // displaying elements in set
        System.out.println(set);

        // checking if set contains specific elemnts
        System.out.println(set.contains(10));

        //delete in a set
        set.remove(15);
        System.out.println(set);

        // size of set
        System.out.println(set.size());

        set.add(15);
        set.add(20);

        //iterator in sets // used to traverse same as for loop
        Iterator it=set.iterator();
        // iterator contain two functions hasNext; next;
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
