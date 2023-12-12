class account{
    public String name;
    protected String Email;
    private String password;

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
}
public class accmodfr {
    public static void main(String[] args) {
        account acc1 = new account();
        acc1.name = "ABC";
        acc1.Email = "Examplea@mail.com";
        acc1.setPassword("abcd");
        System.out.println(acc1.getPassword());
        System.out.println(acc1.name);
        System.out.println(acc1.Email);
    }
}
