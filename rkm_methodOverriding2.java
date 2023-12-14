class Bank{
    int getRateOfIntrest(){
        return 0;
    }
}
class SBI extends Bank{
    int getRateOfIntrest(){
        return 7;
    }
}
class ICICI extends Bank{
    int getRateOfIntrest(){
        return 8;
    }
}
class AXIS extends Bank{
    int getRateOfIntrest(){
        return 9;
    }
}
public class rkm_methodOverriding2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate Of Intrest is "+s.getRateOfIntrest());
        System.out.println("IICIC Rate Of Intrest is "+i.getRateOfIntrest());
        System.out.println("AXIS Rate Of Intrest is "+a.getRateOfIntrest());
    }
}
