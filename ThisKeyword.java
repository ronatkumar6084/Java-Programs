class Human
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }
}

public class ThisKeyword{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(23);
        obj.setName("Ronat");

        System.out.println(obj.getName() +" : "+obj.getAge());
    }
}

//This is the key word which represents current object. The object which is calling method.This is reffering to the current object who is calling the method.