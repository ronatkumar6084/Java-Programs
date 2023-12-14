//changing data type of arguments
class adder2{
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
}
public class rkm_methodOverloading3 {
    public static void main(String[] args) {
        System.out.println(adder2.add(34, 56));
        System.out.println(adder2.add(567.76, 446.78));
    }
}
