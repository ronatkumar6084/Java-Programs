import java.util.Scanner;

public class CelToFah  {
    public static void main (String args[])  
    { 
        Scanner sc = new  Scanner(System.in);
        float Fahrenheit, Celsius;  

          System.out.println(" Enter temp to conver Fahrenhite: ");
          Celsius = sc.nextFloat();
          
          Fahrenheit =((Celsius*9)/5)+32;  
          System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
          sc.close();
    }
}
