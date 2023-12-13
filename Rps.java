import java.util.Scanner;
import java.util.Random;

public class Rps{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 0 for Rock, Enter 1 for Paper, Enter 2 for Scissor");
        int userInput= sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput == computerInput){
            System.out.println("Draw");
        }
        else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1){
            System.out.println("You Won");
        }
        else{
            System.out.println("Computer Win");
        }
        if(computerInput==0){
            System.out.println("Computer Choice is : Rock");
        }
        else if(computerInput==1){
            System.out.println("Computer Choice is : Paper");
        }
        else if(computerInput==2){
            System.out.println("Computer Choice is : Scissor");
        }
    }
}