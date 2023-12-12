import java.util.Scanner;
public class sumOfEnterNms {
  public static void main(String[] args) {
    int count, number ,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number count");
    count = sc.nextInt();
    System.out.println("Enter numbers");
    for(int i=0;i<count;i++){
        number= sc.nextInt();
        sum+=number;
    }
    System.out.println("addition of number is " + sum);
    
  }  
}
