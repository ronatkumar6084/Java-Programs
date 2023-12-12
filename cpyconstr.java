class students22{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    students22(){
    }
    students22(students22 s2){
        this.name= s2.name;
        this.age = s2.age;
    }
}
public class cpyconstr {
    public static void main(String[] args) {
        students22 s1 = new students22();
        s1.name="Ronat";
        s1.age= 22;
        students22 s2= new students22(s1);
        s2.printInfo();
    }
}
