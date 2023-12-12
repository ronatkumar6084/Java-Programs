class worker{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My Id is "+id);
        System.out.println("My name is "+name);
    } 
}
public class custom_class {
    public static void main(String[] args) {
        worker R1 = new worker();
        worker N1 = new worker();

        R1.id=1;
        R1.name="Ronat";

        N1.id= 101;
        N1.name="Nihar";

        R1.printDetails();
        N1.printDetails();


    }
}
