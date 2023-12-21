class anno{
    public void show(){
        System.out.println("In a show");
    }
}
public class rkm_annonymous_inner_class {
    public static void main(String[] args) {
        anno nym = new anno(){
            public void show(){
                System.out.println("In the show");
            }
        };
        nym.show();
    }
}
