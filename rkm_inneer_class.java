class dell{
    public void show(){
        System.out.println("Showing");
    }

    class hp{
        public void config(){
            System.out.println("Configure");
        }
    }

    static class acer{
        public void nitro(){
            System.out.println("nitropower");
        }
    }
}
public class rkm_inneer_class {
    public static void main(String[] args) {
        dell obj = new dell();
        obj.show();

        dell.hp obj1= obj.new hp();
        obj1.config();

        dell.acer obj2= new dell.acer();
        obj2.nitro(); 
    }
}
