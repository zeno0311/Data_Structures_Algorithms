package LECTURES;
import java.util.ArrayList;
import java.util.Collections;
public class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        // adding integers to list
        list.add(10);
        list.add(20);
        list.add(30);

        // displaying list
        System.out.println(list);

        // getting elements from list
        System.out.println(list.get(0));

        // adding element between elements
        list.add(1,15);
        list.add(3,25);
        System.out.println(list);

        // set element
        list.set(0,5);
        System.out.println(list);

        // delete element
        list.remove(0);
        System.out.println(list);

        // size of the list
        int size=list.size();
        System.out.println(size);

        // iterating through list
        for(int i=0;i<size;i++){
            System.out.println(list.get(i));
        }

        // sorting 
        Collections.sort(list);
        System.out.println(list);



    }
}