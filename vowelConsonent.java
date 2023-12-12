public class vowelConsonent {
    public static void main(String[] args) {
        String str="The Quick Brown Fox Jumps Over The Lazy Dog";
        int Vcount=0,Ccount=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
         if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ){
            Vcount++;
         }
         else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
            Ccount++;
         }
        }
        System.out.println("Number of vowels:" + Vcount);
        System.out.println("Number of Consonent:" + Ccount);
    }
}
