import java.util.Scanner;
public class decimaltobinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimalNumber= sc.nextInt();
        String binaryNumber = convertToBinary(decimalNumber);
        System.out.println("Binary Represntation is " + binaryNumber);
    }
    private static String convertToBinary(int decimalNumber){
        return Integer.toBinaryString(decimalNumber);
    }
}