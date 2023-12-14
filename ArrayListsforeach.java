import java.util.ArrayList;
public class ArrayListsforeach {
    public static void main(String[] args) {
        ArrayList<String>obj = new ArrayList<String>();
        obj.add("ronat");
        obj.add("susil");
        obj.add("bimraj");
        obj.add("baya");
        obj.add("geovany");
        for(String name : obj){
            System.out.println(name);
        }

    }
}
