public class smallesElementArray {
    public static void main(String[] args) {
        int arr[]=new int[]{52,25,12,21,3,9,1};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("Smallest element in array is:" + min);
    }
    
}
