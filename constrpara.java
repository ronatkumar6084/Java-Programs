class student1{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    student1(String name, int age){
        this.name= name;
        this.age = age;
    }
}
public class constrpara {
   public static void main(String[] args) {
    student1 s1= new student1("Ronat",22 );
    s1.printInfo();
   } 
}
