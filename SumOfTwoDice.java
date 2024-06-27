import java.util.*;
public class SumOfTwoDice {
    public static void main(String[] args) {
        Random random = new Random();

        int die1 = random.nextInt(6)+1;
        int die2 = random.nextInt(6)+1;
        int sum = die1+ die2;

        System.out.println("Dice 1 is " + die1);
        System.out.println("Dice 2 is " + die2);
        System.out.println("Sum of Dice is " + sum);
    }
}
