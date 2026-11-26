package sorting;

public class mergeSort {
    private static int left;
    private static int left2;

    public static void main(String[] args) {
        int[] arr = { 14, 9, 15, 12, 6, 8, 13 };
        int n=arr.length;
        divide(arr, 0, n-1);
        for (int i = 0; i <n-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int left= low;
        int right = mid + 1;
        int ind = 0;
        while (left<= mid && right <= high) {
            if (arr[low] > arr[right]) {
                temp[ind++] = arr[right++];
            } else {
                temp[ind++] = arr[left++];
            }
        }
        while (left <= mid) {
            temp[ind++] = arr[left++];
        }
        while (right <= high) {
            temp[ind++] = arr[right++];
        }

        for(int i=0, j=low; i<temp.length;  i++, j++){
            arr[j]=temp[i];
        }

    }

    public static void divide(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;

        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
}
