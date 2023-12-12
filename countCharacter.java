public class countCharacter{
    public static void main(String[] args) {
        String str="The Quick Brown Fox Jumps Over The Lazy Dog";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ')
            count++;
        }
        System.out.println("The total number of characters are in given string is:" + count);
    }
}