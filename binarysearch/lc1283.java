public class lc1283 {
    public static void main(String[] args) {
        int[] nums = { 44, 22, 33, 11, 1 };
        int threshold = 5;
        System.out.println(smallestDivisor(nums, threshold));

    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = 0;
        for (int num : nums) {
            end = Math.max(end, num);
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (checkSum(nums, threshold, mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;

    }

    public static boolean checkSum(int[] nums, int threshold, int divisor) {
        int totalSum = 0;
        for (int num : nums) {

            totalSum += (num + divisor - 1) / divisor;
            // totalSum +=(int)Math.ceil((double)num/divisor);


            if (totalSum > threshold) {
                return false;
            }
        }

        return totalSum <= threshold;

    }

}
