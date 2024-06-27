import java.util.*;
public class ConvertToAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the String ");
        String str = sc.nextLine();

        int[] asciiValues = new int[str.length()];

        for(int i=0;i<str.length();i++){
            asciiValues[i] = (int) str.charAt(i);
        }

        System.out.print("ASCII Value ");
        for( int asciiValue : asciiValues){
            System.out.print(asciiValue + " ");
        }
        sc.close();;
    }
}
