import java.util.*;

public class cieling {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 19;

        Scanner sc = new Scanner(System.in);
        System.out.println("choose between cieling and floor");
        String choice = sc.nextLine();
        int ans = search(arr, target, choice);
        System.out.println(ans);
    }

    public static int search(int[] arr, int target, String choice) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else { 
                return arr[mid];
            }
        }

        if (choice.equals("cieling")) {
            if (start == arr.length) {
                return -1;
            }
            return arr[start];
        } else {
            if (end == -1) {
                return -1;
            }
            return arr[end];
        }
    }

}