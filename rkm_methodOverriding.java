class Abc{
    public void meth5(){
        System.out.println("I'm meth5 of class Abc");
    }
}
class Bcd extends Abc{
     public void meth5(){
        System.out.println("I'm meth5 of class Bcd");
    }
    public void meth6(){
        System.out.println("I'm meth6 of class Bcd");
    }
}

public class rkm_methodOverriding {
    public static void main(String[] args) {
        Abc az = new Abc();
        az.meth5();

        Bcd bz = new Bcd();
        bz.meth5();
        bz.meth6();

    }
}
