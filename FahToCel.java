import java.util.*;
public class FahToCel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float Celcious, Fahrenhite;

        System.out.println("Enter Temp to convert Celcious");
        Fahrenhite = sc.nextFloat();

        Celcious = ((Fahrenhite-32)*5)/9;
        System.out.println("Temperature in Celcious is "+Celcious);
        sc.close();
    }
}
