import java.util.Scanner;
public class power2s {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter an integer");
    int input = sc.nextInt();
    double result= Math.pow(2, input);
    System.out.println("2 raised power of " + input + " is " + result);
  }
}