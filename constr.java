class student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
  student(){
    System.out.println("Constructor called");
  }  
}
public class constr {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name= "Ronat";
        s1.age = 22;
        s1.printinfo();
    }
}
