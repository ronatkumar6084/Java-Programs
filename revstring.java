import java.util.*;
public class revstring{
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);  
        System.out.println("enter the string");
        str = sc.nextLine();
        System.out.println("after reversing");
        for (int i=str.length();i>0;i--){
            System.out.print(str.charAt(i-1));
        }

    }
}