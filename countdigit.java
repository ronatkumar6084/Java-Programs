import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ,count=0;
        System.out.println("enter the number");
        num = sc.nextInt();
        while(num !=0){
            num= num/10;
            count++;
        }
        System.out.println("number of digits are: " + count);

    }
}
