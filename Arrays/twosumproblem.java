import java.util.Arrays;
import java.util.HashMap;

public class twosumproblem {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumSearch(arr, target)) );
    }
    public static int [] twoSumSearch(int []arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean contains =true;

        for(int i=0; i<arr.length; i++){
            int needed = target - arr[i];
            if(contains = map.containsKey(needed)){
            return new int[] { map.get(needed), i };
            }else{
                map.put(arr[i], i);            
            }
        } 
        return new int[] {};

    }

       // public int[] twoSum(int[] nums, int target) {
    //     int n = nums.length;
    //     for(int i=0; i<n; i++){
    //         for(int j=i+1; j<n; j++){
    //             if(nums[i]+nums[j]==target){
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //  return new int[]{};

    // }
    
}


 


