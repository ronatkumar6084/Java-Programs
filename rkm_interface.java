interface Bycycle{
    int a = 34;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface HornBycycle{
    void blowHornk3g();
    void blowHornMhn();
}
 class avonCycle implements Bycycle,  HornBycycle{
    void blowHorn(){
        System.out.println("pe pe pe");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    public void speedUp(int increment){
        System.out.println("Speeding up");
    }
    public void blowHornk3g(){
        System.out.println("kabhi khusi kabhi gum");
    }
    public void blowHornMhn(){
        System.out.println("Mein Hoon Na");
    }
 }
 public class rkm_interface {
 
    public static void main(String[] args) {
        avonCycle rkmCycle = new avonCycle();
        rkmCycle.applyBreak(1);
        rkmCycle.speedUp(1);
        // rkmCycle.a= 23;
        System.out.println(rkmCycle.a);
        rkmCycle.blowHornk3g();
        rkmCycle.blowHornMhn();
        rkmCycle.blowHorn();
    }
 }