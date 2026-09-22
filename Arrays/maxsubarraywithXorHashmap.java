 import java.util.HashMap;
import java.util.Map;
public class maxsubarraywithXorHashmap {
   

    public static int countSubarraysWithXor(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int currentXor = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            currentXor ^= nums[i];

            int targetXor = currentXor ^ k;

            if (map.containsKey(targetXor)) {
                count += map.get(targetXor);
            }

            map.put(currentXor, map.getOrDefault(currentXor, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println("Total subarrays: " + countSubarraysWithXor(arr, k)); // Output: 4
    }
}

