import java.util.*;

public class PrintFriendsName {
    public static void main(String[] args) {
        String str1, str2, str3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        str1 = sc.nextLine();
        System.out.println("Enter second Name");
        str2= sc.nextLine();
        System.out.println("Enter third Name");
        str3= sc.nextLine();

        System.out.println("Hii " + str3 + ", " + str2 + " and " + str1);
        sc.close();
    }
}
