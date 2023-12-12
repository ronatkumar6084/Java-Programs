class employee{
    String name;
    static String company;
}
public class staticoops {
    public static void main(String[] args) {
        employee.company= "Accenture";
        employee e1 = new employee();
        e1.name="YTUI";
        System.out.println(e1.company);
        System.out.println(e1.name);
    }
}
