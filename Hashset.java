// import java.util.HashSet;
// import java.util.Iterator;
import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //to add or insert
        set.add(4);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(1);
        System.out.println(set);

        //to search
        if(set.contains(2)){
            System.out.println("Set contains 2");
        }
        if(!set.contains(8)){
            System.out.println("Set doesnot contain 8");
        }

        //to remove or delete
        set.remove(4);
        System.out.println(set);

        //to find size
        System.out.println("Size of the set is: " + set.size());
        System.out.println(set);

        //to Iterate
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
