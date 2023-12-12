abstract class Base2{
    public Base2(){
        System.out.println("I'm constructor of Base2");
    }
    public void sayHello(){
        System.out.println("Hello All");
    }
    abstract public void greet();
    abstract public void greet2();
}
 class Base3 extends Base2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    public void greet2(){
        System.out.println("Good Afternoon");
    }
 }

public class rkm_abstract {
    public static void main(String[] args) {
        Base2 obj = new Base3();
        obj.greet();
        obj.greet2();
        obj.sayHello();
    }
}
