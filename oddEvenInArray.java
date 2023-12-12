public class oddEvenInArray {
    public static void main(String[] args) {
        int arr[]={12,52,65,87,89,54,223};
        System.out.println("Odd numbers in array are");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Even numbers in array are");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }

    }    
}
