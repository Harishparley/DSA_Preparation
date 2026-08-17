public class missingnumber_lc268 {

public static void main(String[] args) {
    int [] nums = {1,0,4,2};
   System.out.println(missingNumber(nums)); 
}

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int summation = (n*(n+1))/2;
        int sum =0;
        for(int i=0; i<nums.length; i++){
            sum +=nums[i];
        }
        int result = summation-sum;
         return result;

    }

}
