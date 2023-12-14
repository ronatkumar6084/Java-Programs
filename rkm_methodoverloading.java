
public class rkm_methodoverloading {
    static void tellJoke(){
        System.out.println("Tell me a joke.");
    }
    static void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning "+a+" Bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good Morning "+a+" Bro!");
         System.out.println("Good Morning "+b+" Bro!");
    }
    public static void main(String[] args) {
        tellJoke();
        foo();
        foo(33);
        foo(56, 78);
    }
}
