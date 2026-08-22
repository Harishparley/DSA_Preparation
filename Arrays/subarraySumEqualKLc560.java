import java.util.HashMap;

public class subarraySumEqualKLc560 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int k = 3;
        System.out.println(subarraySumnew(arr, k));
    }

    // public static int subarraySum(int[] arr, int k) {
    // int count = 0;

    // for (int i = 0; i < arr.length; i++) {

    // int sum = 0;

    // for (int j = i; j < arr.length; j++) {

    // sum += arr[j];

    // if (sum == k) {
    // count++;
    // }
    // }
    // }

    // return count;
    // }

    public static int subarraySumnew(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int remove = prefixSum - k;
            if (map.containsKey(remove)) {
                count += map.get(remove);
            } 
                map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
            
        }

        return count;
    }
}
