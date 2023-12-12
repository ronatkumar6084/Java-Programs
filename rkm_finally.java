public class rkm_finally {

    public static int  greet(){
        try{
            int a=12;
            int b =6;
            int c=a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is end of the program");
        }
        return 0;
    }
    public static void main(String[] args) {
        // int k=greet();
        // System.out.println(k);  

        greet();     
    }
    
}
