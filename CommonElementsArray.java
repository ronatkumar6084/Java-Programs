// import java.util.ArrayList;
// import java.util.Arrays;
// public class CommonElementsArray {
//     public static void main(String[] args) {
//         String[] array1 = {"apple", "banana", "cherry", "date", "fig"};
//         String[] array2 = {"cherry", "date", "elderberry", "fig", "grape"};

//         ArrayList <String> commonList = new ArrayList<>();
//         for(String element : array1){
//             if(Arrays.asList(array2).contains(element)){
//                 commonList.add(element);
//             }
//         }

//         String[] commonArray = commonList.toArray(new String[0]);

//         System.out.println("Common elements are " + Arrays.toString(commonArray));
//     }
// }
import java.util.ArrayList;
import java.util.Arrays;

public class CommonElementsArray{

    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry", "date", "fig"};
        String[] array2 = {"cherry", "date", "elderberry", "fig", "grape"};

        // Find common elements
        ArrayList<String> commonList = new ArrayList<>();
        for (String element : array1) {
            if (Arrays.asList(array2).contains(element)) {
                commonList.add(element);
            }
        }

        // Convert ArrayList to array
        String[] commonArray = commonList.toArray(new String[0]);

        // Print common elements
        System.out.println("Common elements: " + Arrays.toString(commonArray));
    }
}

