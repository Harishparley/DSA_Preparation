public class maximumAverageSubarrayLc643 {
    public static void main(String[] args) {
        int[] arr = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
      System.out.println(search(arr, k));  
    }

    public static double search(int[] arr, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;

        for (int i = k; i < arr.length; i++) {

            sum = sum - arr[i - k] + arr[i];

            maxSum = Math.max(maxSum, sum);
        }
        double ans= (double)maxSum / k;

        return  ans;
    }
}
