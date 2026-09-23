import java.util.Arrays;

public class BuildArrayfromPermutationLc1920 {
     public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,0,5};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
