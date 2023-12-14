// By changing no. of arguments
class adder{
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}
public class rkm_methodOverloading2 {
    public static void main(String[] args) {
        System.out.println(adder.add(23,45));
        System.out.println(adder.add(45,67, 98));

    }
}
