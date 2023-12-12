public class removeSpace {
    public static void main(String[] args) {
        String str="The Quick Brown Fox Jumps Over The Lazy Dog";
        System.out.println("Before replacing spaces: " + str);
        str=str.replaceAll("\\s+", "");
        System.out.println("After replacing white spaces: " + str);
    }
}
