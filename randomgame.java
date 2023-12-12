import java.util.Scanner;
public class randomgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber;
        int mynum= (int)(Math.random()*100);
        do{
            System.out.println("Guess the number");
             userNumber = sc.nextInt();
            if(userNumber == mynum){
                System.out.println("Wooo Currect Number");
                break;
            }
            else if(userNumber > mynum){
                System.out.println("Your number is too large");
            }
            else{
                System.out.println("Your number is too small");
            }
        }while(userNumber >=0 );
        System.out.println("My number was...");
        System.out.println(mynum);
    }    
}
