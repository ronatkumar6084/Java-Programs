import java.util.Scanner;
public class fibonacci {
 public static void main(String[] args) {
    int n1=0, n2=1, n3, term;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the range");
    term = sc.nextInt();
     System.out.print(n1 + " " + n2);
    for(int i=1;i<term;i++){
        n3= n1+n2;
        System.out.print(" " + n3);
        n1=n2;
        n2=n3;
    }
 }   
}
