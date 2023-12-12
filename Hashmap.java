import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        //to insert
        map.put("India", 160);
        map.put("USA", 33);
        map.put("Canada", 30);
        map.put("Russia", 80);
        System.out.println(map);
        map.put("USA",40 );
        System.out.println(map);

        //to search key
        if(map.containsKey("India")){
            System.out.println("Key is present in map");
        }
        else{
            System.out.println("Key is not presenti in map");
        }
        
        if(map.containsKey("Japan")){
            System.out.println("Key is present in map");
        }
        else{
            System.out.println("Key is not present in map");
        }

        //to get value of key
        System.out.println(map.get("Russia"));
        System.out.println(map.get("Japan"));

        //to iterate
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> Keys= map.keySet();
        for(String key : Keys){
            System.out.println(key+" "+map.get(key));
        } 

        //to remove
        map.remove("Russia");
        System.out.println(map);
    }
}
