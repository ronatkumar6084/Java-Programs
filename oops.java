class pen{
 String Color;
 String Type;

public void write(){
    System.out.println("Writing Somethhing");
}
public void printColor(){
    System.out.println(this.Color);
}
}
public class oops{
 public static void main(String[] args) {
    pen pen1= new pen();
    pen1.Color= "blue";
    pen1.Type="gel";

    pen pen2=new pen();
    pen2.Color="black";
    pen2.Type="ballpoint";

    pen1.printColor();
    pen2.printColor();

    pen1.write();
 }
}