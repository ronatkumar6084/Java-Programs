import java.util.*;
public class swapping {
    public static void main(String[] args) {
        int first , second;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter values of first number and  second number");
        first = sc.nextInt();
        second = sc.nextInt();
        System.out.println("Before swapping"+" "+first+" "+ second);
        first = first+second;
        second= first-second;
        first= first-second;
        System.out.println("After swapping"+" "+ first+" "+ second);
    }
}
