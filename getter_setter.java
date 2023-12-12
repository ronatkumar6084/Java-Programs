class newworker{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id=i;
    }
}
public class getter_setter {
    public static void main(String[] args) {
        newworker rkm = new newworker();
        // rkm.id=7;
        // rkm.name="ronat"; cant access private fields in another class

        rkm.setId(101);
        System.out.println(rkm.getId());
        rkm.setName("Ronat Kumar");
        System.out.println(rkm.getName());
    }
}
