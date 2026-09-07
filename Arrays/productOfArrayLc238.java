import java.util.Arrays;

public class productOfArrayLc238{ 
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,};
       System.out.println(Arrays.toString(product(nums)));

    }
    public static int[]product(int []nums){
       int [] result = new int[nums.length];
       result[0] = 1;

       for(int i =1; i<nums.length; i++){
          result[i]=result[i-1]*nums[i-1];
       }

       int right =1;
       for(int i=nums.length-2; i>=0; i--){
        right *= nums[i+1];
        result[i]*=right;
       }

       return result;
    }



}    

//  public static int[] productExceptSelf(int[] nums) {
//         int [] result = new int[nums.length];
//         int index=0;
//         int product=1;
//         for(int i=0; i<=nums.length-1; i++){
//             for(int j=0; j<nums.length; j++){
//                 product*=nums[j];
//             }
//             product= product/nums[i];

//             result[index]=product;
//             product=1;
//             index++;
            
//         }
//         return result;
//     }
// }