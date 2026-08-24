import java.util.Arrays;

public class nextPermutationLc31 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 6, 5};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr)); 
    }
     
    public static void nextPermutation(int[] arr) {
        int index = -1;
        int n = arr.length;
        
        for (int i = n - 2; i >= 0; i--) { 
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = n - 1; i > index; i--) {
                if (arr[i] > arr[index]) {
                    swap(arr, i, index);
                    break;
                }
            }
        }

        reverse(arr, index + 1, n - 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}