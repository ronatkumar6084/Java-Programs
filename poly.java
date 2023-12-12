class studentv1{
    String name;
    int age;
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name, int age){
        System.out.println(name + " " + age);
    }
}
public class poly {
    public static void main (String[]args) {
        studentv1 s1 = new studentv1();
        s1.name = "Ronat";
        s1.age= 22;
        s1.printinfo(s1.name, s1.age);
    }
}
