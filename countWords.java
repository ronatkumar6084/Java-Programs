public class countWords {
    public static void main(String[] args) {
        String s= "The quick brown fox jumps over the lazy dog.";
        String words[]= s.split(" ");
        System.out.println("The Number of words present in the string are : " + words.length);
    }
}
