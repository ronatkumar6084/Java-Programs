import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        int x,y,z;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter first number");
            x= sc.nextInt();
            System.out.println("enter second number");
            y= sc.nextInt();
        }
        z=x+y;
        System.out.println("sum is" + z);
    }
}
