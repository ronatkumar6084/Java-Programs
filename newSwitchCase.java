import java.util.Scanner;

public class newSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int age;
        System.out.println("Enter age to check");
        age= sc.nextInt();
            switch(age){
            case 3->System.out.println("You are a kid");
            case 5->System.out.println("You are ready to join school");
            case 14->System.out.println("Your highschool journey begins");
            case 16->System.out.println("Your intermediate journey begins");
            case 18->System.out.println("Your Graduation journey begins");
            case 23->System.out.println("You should look for a job");
            default->System.out.println("Enter valid age");
        }
    }
}
