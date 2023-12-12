import java.util.Scanner;
public class countspace{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int count=0;
        System.out.println("Enter a string");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("total spaces are: " + count);
    }
}
