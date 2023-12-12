public class reversenum {
    public static void main(String[] args) {
        int k,rev=0;
        int num= 564;
        while(num>0){
            k=num%10;
            rev=rev*10+k;
            num=num/10;
        }
        System.out.println("reverse is " + rev);
    }
}
