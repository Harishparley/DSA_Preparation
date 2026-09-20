public class lc153 {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 1, 2 };
        System.out.println(searchMin(nums));
    }

    public static int searchMin(int[] nums) {

        if (nums == null || nums.length == 0) {
            return -1;
        } 
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
       
            return nums[start];

        
    }

}
