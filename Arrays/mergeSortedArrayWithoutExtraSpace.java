import java.util.Arrays;

public class mergeSortedArrayWithoutExtraSpace {

    public static void mergeTwoPointers(long[] arr1, long[] arr2, int n, int m) {
        int left = n - 1;
        int right = 0;    

        // Swap out-of-order elements between both arrays
        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        long[] arr1 = {1, 3, 5, 7};
        long[] arr2 = {0, 2, 6, 8, 9};

        mergeTwoPointers(arr1, arr2, arr1.length, arr2.length);
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}

