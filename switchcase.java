import java.util.*;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int age;
        System.out.println("Enter age to check");
        age= sc.nextInt();

        switch(age){
            case 3:
            System.out.println("You are a kid");
            break;
            case 5:
            System.out.println("You are ready to join school");
            break;
            case 14:
            System.out.println("Your hoghschool journey begins");
            break;
            case 16:
            System.out.println("Your intermediate journet begins");
            break;
            case 18:
            System.out.println("Your Geraduation journey begins");
            break;
            case 23:
            System.out.println("You shouls look for a job");
            break;
            default:
            System.out.println("Enter valid age");
        }
    }
}
