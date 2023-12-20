public class rkm_try_catch2 {
    public static void main(String[] args) {
        int i=2,j=0;
        int arr[]= new int[5];
        String str = null;
        try{
            j=18/i;
            System.out.println(str.length());
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        }
        //   catch(Exception e){
        //     System.out.println("Some thing went wrong. "+ e);
        // } not allowed beacause exception class handles all exceptions.
        catch(ArithmeticException e){
            System.out.println("Some thing went wrong. "+ e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You are exceding limit "+ e);
        }
        catch(Exception e){
            System.out.println("Some thing went wrong. "+ e);
        }//better to keep parent claa at end.
        System.out.println(j);
        System.out.println("Get Lost");
    }
}
