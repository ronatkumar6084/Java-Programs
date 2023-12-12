public class Palindrome {
    public static void main(String[] args) {
        int k,rev=0,temp;
        int num=454;
        temp = num;
        while(num>0){
            k= num%10;
            rev=rev*10+k;
            num=num/10;
        }
        if(temp==rev)
            System.out.println("palindrome");
        
        else
            System.out.println("not palindrome");
        

    }
}
