import java.util.Arrays;

public class mergeSortedArrayWithoutExtraSpace {

    public static void main(String[] args) {
        long[] arr1 = {1, 3, 5, 7};
        long[] arr2 = {0, 2, 6, 8, 9};

        System.out.println("Approach 1");
        mergeTwoPointers(arr1, arr2, arr1.length, arr2.length);
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));

        System.out.println("Approach 2");
        mergeGapMethod(arr1, arr2, arr1.length, arr2.length);
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
    //approach 1
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

    
    //approach 2
    public static void swapIfGreater(long[] arr1, long[] arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            long temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }

    public static void mergeGapMethod(long[] arr1, long[] arr2, int n, int m) {
        int len = n + m;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                // here we are looking left in arr1, right in arr2
                if (left < n && right >= n) {
                    swapIfGreater(arr1, arr2, left, right - n);
                }
                // here we are looking  both left and right in arr2
                else if (left >= n) {
                    swapIfGreater(arr2, arr2, left - n, right - n);
                }
                // here we are looking  both left and right in arr1
                else {
                    swapIfGreater(arr1, arr1, left, right);
                }

                left++;
                right++;
            }

            if (gap == 1) {
                break; 
            }
            gap = (gap / 2) + (gap % 2);
        }
    }

}

