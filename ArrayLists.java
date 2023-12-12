import java.util.ArrayList;
// import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();

        //add element
        list.add(0);
         list.add(2);
          list.add(5);
          list.add(3);
          list.add(3);// allows duplicate stores in order

          System.out.println(list);

          //get element

          int elem=list.get(2);
          System.out.println(elem);

          //add element in between

          list.add(1, 1);
          System.out.println(list);

          //set/replce element

          list.set(0, 6);
          System.out.println(list);

          //remove

          list.remove(3);
          System.out.println(list);

          //size

          int size=list.size();
          System.out.println(size);

          //loops
          for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
          }

          //sorting
          // Collections.sort(list);
          // System.out.println(list);

    }
    
}
