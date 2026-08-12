// optimal soln

import java.util.Arrays;

public class moveZeroEnd{

    public static void main(String[] args) {
        int [] arr = {1,0,2,3,2,0,0,4,3,1};

     int j=-1;
     for(int i = 0; i<arr.length; i++){
        if(arr[i]==0){
            j=i;
            break;
        }
     }
        if (j != -1) {

     for(int i = j+1; i<arr.length; i++){
        if(arr[i]!=0){
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j++;

        }
     }
    }
     System.out.println(Arrays.toString(arr));

    }
}


// better clean code 

// class Solution {
//     public void moveZeroes(int[] nums) {
//         int j = 0;
//         for(int i=0; i<nums.length; i++){
//             if(nums[i]!=0){
//                 int temp = nums[i];
//                 nums[i]=nums[j];
//                 nums[j]=temp;

//                  j++;
//             }
//         }
//     }
// }