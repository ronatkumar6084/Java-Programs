//for each loop
public class EnhancedForLoop {
    public static void main(String[] args) {
        int nums[] = new int[4];

         nums[0]=4;
         nums[1]=7;
         nums[2]=8;
         nums[3]=0;

        //  for(int i=0;i<nums.length;i++){
        //     System.out.print(nums[i] + " " );
        //  }

         for (int n:nums){
            System.out.print(n +" ");
         }
    }
    

}
