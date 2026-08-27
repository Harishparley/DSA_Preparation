import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leaderInArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        System.out.println(leader(arr)); // Output: [22, 12, 6]
    }

    public static List<Integer> leader(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        int maxRight = arr[n - 1];
        result.add(maxRight); 

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) { 
                maxRight = arr[i];
                result.add(arr[i]);
            }
        }

        Collections.reverse(result);
        return result;
    }
}