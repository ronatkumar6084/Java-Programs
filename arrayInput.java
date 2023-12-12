import java.util.*;
public class arrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Array Size");
        int size = sc.nextInt();
        int number[] = new int[size];

        //for input to array
        for(int i=0;i<size;i++){
            number[i]= sc.nextInt();
        }

        //for display
        for(int i=0;i<size;i++){
            System.out.println(number[i]);
        }
    }
}
