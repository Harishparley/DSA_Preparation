public class arraycontainssingleElementLc136 {
    
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,2};
      System.out.println(singleNumber(nums));  
    }
    
    
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    
}
}
