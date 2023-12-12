public class sumOfArray {
    public static void main(String[] args) {
        int arr[]=new int[]{52,85,45,65,53,51,57,59};
        int sum=0;
        for(int i=0;i<arr.length;i++){
          sum=sum+arr[i];
        }
        System.out.println("Sum of the elements is:" +sum);
    }   
}
