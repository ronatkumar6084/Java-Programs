class one{
    public void greet(){
        System.out.println("Greetings to you");
    }
    public void name(){
        System.out.println("This Is My Name");
    }
}
class two extends one{
    public void swagat(){
        System.out.println("Apka swagat hai");
    }
    public void name(){
        System.out.println("What Is Your Name");
    }
}
public class rkm_dynamicmethoddispatch {
    public static void main(String[] args) {
        one obj = new two();
        obj.name();
        obj.greet();
        //obj.swagat(); Not Allowed
    }
}
