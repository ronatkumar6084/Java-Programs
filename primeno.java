import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i;
    System.out.println("Enter Number");
    int n = sc.nextInt();
    for( i=2;i<n;i++){
        if(n%i==0){
            break;
        }
    }        
    if (i==n){
        System.out.println("prime number");
    }
    else{
        System.out.println("not prime");
    }
    }
}
