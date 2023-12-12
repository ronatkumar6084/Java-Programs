public class rkm_try_catch {
    public static void main(String[] args) {
        try{
        int arr[]={1,2,3,4};
        System.out.println(arr[10]);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("some thing went wrong");
        }
        finally{
            System.out.println("end of the program");
        }
    }
}
