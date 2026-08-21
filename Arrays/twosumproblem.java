import java.util.Arrays;
import java.util.HashMap;

public class twosumproblem {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15, 4 };
        int target = 6;
        System.out.println(Arrays.toString(twoSumSearch(arr, target)));
        System.out.println(Arrays.toString(twoSum(arr, target)));

    }


    //brute force TC=  O(n spquare)
    public int[] twoSumB(int[] nums, int target) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
     return new int[]{};

    }

    //better solution TC = O(n)
    public static int[] twoSumSearch(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean contains = true;

        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];
            if (contains = map.containsKey(needed)) {
                return new int[] { map.get(needed), i };
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[] {};

    }

    //optimal if array is sorted tc = O(n)
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while (i < j) {
            int sum = nums[i] + nums[j];

            if (sum == target) {
                return new int[] { i, j };
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }

        return new int[] {};
    }

}
