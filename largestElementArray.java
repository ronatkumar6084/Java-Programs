public class largestElementArray {
    public static void main(String[] args) {
        int arr[]= new int[]{12,45,89,78,36,78,52};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("Largest element in array is:" + max);
    }   
}
