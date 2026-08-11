public class Maxsubarraysum {
     public static void main(String[] args) {
        int []arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.err.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] arr) {

        int sum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (sum + arr[i] > arr[i]) {
                sum = sum + arr[i];
            } else {
                sum = arr[i];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}

