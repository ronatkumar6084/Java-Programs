abstract class realme{
    public abstract void show();
    public abstract void play();
}
public class rkm_abstract_annonymous_class {
   public static void main(String[] args) {
    realme obj = new realme() {
        
        public void show(){
            System.out.println("in A show");
        }

        public void play(){
            System.out.println("playing musix");
        }
    };
    obj.show();
    obj.play();
   } 
}
